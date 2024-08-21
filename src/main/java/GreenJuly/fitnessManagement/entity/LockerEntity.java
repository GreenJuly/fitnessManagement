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
    @Column(name = "locker_id", nullable = false)
    private int lockerId;

    private int lockerNum;
//    주 테이블에 해당하는 클래스를 참조 필드로 작성
//    @OneToOne(mappedBy = "반대쪽 매핑의 필드 이름값")
//    mappedBy 속성은 양방향 매핑일 때 사용, 연관관계의 주인을 설정하기 위함

//    @OneToOne(mappedBy = "lockerId")
//    private MemberEntity memberId;


}
