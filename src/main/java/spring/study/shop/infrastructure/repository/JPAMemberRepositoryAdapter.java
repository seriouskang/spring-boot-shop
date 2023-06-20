package spring.study.shop.infrastructure.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import spring.study.shop.domain.entity.Member;
import spring.study.shop.domain.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JPAMemberRepositoryAdapter implements MemberRepository {
    private final JPAMemberRepository jpaMemberRepository;

    @Override
    public void save(Member member) {
        jpaMemberRepository.save(member);
    }

    @Override
    public Optional<Member> find(Long id) {
        return jpaMemberRepository.findById(id);
    }

    @Override
    public List<Member> findAll() {
        return jpaMemberRepository.findAll();
    }

    @Override
    public List<Member> findByName(String name) {
        return jpaMemberRepository.findByName(name);
    }
}
