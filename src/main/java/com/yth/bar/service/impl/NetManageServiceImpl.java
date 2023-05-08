package com.yth.bar.service.impl;


import com.github.pagehelper.PageHelper;
import com.yth.bar.mapper.NetManageMapper;
import com.yth.bar.pojo.Member;
import com.yth.bar.pojo.NetManage;
import com.yth.bar.service.NetManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NetManageServiceImpl implements NetManageService {

    @Autowired
    private NetManageMapper NetManageMapper;
    @Override
    public List<NetManage> select(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<NetManage> select = NetManageMapper.select(pageNum, pageSize);
        return select;
    }

    @Override
    public int add(NetManage NetManage) {
        int add = NetManageMapper.add(NetManage);
        return add;
    }

    @Override
    public int delete(int id) {
        int delete = NetManageMapper.delete(id);
        return delete;
    }

    @Override
    public int update(int id) {
        int update = NetManageMapper.update(id);
        return update;
    }

    @Override
    public List<Member> selectByCondition(String managename, String account, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Member> list = NetManageMapper.selectByCondition(managename, account, pageNum, pageSize);
        return list;
    }
}
