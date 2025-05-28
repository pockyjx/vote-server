package study.vote.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import study.vote.vote.entity.Vote;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    @Query("select v from Vote v join fetch v.member")
    List<Vote> findAllWithMember();
}
