package com.yth.bar.mapper;

import com.github.pagehelper.Page;
import com.yth.bar.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> select(Integer pageNum,Integer pageSize);

    int add(Member member);

    int delete(int id);

    int update(int id);

    List<Member> selectByCondition(String membername,String sex,Integer pageNum,Integer pageSize);



}
