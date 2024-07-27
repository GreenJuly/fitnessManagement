package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "locker")
public class LockerEntity {

    @Id
    @Column(name = "locker_id", nullable = false)
    private Integer locker_id;

    @OneToOne
    @JoinColumn(name = "member_id")
    private MemberEntity member_id;

    @Column(name = "locker_num")
    private Integer locker_num;
}
