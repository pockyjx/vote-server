package study.vote.vote.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.vote.member.repository.MemberRepository;
import study.vote.vote.dto.req.CreateVoteReqDto;
import study.vote.vote.dto.req.SubmitVoteReqDto;
import study.vote.vote.entity.OptionList;
import study.vote.vote.entity.Participant;
import study.vote.vote.entity.Vote;
import study.vote.vote.repository.OptionListRepository;
import study.vote.vote.repository.ParticipantRepository;
import study.vote.vote.repository.VoteRepository;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class VoteServiceImpl implements VoteService{
    private final MemberRepository memberRepository;
    private final VoteRepository voteRepository;
    private final OptionListRepository optionListRepository;
    private final ParticipantRepository participantRepository;

    @Override
    public void createVote(CreateVoteReqDto dto) {

        // 투표 글 저장
        Vote vote = voteRepository.save(Vote.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .isOpen(dto.isOpen())
                .expiration(dto.getExpiration())
                .createdAt(LocalDateTime.now())
                .maxChoice(dto.getMaxChoice())
                .build()
        );

        log.info("vote no: {}", vote.getNo());

        // 투표 옵션 저장
        dto.getOptions().forEach(
                s -> {
                    optionListRepository.save(OptionList.builder()
                            .vote(vote)
                            .count(0)
                            .value(s)
                            .build()
                    );
                }
        );
    }

    @Override
    public void submitVote(SubmitVoteReqDto dto) {

        dto.getOptions().forEach(
                no -> {
                    participantRepository.save(Participant.builder()
                            .vote(voteRepository.getReferenceById(dto.getVoteId()))
                            .option(optionListRepository.getReferenceById(no))
//                            .member(memberRepository.getReferenceById(dto.getMemberId()))
                            .votedAt(LocalDateTime.now())
                            .build()
                    );
                }
        );
    }
}
