package com.yth.bar.controller;

import com.yth.bar.pojo.Member;
import com.yth.bar.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/member")
@ResponseBody
public class memberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/select")
    public List<Member> select(@RequestParam Integer pageNum,Integer pageSize){
        List<Member> select = memberService.select(pageNum,pageSize);
        System.out.println(select);
        return select;
    }

    @PostMapping("/add")
    public int add(@RequestBody Member member){
        int add = memberService.add(member);
        System.out.println("受影响的行数"+add);
        return add;
    }

    @PostMapping("/delete")
    public String delete(int id){
        memberService.delete(id);
        return "删除成功";
    }

    @PostMapping("/update")
    public String update(int id){
        memberService.update(id);
        return "修改成功";
    }

    @PostMapping("/selectByCondition")
    public List<Member> selectByCondition(@RequestParam String membername,@RequestParam String sex,@RequestParam Integer pageNum,Integer pageSize){
        List<Member> list = memberService.selectByCondition(membername,sex,pageNum,pageSize);
        return list;
    }
}
