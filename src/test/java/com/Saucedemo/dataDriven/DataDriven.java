package com.Saucedemo.dataDriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataDriven {

    public Object[][] readLoginData(String filePath) throws IOException {
        File src = new File(filePath);
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
        Object[][] data = new Object[rowCount][2];

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            Cell usernameCell = row.getCell(0);
            Cell passwordCell = row.getCell(1);

            String username = usernameCell.getStringCellValue();
            String password = passwordCell.getStringCellValue();

            data[i][0] = username;
            data[i][1] = password;
        }

        workbook.close();
        fis.close();

        return data;
    }
}
