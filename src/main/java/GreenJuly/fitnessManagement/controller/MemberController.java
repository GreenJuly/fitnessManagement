package GreenJuly.fitnessManagement.controller;

import GreenJuly.fitnessManagement.entity.MemberEntity;
import GreenJuly.fitnessManagement.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("")
    public ResponseEntity signUpMember(@RequestBody MemberEntity member) {
        try {
            memberService.addMember(member);
            return ResponseEntity.ok(member);
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @GetMapping("")
    public ResponseEntity searchMember(@RequestBody MemberEntity member) {
        try {
            MemberEntity searchResult = memberService.searchMember(member);
            return ResponseEntity.ok().body(searchResult);
        } catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
