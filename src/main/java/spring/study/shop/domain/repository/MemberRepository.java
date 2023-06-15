package spring.study.shop.domain.repository;

import spring.study.shop.domain.entity.Member;

public interface MemberRepository {
    Long save(Member member);
    Member find(Long id);
}
