package GreenJuly.fitnessManagement.service;

import GreenJuly.fitnessManagement.entity.MemberEntity;
import GreenJuly.fitnessManagement.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
