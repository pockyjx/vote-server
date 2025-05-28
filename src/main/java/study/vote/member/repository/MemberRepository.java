package study.vote.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.vote.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
