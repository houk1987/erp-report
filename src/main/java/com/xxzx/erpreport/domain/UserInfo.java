package com.xxzx.erpreport.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class UserInfo extends BaseRowModel {

    @ExcelProperty(value = "姓名",index = 0)
    private String userName;

    @ExcelProperty(value ="年龄",index = 1)
    private int age;
    
    public UserInfo(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
