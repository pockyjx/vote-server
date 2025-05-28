package study.vote.vote.service;

import study.vote.vote.dto.req.CreateVoteReqDto;

public interface VoteService {
    void createVote(CreateVoteReqDto dto);
}
