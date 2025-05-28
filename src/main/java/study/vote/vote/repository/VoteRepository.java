package study.vote.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.vote.vote.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
