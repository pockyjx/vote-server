package study.vote.vote.service;

import study.vote.vote.dto.req.CreateVoteReqDto;
import study.vote.vote.dto.req.SubmitVoteReqDto;
import study.vote.vote.dto.resp.VoteContentRespDto;
import study.vote.vote.dto.resp.VoteListRespDto;

import java.util.List;

public interface VoteService {
    void createVote(CreateVoteReqDto dto);
    void submitVote(SubmitVoteReqDto dto);
    List<VoteListRespDto> getVoteList();
    VoteContentRespDto getVoteContent(Long voteId);
}
