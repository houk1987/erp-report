package com.xxzx.erpreport.easyexcel;

import com.alibaba.excel.event.WriteHandler;
import org.apache.poi.ss.usermodel.*;

class CustomWriterHandler implements WriteHandler {

    private  CellStyle cellStyle;
    @Override
    public void sheet(int i, Sheet sheet) {

    }

    @Override
    public void row(int i, Row row) {

    }

    @Override
    public void cell(int i, Cell cell) {
        cell.getRow().getCell(i).setCellStyle(this.getCellStyle(cell.getSheet().getWorkbook()));
    }

    private  CellStyle getCellStyle( Workbook workbook){
        if(this.cellStyle==null){
            this.cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HorizontalAlignment.CENTER);
            cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            short s = 1;
            cellStyle.setFillBackgroundColor(s);
        }
        return this.cellStyle;
    }
}
