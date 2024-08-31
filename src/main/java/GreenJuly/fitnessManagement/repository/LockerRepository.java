package GreenJuly.fitnessManagement.repository;

import GreenJuly.fitnessManagement.entity.LockerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerRepository extends JpaRepository<LockerEntity, Integer>{
    LockerEntity findByLockerId(int lockerId);
}
