package com.yth.bar.service;

import com.yth.bar.pojo.Member;

import java.util.List;

public interface MemberService {
    List<Member> select(int id);

    int add(Member member);
}
