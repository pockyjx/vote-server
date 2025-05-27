package study.vote.vote.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import study.vote.member.entity.Member;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vote_no")
    private Vote vote;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_no")
    private OptionList option;

    private LocalDateTime votedAt;

    @Builder
    public participant(Long no, Member member, Vote vote, OptionList option, LocalDateTime votedAt) {
        this.no = no;
        this.member = member;
        this.vote = vote;
        this.option = option;
        this.votedAt = votedAt;
    }
}
