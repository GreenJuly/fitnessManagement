package GreenJuly.fitnessManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "sales")
public class SalesEntity {

    @Id
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
