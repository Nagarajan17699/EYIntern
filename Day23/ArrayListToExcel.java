/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Nagarajan
 */
public class ArrayListToExcel implements Generator {
    
    public void create(ArrayList<BuyingList> al)
    {
        CreateExcel ce = new CreateExcel();
        ce.createExcel(al);
    }

}

interface XMLtoExcel 
{
    public void createExcel(ArrayList<BuyingList> al);
}

class CreateExcel implements XMLtoExcel
{

    @Override
    public void createExcel(ArrayList<BuyingList> al) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet(" Billing Info ");
        XSSFRow row = null;
        
        int cellid = 0, rowid = 0;
        int merge = -1;
        row = spreadsheet.createRow(rowid++);
        Cell cell = row.createCell(cellid++);

        spreadsheet.addMergedRegion(new CellRangeAddress(0, 0, ++merge, merge += 2));
        cell.setCellValue("Company Name: Apple Retails");
        cell = row.createCell(merge + 1);
        spreadsheet.addMergedRegion(new CellRangeAddress(0, 0, ++merge, merge += 2));
        cell.setCellValue("GST Number : 12314245324");
        cell = row.createCell(merge + 1);
        spreadsheet.addMergedRegion(new CellRangeAddress(0, 0, ++merge, merge += 2));
        cell.setCellValue("Date: "+new Date().getDate()+"/"+new Date().getMonth()+"/"+new Date().getYear());
        
        for(int i=0;i<al.size();i++)
        {
            cellid = 0;
            row = spreadsheet.createRow(rowid++);
            cell = row.createCell(cellid++);
            
            BuyingList cd = al.get(i);
            cell.setCellValue(cd.getInvno());
            
            cell = row.createCell(cellid++);
            cell.setCellValue(cd.getItemno());
            
            cell = row.createCell(cellid++);
            cell.setCellValue(cd.getQuantity());
                    
            cell = row.createCell(cellid++);
            cell.setCellValue(cd.getPrice());
          
        }
        
        try {
            FileOutputStream fs = new FileOutputStream("d:/NetBeans Project/InternExercise/src/Day23/"+"invoice.xlsx");
            workbook.write(fs);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}