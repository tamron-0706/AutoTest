package com.itheima_04;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String,String>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        System.out.println(map);


    }
}
