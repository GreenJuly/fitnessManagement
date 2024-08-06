package GreenJuly.fitnessManagement.service;

import GreenJuly.fitnessManagement.entity.MemberEntity;
import GreenJuly.fitnessManagement.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public MemberEntity addMember(MemberEntity member) {
        return memberRepository.save(member);
    }

    public MemberEntity searchMember(MemberEntity member) {
        return memberRepository.findByName(member.getName());
    }

    @Transactional
    public void updateMember(int id) {
        MemberEntity member =memberRepository.getOne(id);
        member.setName(member.getName());
    }

    public void deleteMember(int id) {
        memberRepository.deleteById(id);
    }
}

