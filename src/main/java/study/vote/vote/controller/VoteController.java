package study.vote.vote.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.vote.vote.dto.req.CreateVoteReqDto;
import study.vote.vote.service.VoteService;

@RestController
@RequestMapping(value = "/vote")
@RequiredArgsConstructor
@Slf4j
public class VoteController {
    private final VoteService voteService;

    @PostMapping
    public void createVote(@Valid @RequestBody CreateVoteReqDto dto) {
        voteService.createVote(dto);
    }
}
