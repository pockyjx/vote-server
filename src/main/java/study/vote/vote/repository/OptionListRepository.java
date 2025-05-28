package study.vote.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.vote.vote.entity.OptionList;

import java.util.List;

public interface OptionListRepository extends JpaRepository<OptionList, Long> {
    @Query("select ol from OptionList ol join fetch ol.vote where ol.vote.no = :voteNo")
    List<OptionList> findByVoteNo(@Param("voteNo") Long voteNo);
}
