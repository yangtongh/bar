package com.yth.bar.mapper;

import com.yth.bar.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> select(int id);

    int add(Member member);
}
