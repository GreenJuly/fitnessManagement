package GreenJuly.fitnessManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "sales")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sales_id", nullable = false)
    private int sales_id;

    @Column(name = "member_id")
    private int member_id;

    @Column(name = "membership")
    private String membership;

    @Column(name = "payment")
    private Boolean payment;

    @Column(name = "price")
    private Integer price;

    @Column(name = "payment_date")
    private Date payment_date;
}
