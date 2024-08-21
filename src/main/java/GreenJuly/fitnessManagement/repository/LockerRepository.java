package GreenJuly.fitnessManagement.repository;

import GreenJuly.fitnessManagement.entity.LockerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LockerRepository extends JpaRepository<LockerEntity, Integer>{
    LockerEntity findByLockerId(int lockerId);
}
