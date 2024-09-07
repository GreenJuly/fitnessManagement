package GreenJuly.fitnessManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "sales")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "salesId", nullable = false)
    private int salesId;

    @Column(name = "memberId")
    private Integer memberId;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "lockerNum", nullable = true)
//    @Column(name = "lockerNum")
    private LockerEntity lockerNum;

    @Column(name = "membership")
    private String membership;

    @Column(name = "payment")
    private Boolean payment;

    @Column(name = "price")
    private Integer price;

    @Column(name = "payment_date")
    private LocalDate paymentDate;
}
