package com.yth.bar.service.impl;

import com.github.pagehelper.PageHelper;
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
    public List<Member> select(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Member> select = memberMapper.select(pageNum, pageSize);
        return select;
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

    @Override
    public int delete(int id) {
        int delete = memberMapper.delete(id);
        if(delete!=0){
            System.out.println("删除成功："+delete);
        }     else{
            System.out.println("删除失败");
        }
        return delete;
    }

    @Override
    public int update(int id) {
        int update = memberMapper.update(id);
        if(update!=0){
            System.out.println("删除成功："+update);
        }     else{
            System.out.println("删除失败");
        }
        return update;
    }

    @Override
    public List<Member> selectByCondition(String membername, String sex,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Member> list = memberMapper.selectByCondition(membername, sex,pageNum,pageSize);
        return list;
    }
}
