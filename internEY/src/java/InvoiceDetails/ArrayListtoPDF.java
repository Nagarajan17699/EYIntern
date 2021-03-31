/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceDetails;

import java.io.FileOutputStream;
import java.util.ArrayList;




import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
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
import model.ItemDTO;

/**
 *
 * @author Nagarajan
 */
public class ArrayListtoPDF {

    static ArrayList<ItemDTO> alt;

    ArrayListtoPDF(ArrayList<ItemDTO> alt) {
        this.alt = alt;
    }

    public static void main(String[] args) {
////        alt.add(new CustomerDetails("esfger","efwef","wefaerg","rtdh","rhdgf"));
//        createPDF(alt);
    }

    public static void  createPDF(ArrayList<ItemDTO> al) {
        Document document = new Document();
        try {

            PdfWriter write = PdfWriter.getInstance(document, new FileOutputStream(FilePath.path + "customer.pdf"));
            document.open();
            document.setMargins(5.0f,5.0f,3.0f,1.0f);
            document.add(new Paragraph("Welcome \n"));
            document.add( Chunk.NEWLINE );
            document.add( Chunk.NEWLINE );
            
            Paragraph para = new Paragraph();
            float[] columnWidths = {1.5f, 2f, 4f, 1.5f,1.5f};
            //para.setExtraParagraphSpace(2.0f);
            //para.
            PdfPTable table = new PdfPTable(columnWidths);
            table.setWidthPercentage(100f);
            Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
            
            for (int i = 0; i < al.size(); i++) {
                insertCell(table, al.get(i).getName(), Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).getDescp(), Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).getPrice(), Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).getCatagory(), Element.ALIGN_LEFT, 1, bfBold12);
                insertCell(table, al.get(i).getQuantity(), Element.ALIGN_LEFT, 1, bfBold12);
                
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
    