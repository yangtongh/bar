package com.yth.bar.controller;

import com.yth.bar.pojo.NetManage;
import com.yth.bar.service.NetManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/net")
public class NetManageController {
    @Autowired
    private NetManageService NetManageService;
    
    @PostMapping("/select")
    public List<NetManage> select(Integer pageNum,Integer pageSize){
        List<NetManage> select = NetManageService.select(pageNum, pageSize);
        return select;
    }

    @PostMapping("/add")
    public int add(NetManage netManage){
        int add = NetManageService.add(netManage);
        return add;
    }

    @PostMapping("/delete")
    public int delete(int id){
        int delete = NetManageService.delete(id);
        return delete;
    }

    @PostMapping("/update")
    public int update(int id){
        int update = NetManageService.update(id);
        return update;
    }
    @PostMapping("/selectByCondition")
    public List<NetManage> selectByCondition(@RequestParam Integer pageNum,@RequestParam Integer pageSize,@RequestParam String account, String managename ){
        NetManageService.selectByCondition(managename, account, pageNum, pageSize);
        return null;
    }
}
