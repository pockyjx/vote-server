package study.vote.vote.service;

import study.vote.vote.dto.req.CreateVoteReqDto;
import study.vote.vote.dto.req.SubmitVoteReqDto;

public interface VoteService {
    void createVote(CreateVoteReqDto dto);
    void submitVote(SubmitVoteReqDto dto);
}
