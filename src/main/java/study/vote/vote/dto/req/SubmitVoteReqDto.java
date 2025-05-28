package study.vote.vote.dto.req;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SubmitVoteReqDto {
    private Long memberId;
    private Long voteId;
    private List<Long> options = new ArrayList<>();
}
