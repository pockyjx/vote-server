package study.vote.vote.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import study.vote.member.entity.Member;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 50, nullable = false)
    private String title;

    @Lob
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    private Member member;

    @Column(updatable = false)
    @ColumnDefault("1")
    private int maxChoice;

    @Column(columnDefinition = "BOOLEAN")
    private boolean isOpen;

    @Column(updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime expiration;

    @Builder
    public Vote(Long no, String title, String content, Member member,
                int maxChoice, boolean isOpen, LocalDateTime createdAt, LocalDateTime expiration) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.member = member;
        this.maxChoice = maxChoice;
        this.isOpen = isOpen;
        this.createdAt = createdAt;
        this.expiration = expiration;
    }
}
