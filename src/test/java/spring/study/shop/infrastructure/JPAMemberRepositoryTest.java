package spring.study.shop.infrastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import spring.study.shop.domain.entity.Member;
import spring.study.shop.domain.repository.MemberRepository;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class JPAMemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    void save() {
        // given
        Member member = new Member("test_member");

        // when
        Long savedId = memberRepository.save(member);

        // then
        assertThat(memberRepository.find(savedId)).isEqualTo(member);
    }
}