package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO(){
        this.memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1,"user01","pass01","홍길동"));
        memberMap.put(2, new MemberDTO(1,"user02","pass02","홍길동2"));
    }

    public MemberDTO selectMember(int seq){
        return memberMap.get(seq);
    }

    public  boolean insertMember(MemberDTO member){
        int before = memberMap.size();
        memberMap.put(member.getSequence(),member);

        return memberMap.size() > before ? true : false;
    }
}
