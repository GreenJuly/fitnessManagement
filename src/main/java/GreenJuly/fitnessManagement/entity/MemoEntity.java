package GreenJuly.fitnessManagement.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "memo")
public class MemoEntity {

    @Id
    @Column(name = "memo_id")
    private int memoId;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }
}
