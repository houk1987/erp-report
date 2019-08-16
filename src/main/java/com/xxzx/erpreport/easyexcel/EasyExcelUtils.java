package com.xxzx.erpreport.easyexcel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.xxzx.erpreport.domain.UserInfo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.List;

public class EasyExcelUtils {

    public static final void exportExcel(OutputStream out, List<? extends BaseRowModel> data,Class cl)throws IOException {
        CustomWriterHandler writerHandler = new CustomWriterHandler();
        ExcelWriter writer = EasyExcelFactory.getWriterWithTempAndHandler(null,out, ExcelTypeEnum.XLSX,true,writerHandler);
        if(writer==null){
            return;
        }
        Sheet sheet = new Sheet(1,3,cl);
        sheet.setAutoWidth(true);
        sheet.setSheetName("我的表格");
        writer.write(data,sheet);
        writer.finish();
        out.close();
    }
}
