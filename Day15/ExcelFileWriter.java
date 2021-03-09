/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

/**
 *
 * @author Nagarajan
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriter {

    public static void main(String[] args) throws IOException {

        insertDetails();
    }

    public static void insertDetails() throws FileNotFoundException, IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet(" Billing Info ");
        XSSFRow row = null;
        int cellid = 0, rowid = 0;
        int merge = -1;
        row = spreadsheet.createRow(rowid++);
        Cell cell = row.createCell(cellid++);

        spreadsheet.addMergedRegion(new CellRangeAddress(0, 0, ++merge, merge += 2));
        cell.setCellValue("Cutomer Name: Nagarajan");
        cell = row.createCell(merge + 1);
        spreadsheet.addMergedRegion(new CellRangeAddress(0, 0, ++merge, merge += 2));
        cell.setCellValue("Bill Number : 12314");
        cell = row.createCell(merge + 1);
        spreadsheet.addMergedRegion(new CellRangeAddress(0, 0, ++merge, merge += 2));
        cell.setCellValue("Bill Date: "+new Date().getDate()+"/"+new Date().getMonth()+"/"+new Date().getYear());

        List<ExcelWriter> li = new ArrayList<>();

        li.add(new ExcelWriter(1, 20, 3, 20 * 3, "Dhaal"));
        li.add(new ExcelWriter(2, 40, 2, 40 * 2, "Rice"));

        Iterator it = li.iterator();
        int top = 0;
        cellid = 0;

        if (top == 0) {
            row = spreadsheet.createRow(rowid++);

            cell = row.createCell(cellid++);
            cell.setCellValue("S,No");
            cell = row.createCell(cellid++);
            cell.setCellValue("Name");
            cell = row.createCell(cellid++);
            cell.setCellValue("Price");
            cell = row.createCell(cellid++);
            cell.setCellValue("Quantity");
            cell = row.createCell(cellid++);
            cell.setCellValue("Amount");

            top++;
        }

        for (int i = 0; i < 2; i++) {
            cellid = 0;
            row = spreadsheet.createRow(rowid++);
            cell = row.createCell(cellid++);
            cell.setCellValue(li.get(i).sno);
            cell = row.createCell(cellid++);
            cell.setCellValue(li.get(i).item);
            cell = row.createCell(cellid++);
            cell.setCellValue(li.get(i).price);
            cell = row.createCell(cellid++);
            cell.setCellValue(li.get(i).quantity);
            cell = row.createCell(cellid++);
            cell.setCellValue(li.get(i).amount);
        }

        FileOutputStream out = new FileOutputStream(
                new File("d:/NetBeans Project/InternExercise/src/Day15/Writesheet.xlsx"));

        workbook.write(out);
        out.close();
    }

}

class ExcelWriter {

    String sno;
    String item;
    String unit, price, quantity, amount;

    ExcelWriter(int sno, int price, int quantity, int amount, String itemname) {
        this.sno = String.valueOf(sno);
        this.item = String.valueOf(itemname);
        this.price = String.valueOf(price);
        this.quantity = String.valueOf(quantity);
        this.amount = String.valueOf(amount);
    }

}
