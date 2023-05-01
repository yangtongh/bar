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
    public List<Member> select(int id){
        List<Member> list = memberService.select(id);
        return list;
    }

    @PostMapping("/add")
    public int add(@RequestBody Member member){
        int add = memberService.add(member);
        System.out.println("受影响的行数"+add);
        return add;
    }
}
