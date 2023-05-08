package com.yth.bar.mapper;

import com.yth.bar.pojo.Member;
import com.yth.bar.pojo.NetManage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NetManageMapper {
    List<NetManage> select(Integer pageNum, Integer pageSize);

    int add(NetManage NetManage);

    int delete(int id);

    int update(int id);

    List<Member> selectByCondition(String managename,String account,Integer pageNum,Integer pageSize);

}
