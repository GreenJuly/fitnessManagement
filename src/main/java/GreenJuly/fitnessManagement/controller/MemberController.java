package GreenJuly.fitnessManagement.controller;

import GreenJuly.fitnessManagement.entity.MemberEntity;
import GreenJuly.fitnessManagement.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    //회원등록
    @PostMapping("")
    public ResponseEntity signUpMember(@RequestBody MemberEntity member) {
        try {
            log.info("MemberController.signUpMember: member={}", member);
            memberService.addMember(member);
            return ResponseEntity.ok(member);
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    //회원조회 -전체
    @GetMapping("")
    public ResponseEntity searchMember(@RequestBody MemberEntity member) {
        try {
            List<MemberEntity> searchAllMembers = memberService.getAllMembers(member);
            return ResponseEntity.ok().body(searchAllMembers);
        } catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    //회원조회 -이름
    @GetMapping("/name")
    public ResponseEntity searchMemberName(@RequestParam String name) {
        try {
            List<MemberEntity> members = memberService.searchMemberName(name);
            return ResponseEntity.ok().body(members);
        } catch(Exception e){
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    //회원조회 -사물함
    @GetMapping("/locker")
    public ResponseEntity searchMemberLocker(@RequestParam int lockerId) {
        try {
            MemberEntity member = memberService.searchLockerId(lockerId);
            return ResponseEntity.ok().body(member);
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    //회원조회 -기간 -만료
    @GetMapping("/endDate")
    public ResponseEntity searchMemberEndDate(@RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        try {
            List<MemberEntity> member = memberService.searchEndDate(endDate);
            return ResponseEntity.ok().body(member);
        } catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    //회원조회 -기간 -날짜
    @GetMapping("/date")
    public ResponseEntity searchMemberDate(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
                                           @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        try {
            List<MemberEntity> members = memberService.searchDate(startDate, endDate);
            return ResponseEntity.ok().body(members);
        } catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    //회원정보수정
    @PutMapping("/{id}")
    public ResponseEntity updateMember(@PathVariable int id, @RequestBody MemberEntity member) {
        try {
            log.info(member.toString());
            MemberEntity updatedMember = memberService.updateMember(id, member);
            return ResponseEntity.ok().body(updatedMember);
        } catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

//    //회원삭제
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMember(@PathVariable int id) {
        try {
            memberService.deleteMember(id);
            return ResponseEntity.ok().body("Member deleted successfully");
        }catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }
}
