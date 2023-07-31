package hello.core.member;

//MemberService 구현 클래트
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    //AppConfig에서 쓰려구
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        //Member 개체를 가져와서 MemberRepository의 save 메서드에 전달
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        //memberId를 취하고 MemberRepository를 사용하여 해당 Member를 찾아 반환
        return memberRepository.findById(memberId);
    }
}