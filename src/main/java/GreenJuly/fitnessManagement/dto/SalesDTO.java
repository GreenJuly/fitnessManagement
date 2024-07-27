package GreenJuly.fitnessManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalesDTO {

    private int sales_id;
    private int member_id;
    private String membership;
    private Boolean payment;
    private int price;
    private Date payment_date;
}
