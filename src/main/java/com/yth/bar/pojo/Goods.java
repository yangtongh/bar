package com.yth.bar.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private int sno;
    private String goodsname;
    private String type;
    private String numbers;
    private String price;
    private String birthday;
    private String address;
    private String handle;

}
