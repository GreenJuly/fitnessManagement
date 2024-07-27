package GreenJuly.fitnessManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    private int member_id;
    private String name;
    private String phone;
    private Date birth;
    private boolean gender;
    private String membership;
    private boolean laundry;
    private boolean payment;
    private Date startDate;
    private Date endDate;
    private String member_img;
    private String personal_memo;
}
