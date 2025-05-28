package study.vote.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.vote.vote.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
