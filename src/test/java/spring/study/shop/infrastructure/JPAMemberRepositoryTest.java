package spring.study.shop.infrastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import spring.study.shop.domain.entity.Member;
import spring.study.shop.domain.repository.MemberRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class JPAMemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;
    @PersistenceContext
    EntityManager entityManager;

    @Test
    @Transactional
    void save_and_find() {
        // given
        Member member = new Member("test_member");

        // when
        Long savedId = memberRepository.save(member);
        entityManager.flush();
        entityManager.clear();

        // then
        assertThat(memberRepository.find(savedId)).isEqualTo(member);
    }
}