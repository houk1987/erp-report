package com.xxzx.erpreport.easyexcel;

import com.xxzx.erpreport.domain.UserInfo;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EasyExcelUtilsTest {

    @Test
    public void exportExcel() {
        String path ="D:\\1.xlsx";
        int i=5;
        List<UserInfo> userInfoList = new ArrayList<>(i);
        while(i>0){
            userInfoList.add(new UserInfo("你好",1));
            i--;
        }

        try {
            EasyExcelUtils.exportExcel(new FileOutputStream(path),userInfoList,UserInfo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}