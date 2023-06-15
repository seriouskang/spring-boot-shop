package spring.study.shop.infrastructure;

import org.springframework.stereotype.Repository;
import spring.study.shop.domain.entity.Member;
import spring.study.shop.domain.repository.MemberRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JPAMemberRepository implements MemberRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Long save(Member member) {
        entityManager.persist(member);
        return member.getId();
    }

    @Override
    public Member find(Long id) {
        return entityManager.find(Member.class, id);
    }
}
