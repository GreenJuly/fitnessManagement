package GreenJuly.fitnessManagement.repository;

import GreenJuly.fitnessManagement.entity.LockerEntity;
import GreenJuly.fitnessManagement.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
    MemberEntity findByName(String name);
    MemberEntity findByMemberId(int id);
    MemberEntity findByLockerId(LockerEntity locker);
    MemberEntity findByEndDate(LocalDate endDate);

    List<MemberEntity> findAllByEndDateBetween(LocalDate startDate, LocalDate endDate);
    List<MemberEntity> findAllByName(String name);
}