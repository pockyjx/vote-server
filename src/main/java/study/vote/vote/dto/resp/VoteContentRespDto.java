package study.vote.vote.dto.resp;

import lombok.Builder;
import lombok.Getter;
import study.vote.vote.entity.Participant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class VoteContentRespDto {
    private String title;
    private String content;
    private Long memberId;
    private LocalDateTime createAt;
    private LocalDate expiration;
    private List<OptionDto> options = new ArrayList<>();
    private List<Participant> participants = new ArrayList<>();

    @Builder
    public VoteContentRespDto(String title, String content, Long memberId, List<OptionDto> options,
                              List<Participant> participants, LocalDateTime createAt, LocalDate expiration) {
        this.title = title;
        this.content = content;
        this.memberId = memberId;
        this.options = options;
        this.participants = participants;
        this.createAt = createAt;
        this.expiration = expiration;
    }
}