package spring.study.shop.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import spring.study.shop.domain.entity.Member;

import java.util.List;

public interface JPAMemberRepository extends JpaRepository<Member, Long> {
    @Query("select m from Member m where m.name = :name")
    List<Member> findByName(@Param("name") String name);
}
