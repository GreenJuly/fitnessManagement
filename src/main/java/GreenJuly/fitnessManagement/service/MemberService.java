package GreenJuly.fitnessManagement.service;

import GreenJuly.fitnessManagement.entity.LockerEntity;
import GreenJuly.fitnessManagement.entity.MemberEntity;
import GreenJuly.fitnessManagement.repository.LockerRepository;
import GreenJuly.fitnessManagement.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private LockerRepository lockerRepository;

    //회원등록
    public MemberEntity addMember(MemberEntity member) {
        return memberRepository.save(member);
    }

//    //회원조회 -전체 *원하는 컬럼만 가져오기에 대해 추가로 알아보기
    public List<MemberEntity> getAllMembers(MemberEntity member) {
        return memberRepository.findAll();
    }

    //회원조회 -이름
    public List<MemberEntity> searchMemberName(String memberName) {
        return memberRepository.findAllByName(memberName);
    }

    //회원조회 -사물함
    public MemberEntity searchLockerId(int lockerId) {
        LockerEntity locker = lockerRepository.findByLockerId(lockerId);
        return memberRepository.findByLockerId(locker);
    }

    //회원조회 -기간 -만료
    public MemberEntity searchEndDate(LocalDate endDate) {
        return memberRepository.findByEndDate(endDate);
    }

    //회원조회 -기간 -날짜

    //회원정보수정
    @Transactional
    public MemberEntity updateMember(int id, MemberEntity updatedMember) {
        MemberEntity member = memberRepository.findByMemberId(id);
        member.setName(updatedMember.getName());
        member.setLockerId(updatedMember.getLockerId());
        member.setPhone(updatedMember.getPhone());
        member.setStartDate(updatedMember.getStartDate());
        member.setEndDate(updatedMember.getEndDate());
        member.setLaundry(updatedMember.getLaundry());
        member.setMembership(updatedMember.getMembership());
        member.setPayment(updatedMember.getPayment());
        member.setPersonal_memo(updatedMember.getPersonal_memo());
        //이미지변경
        return member;
    }

    //회원삭제
    public void deleteMember(int id) {
        memberRepository.deleteById(id);
    }
}

