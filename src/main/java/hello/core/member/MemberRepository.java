package hello.core.member;

//회원 저장소의 역할을 정의
public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}