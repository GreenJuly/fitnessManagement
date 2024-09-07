package GreenJuly.fitnessManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalesDTO {

    private int salesId;
    private int memberId;
    private String name;
    private int lockerNum;
    private String membership;
    private Boolean payment;
    private int price;
    private LocalDate payment_date;
}
