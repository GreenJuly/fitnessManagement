package GreenJuly.fitnessManagement.controller;

import GreenJuly.fitnessManagement.entity.LockerEntity;
import GreenJuly.fitnessManagement.service.LockerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/locker")
public class LockerController {

    @Autowired
    private LockerService lockerService;

    @PostMapping("")
    public ResponseEntity addLocker(@RequestBody LockerEntity locker) {
        try {
            log.info("Add lockerId: {}", locker.getLockerId());
//            log.info("Add memberId: {}", locker.getMemberId());
//            log.info("Add lockerNum: {}", locker.getLockerNum());
            lockerService.addLocker(locker);
            return ResponseEntity.ok(locker);
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }
}
