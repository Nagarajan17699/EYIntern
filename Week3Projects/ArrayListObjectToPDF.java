/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Projects;

import com.itextpdf.text.BaseColor;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Phrase;

/**
 *
 * @author Nagarajan
 */
public class ArrayListObjectToPDF {

    static ArrayList<CustomerDetails> alt;

    ArrayListObjectToPDF(ArrayList<CustomerDetails> alt) {
        this.alt = alt;
    }

    public static void main(String[] args) {
////        alt.add(new CustomerDetails("esfger","efwef","wefaerg","rtdh","rhdgf"));
//        createPDF(alt);
    }

    public void createPDF(ArrayList<CustomerDetails> al) {
        Document document = new Document();
        try {

            PdfWriter write = PdfWriter.getInstance(document, new FileOutputStream(FilePath.path + "customer.pdf"));
            document.open();
            document.setMargins(5.0f,5.0f,3.0f,1.0f);
            document.add(new Paragraph("Welcome to Customer Database \n"));
            
            Paragraph para = new Paragraph();
            float[] columnWidths = {1.5f, 2f, 4f, 1.5f, 1.5F};
            //para.setExtraParagraphSpace(2.0f);
            //para.
            PdfPTable table = new PdfPTable(columnWidths);
            table.setWidthPercentage(100f);
            Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
            insertCell(table, "Name", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Phone", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Email", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Amount", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Date", Element.ALIGN_LEFT, 1, bfBold12);
            table.setHeaderRows(1);

            insertCell(table, "", Element.ALIGN_LEFT, 5, bfBold12);

            for (int i = 0; i < al.size(); i++) {
                insertCell(table, al.get(i).name, Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).emailid, Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).phonenumber, Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).amount, Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).date, Element.ALIGN_LEFT, 1, bfBold12);
            }
            //table.setWidthPercentage(100f);
            para.add(table);
            document.add(para);
            document.close();
            write.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {

        PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
        cell.setHorizontalAlignment(align);
        cell.setColspan(colspan);
        if (text.trim().equalsIgnoreCase("")) {
            cell.setMinimumHeight(10f);
        }
        table.addCell(cell);

    }
}
    