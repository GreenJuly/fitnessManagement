package GreenJuly.fitnessManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "locker")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LockerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "locker_id", nullable = false)
    private Integer locker_id;

    @OneToOne
    @JoinColumn(name = "member_id")
    private MemberEntity member_id;

    @Column(name = "locker_num")
    private Integer locker_num;
}
