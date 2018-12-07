package com.xdd.naka.xddnakabosseurekaclient2;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @author Jeason.Law
 * @date 2018-11-2010:24
 */

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

/**
 *@Author: Jeason.Law
 *@Date:2018-11-20 10:24
 *@Version: 1.0
 *@Description:
 **/
public class Test {
    public static void main(String[] args){
        BigDecimal c=new BigDecimal(20);
        Iterable<HashMap> iterable;
        Map<String,String> map=new HashMap<>();
        ConcurrentMap<String,String> concurrentMap;
        LinkedList<String> linkedList;


        for (int i=1;i<=c.intValue();i++){
            System.out.println(i+":的阶乘----->:"+getNumberJX(new BigDecimal(i)));
        }
//        int n = c - 1;
//           n=1;
//        System.out.println((n>>1));
//        System.out.println((n>>>1));
//        System.out.println((n<<30));
//
//        List <String> list =new ArrayList<>();

//        System.out.printf("----->:"+getNumberJX(c));

    }


    static  BigDecimal getNumberJX(BigDecimal x){
        if(x.subtract(new BigDecimal(1)).compareTo(new BigDecimal(0)) <=0){
            return new BigDecimal(1);
        }else {
            return x.multiply(getNumberJX(x.subtract(new BigDecimal(1))));
        }
    }
}
