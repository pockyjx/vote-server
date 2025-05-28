package study.vote.vote.dto.resp;

import lombok.Getter;
import study.vote.vote.entity.Vote;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class VoteListRespDto {
    private Long voteNo;
    private String title;
    private String writer;
    private LocalDateTime createdAt;
    private LocalDate expiration;

    public VoteListRespDto(Vote vote) {
        this.voteNo = vote.getNo();
        this.title = vote.getTitle();
        this.writer = vote.getMember().getName();
        this.createdAt = vote.getCreatedAt();
        this.expiration = vote.getExpiration();
    }
}
