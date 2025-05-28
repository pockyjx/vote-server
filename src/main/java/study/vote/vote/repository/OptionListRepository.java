package study.vote.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.vote.vote.entity.OptionList;

public interface OptionListRepository extends JpaRepository<OptionList, Long> {
}
