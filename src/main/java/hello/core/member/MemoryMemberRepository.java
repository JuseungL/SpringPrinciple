package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
//MemberRepository 인터페이스를 구현하는 구현 클래스
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    //Long type의 key, Member type의 value
    //위에서 HashMap으로 생성한 store의 경우 일반적으로는 동시성 이슈를 방지하기 위해서 ConcurrentHashMap으로 생성하는 것이 바람직

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
        //put() 메서드는 맵에 키-값 쌍을 삽입하는 데 사용(member.getId()인 id가 key, member자체가 value)
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
        //주어진 키에 대한 값이 없으면 get()은 null을 반환
    }
}
