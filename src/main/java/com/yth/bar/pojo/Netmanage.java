package com.yth.bar.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NetManage {
    private  int id;
    private  String management;
    private  String sex;
    private  int age;
    private  String tel;
    private  String status;
    private  String notes;
    private  String handle;
}
