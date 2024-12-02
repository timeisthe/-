package com.toplab.task2;

import com.toplab.task2.mylist.impl.List;

import java.util.Arrays;
import java.util.Collection;

/**
 * @Author: Medivh
 * @Date: 2023/11/11 18:01
 * @Description:
 */
public class TestList {//extends com.toplab.task2.mylist.impl.List {

    public static void main(String[] args) {
        List list = new List();
        list.Initialize(10);//初始化
        //测试set方法和get方法
        for (int i = 0; i < 10; i++) {
            list.set(i, "导入元素"+i);
            System.out.println(list.get(i));
        }
        //测试remove
        System.out.println(list.remove("导入元素5"));//true
        //测试contains
        System.out.println(list.contains("导入元素5"));//false
        //测试containsAll
         Object [] test = {"导入元素1","导入元素2","导入元素3"};
         Object [] test1 = {"导入元素1","导入元素2","导入元素三"};
        System.out.println(list.containsAll(test));//true
        System.out.println(list.containsAll(test1));//false
        //测size
        System.out.println(list.size());//10-1
        //测toArray
        System.out.println(list.toArray() == list.getArr());//false
        System.out.println(Arrays.equals(list.toArray(),list.getArr()));//true

        //测add
        System.out.println(list.add("导入元素5"));//false
        //测addAll
        List list1 = new List();
        list1.Initialize(10);//初始化
        for (int i = 0; i < 5; i++) {
            list1.set(i, "1导入元素"+i);
            System.out.println(list1.get(i));
        }
        Object [] test3  = {"1导入元素5","1导入元素1"};
        System.out.println(list1.addAll(test3));//true
        //测indexOf
        System.out.println(list1.indexOf("1导入元素1"));//1
        //测lastIndexOf
        System.out.println(list1.lastIndexOf("1导入元素1"));//6
        //测removeAll
        System.out.println(list1.removeAll(test3));//true
        //测clear
        list1.clear();
        // 测isEmpty
        System.out.println(list1.isEmpty());//true

        //测equals和toString
        List list3 = new List();
        List list5 = new List();
        list3.Initialize(1);
        list5.Initialize(1);
        System.out.println(list3.add("判断是否相同"));
        System.out.println(list.toString());
        System.out.println(list5.add("判断是否相同"));
        System.out.println(list5.toString());
        System.out.println(list5.equals(list3));

    }
}
