package com.yth.bar.service;

import com.yth.bar.pojo.Member;

import java.util.List;

public interface MemberService {
    List<Member> select(Integer pageNum,Integer pageSize);

    int add(Member member);

    int delete(int id);

    int update(int id);

    List<Member> selectByCondition(String membername,String sex,Integer pageNum,Integer pageSize);
}
