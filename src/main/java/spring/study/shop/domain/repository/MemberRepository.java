package spring.study.shop.domain.repository;

import spring.study.shop.domain.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    void save(Member member);
    Optional<Member> find(Long id);
    List<Member> findAll();
    List<Member> findByName(String name);
}
