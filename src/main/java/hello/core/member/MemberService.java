package hello.core.member;

//회원 서비스의 역할을 정의
public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);

}
