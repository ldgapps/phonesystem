// 
// Decompiled by Procyon v0.5.36
// 

package DB;

import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Anchor;
import javax.swing.JTable;
import com.itextpdf.text.BaseColor;
import java.util.ArrayList;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Chunk;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import java.io.File;
import com.itextpdf.text.Font;

public class ToPDF
{
    private static final Font chapterFont;
    private static final Font paragraphFont;
    private static final Font categoryFont;
    
    public void createPDF(final String pdfNewFile, final String texto) {
        try {
            new File(pdfNewFile);
            final Document document = new Document();
            try {
                PdfWriter.getInstance(document, (OutputStream)new FileOutputStream(pdfNewFile));
            }
            catch (FileNotFoundException fileNotFoundException) {
                System.out.println("No such file was found to generate the PDF (No se encontr\u00f3 el fichero para generar el pdf)" + fileNotFoundException);
            }
            document.open();
            document.addTitle("Sudilca Electronics");
            document.addSubject("Venta");
            document.addKeywords("Venta, PDF");
            document.addAuthor("Sudilca");
            document.addCreator("");
            final Chunk chunk = new Chunk("Venta", ToPDF.chapterFont);
            final Chapter chapter = new Chapter(new Paragraph(chunk), 1);
            chapter.setNumberDepth(0);
            chapter.add((Element)new Paragraph(texto, ToPDF.paragraphFont));
            document.add((Element)chapter);
            document.close();
        }
        catch (DocumentException documentException) {
            System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
        }
    }
    
