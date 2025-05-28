package study.vote.vote.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import study.vote.vote.dto.req.CreateVoteReqDto;
import study.vote.vote.dto.req.SubmitVoteReqDto;
import study.vote.vote.dto.resp.VoteContentRespDto;
import study.vote.vote.dto.resp.VoteListRespDto;
import study.vote.vote.service.VoteService;

import java.util.List;

@RestController
@RequestMapping(value = "/vote")
@RequiredArgsConstructor
@Slf4j
public class VoteController {
    private final VoteService voteService;

    // 투표 등록
    @PostMapping
    public void createVote(@Valid @RequestBody CreateVoteReqDto dto) {
        voteService.createVote(dto);
    }

    // 투표 목록 조회
    @GetMapping
    public List<VoteListRespDto> getVoteList() {
        return voteService.getVoteList();
    }

    // 투표 조회
    @GetMapping("/{voteId}")
    public VoteContentRespDto getVoteContent(@PathVariable(value = "voteId") Long voteId) {
        return voteService.getVoteContent(voteId);
    }

    // 투표 참여
    @PostMapping("/submit")
    public void submitVote(@RequestBody SubmitVoteReqDto dto) {
        voteService.submitVote(dto);
    }
}
