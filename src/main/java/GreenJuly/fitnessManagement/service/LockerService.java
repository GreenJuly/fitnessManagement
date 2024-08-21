package GreenJuly.fitnessManagement.service;

import GreenJuly.fitnessManagement.entity.LockerEntity;
import GreenJuly.fitnessManagement.repository.LockerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LockerService {

    @Autowired
    private LockerRepository lockerRepository;

    //사물함등록
    public LockerEntity addLocker(LockerEntity locker) {
        return lockerRepository.save(locker);
    }
}