    public void createPDF(final String pdfNewFile, final String cliente, final String ci, final ArrayList<String> product, final String fecha, final String total, final String factura) {
        try {
            new File(pdfNewFile);
            final Document document = new Document();
            try {
                PdfWriter.getInstance(document, (OutputStream)new FileOutputStream(pdfNewFile));
            }
            catch (FileNotFoundException fileNotFoundException) {
                System.out.println("No such file was found to generate the PDF (No se encontr\u00f3 el fichero para generar el pdf)" + fileNotFoundException);
            }
            document.open();
            document.addTitle("Sudilca Electronics");
            document.addSubject("Recibo");
            document.addKeywords("Recibo, PDF");
            document.addAuthor("Sudilca Electronics");
            document.addCreator("Sudilca Electronics");
            final Chunk chunk = new Chunk("Sudilca Electronics C.A", ToPDF.chapterFont);
            chunk.setBackground(new BaseColor(0, 100, 200));
            chunk.getFont().setColor(BaseColor.WHITE);
            final Chapter chapter = new Chapter(new Paragraph(chunk), 1);
            chapter.setNumberDepth(0);
            chapter.add((Element)new Paragraph("Rif: J-41280261-5", ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("Recibo N°:" + factura + "        Total: " + total + "     Fecha: " + fecha, ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("Nombre: " + cliente, ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("Cedula: " + ci, ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("Concepto:", ToPDF.paragraphFont));
            for (int i = 0; i < product.size(); ++i) {
                chapter.add((Element)new Paragraph((String)product.get(i), ToPDF.paragraphFont));
            }
            chapter.add((Element)new Paragraph("¡¡ Gracias por su compra !! ", ToPDF.paragraphFont));
            document.add((Element)chapter);
            document.close();
        }
        catch (DocumentException documentException) {
            System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
        }
    }
    
    public void createPDFtaller(final String pdfNewFile, final String norden, final String cliente, final String ci, final String fecha, final String servicios, final String total) {
        try {
            new File(pdfNewFile);
            final Document document = new Document();
            try {
                PdfWriter.getInstance(document, (OutputStream)new FileOutputStream(pdfNewFile));
            }
            catch (FileNotFoundException fileNotFoundException) {
                System.out.println("No such file was found to generate the PDF (No se encontr\u00f3 el fichero para generar el pdf)" + fileNotFoundException);
            }
            document.open();
            document.addTitle("Sudilca Electronics");
            document.addSubject("Recibo");
            document.addKeywords("Recibo, PDF");
            document.addAuthor("Sudilca Electronics");
            document.addCreator("Sudilca Electronics");
            final Chunk chunk = new Chunk("Sudilca Electronics C.A", ToPDF.chapterFont);
            chunk.setBackground(new BaseColor(0, 100, 200));
            chunk.getFont().setColor(BaseColor.WHITE);
            final Chapter chapter = new Chapter(new Paragraph(chunk), 1);
            chapter.setNumberDepth(0);
            chapter.add((Element)new Paragraph("Rif: J-41280261-5", ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("N° Orden: " + norden + "     Total: " + total + " Bs     Fecha: " + fecha, ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("Nombre: " + cliente + "      Cedula: " + ci, ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("Concepto:", ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph(servicios, ToPDF.paragraphFont));
            chapter.add((Element)new Paragraph("¡¡ Gracias por Preferirnos !!", ToPDF.paragraphFont));
            document.add((Element)chapter);
            document.close();
        }
        catch (DocumentException documentException) {
            System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
        }
    }
    
    public void utilJTableToPdf(final JTable jTable, final File pdfNewFile, final String title) throws DocumentException, FileNotFoundException {
        final Document document = new Document();
        PdfWriter.getInstance(document, (OutputStream)new FileOutputStream(pdfNewFile));
        document.open();
        document.addTitle(title);
        document.addSubject(title);
        document.addKeywords(title);
        document.addAuthor("PhoneSystem");
        document.addCreator("PhoneSystem");
        final Anchor anchor = new Anchor(title, ToPDF.categoryFont);
        anchor.setName(title);
        final Chapter catPart = new Chapter(new Paragraph((Phrase)anchor), 1);
        catPart.getTitle().getFont().setSize(8.0f);
        final PdfPTable table = new PdfPTable(jTable.getColumnCount());
        for (int column = 0; column < jTable.getColumnCount(); ++column) {
            final Phrase phrase = new Phrase(jTable.getColumnName(column));
            phrase.getFont().setSize(7.0f);
            final PdfPCell columnHeader = new PdfPCell(phrase);
            columnHeader.setHorizontalAlignment(1);
            table.addCell(columnHeader);
        }
        table.setHeaderRows(1);
        final float[] medidaCeldas = { 8.4f, 8.7f, 8.7f, 8.7f, 5.5f, 5.0f, 5.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f };
        table.setWidths(medidaCeldas);
        for (int row = 0; row < jTable.getRowCount(); ++row) {
            for (int column2 = 0; column2 < jTable.getColumnCount(); ++column2) {
                final Paragraph columna1 = new Paragraph(jTable.getValueAt(row, column2).toString());
                columna1.getFont().setSize(6.0f);
                table.addCell((Phrase)columna1);
            }
        }
        catPart.add((Element)table);
        document.add((Element)catPart);
        document.close();
    }
    
    public void utiltableventas(final JTable jTable, final File pdfNewFile, final String title) throws DocumentException, FileNotFoundException {
        final Document document = new Document();
        PdfWriter.getInstance(document, (OutputStream)new FileOutputStream(pdfNewFile));
        document.open();
        document.addTitle(title);
        document.addSubject(title);
        document.addKeywords(title);
        document.addAuthor("PhoneSystem");
        document.addCreator("PhoneSystem");
        final Anchor anchor = new Anchor(title, ToPDF.categoryFont);
        anchor.setName(title);
        final Chapter catPart = new Chapter(new Paragraph((Phrase)anchor), 1);
        catPart.getTitle().getFont().setSize(8.0f);
        final PdfPTable table = new PdfPTable(jTable.getColumnCount());
        for (int column = 0; column < jTable.getColumnCount(); ++column) {
            final Phrase phrase = new Phrase(jTable.getColumnName(column));
            phrase.getFont().setSize(7.0f);
            final PdfPCell columnHeader = new PdfPCell(phrase);
            columnHeader.setHorizontalAlignment(1);
            table.addCell(columnHeader);
        }
        table.setHeaderRows(1);
        final float[] medidaCeldas = { 8.4f, 8.7f, 9.7f, 8.7f, 8.0f, 6.0f, 6.0f, 6.0f, 6.0f, 5.0f, 6.0f, 5.0f };
        table.setWidths(medidaCeldas);
        for (int row = 0; row < jTable.getRowCount(); ++row) {
            for (int column2 = 0; column2 < jTable.getColumnCount(); ++column2) {
                final Paragraph columna1 = new Paragraph(jTable.getValueAt(row, column2).toString());
                columna1.getFont().setSize(6.0f);
                table.addCell((Phrase)columna1);
            }
        }
        catPart.add((Element)table);
        document.add((Element)catPart);
        document.close();
    }
    
    public void utiltablecompras(final JTable jTable, final File pdfNewFile, final String title) throws DocumentException, FileNotFoundException {
        final Document document = new Document();
        PdfWriter.getInstance(document, (OutputStream)new FileOutputStream(pdfNewFile));
        document.open();
        document.addTitle(title);
        document.addSubject(title);
        document.addKeywords(title);
        document.addAuthor("PhoneSystem");
        document.addCreator("PhoneSystem");
        final Anchor anchor = new Anchor(title, ToPDF.categoryFont);
        anchor.setName(title);
        final Chapter catPart = new Chapter(new Paragraph((Phrase)anchor), 1);
        catPart.getTitle().getFont().setSize(8.0f);
        final PdfPTable table = new PdfPTable(jTable.getColumnCount());
        for (int column = 0; column < jTable.getColumnCount(); ++column) {
            final Phrase phrase = new Phrase(jTable.getColumnName(column));
            phrase.getFont().setSize(7.0f);
            final PdfPCell columnHeader = new PdfPCell(phrase);
            columnHeader.setHorizontalAlignment(1);
            table.addCell(columnHeader);
        }
        System.out.println("compras");
        table.setHeaderRows(1);
        for (int row = 0; row < jTable.getRowCount(); ++row) {
            for (int column2 = 0; column2 < jTable.getColumnCount(); ++column2) {
                final Paragraph columna1 = new Paragraph(jTable.getValueAt(row, column2).toString());
                columna1.getFont().setSize(6.0f);
                table.addCell((Phrase)columna1);
            }
        }
        catPart.add((Element)table);
        document.add((Element)catPart);
        document.close();
    }
    
    static {
        chapterFont = FontFactory.getFont("Helvetica", 26.0f, 3);
        paragraphFont = FontFactory.getFont("Helvetica", 12.0f, 0);
        categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18.0f, 1);
    }
}
