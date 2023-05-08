package com.yth.bar.service;

import com.yth.bar.pojo.Member;
import com.yth.bar.pojo.NetManage;

import java.util.List;

public interface NetManageService {
    List<NetManage> select(Integer pageNum, Integer pageSize);

    int add(NetManage NetManage);

    int delete(int id);

    int update(int id);

    List<Member> selectByCondition(String managename, String account, Integer pageNum, Integer pageSize);
}
