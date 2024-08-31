package GreenJuly.fitnessManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "member")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_Id", nullable = false)
    private Integer memberId;

    // 주 테이블에 1:1 양방향
    @OneToOne
    @JoinColumn(name = "locker_id", nullable = true)
    private LockerEntity lockerId;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "phone", nullable = false, length = 15)
    private String phone;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "gender")
    private Boolean gender;

    @Column(name = "membership", length = 20)
    private String membership;

    @Column(name = "laundry")
    private Boolean laundry;

    @Column(name = "payment")
    private Boolean payment;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "member_img", length = 20)
    private String member_img;

    @Column(name = "personal_memo", length = 1000)
    private String personal_memo;

    // Getters and Setters
}
