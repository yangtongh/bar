package com.yth.bar.service.impl;

import com.yth.bar.mapper.MemberMapper;
import com.yth.bar.pojo.Member;
import com.yth.bar.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public List<Member> select(int id) {
        List<Member> list = memberMapper.select(id);
        System.out.println(list);
        return list;
    }

    @Override
    public int add(Member member) {
        int add = memberMapper.add(member);
        if(add!=0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
        return add;
    }
}
