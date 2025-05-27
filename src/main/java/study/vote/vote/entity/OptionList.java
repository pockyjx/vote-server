package study.vote.vote.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class OptionList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vote_no")
    private Vote vote;
    private String value;
    private int count;

    @Builder
    public OptionList(Long no, Vote vote, String value, int count) {
        this.no = no;
        this.vote = vote;
        this.value = value;
        this.count = count;
    }
}
