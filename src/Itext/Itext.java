package Itext;

import BLL.SerialNumber;
import DAL.SerialNumberDAL;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Itext {
    
    //****ERROR*** Se pide listado de juegos por nombre//
    //Genera reporte con listado de todos los videojuegos en la Base de Datos.
    public void generarReporteListadoVideoJuegos()        {
        try 
        {
            Document document = new Document();
            //PdfWriter.getInstance(document,new FileOutputStream("ListadoVideoJuegos.pdf"));
            PdfWriter.getInstance(document,new FileOutputStream(
                    System.getProperty("user.dir")+"\\src\\Reportes\\ListadoVideoJuegos.pdf"));
            document.open();
            Image imagen = Image.getInstance("banner_Notnull.png");
            document.add(imagen);
            document.add(new Paragraph("                                             "
                                       + "Listado De Juegos",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(4);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Id"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Titulo"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Restriccion Edad"));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Valor"));
            cell1.setColspan(1);
            cell2.setColspan(1);
            cell3.setColspan(1);
            cell4.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            ArrayList<BLL.VideoGame> listado = new BLL.VideoGame().listadoVideoGames();
            for(BLL.VideoGame v: listado)   
            {  
                String idjuego= String.valueOf(v.getIdjuego());
                String titulo=  v.getTitulo();  
                String restrinccion =String.valueOf(v.getRestriccion());
                String valor =String.valueOf(v.getValor()); 

                table.addCell(idjuego);
                table.addCell(titulo);
                table.addCell(restrinccion);
                table.addCell(valor);
            }
            document.add(table);
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error al crear reporte listado videojuegos");
        }
    }

    //Genera reporte con listado de todos los videojuegos de un mismo tipo vendidos o no vendidos.
    public void generarReporteListadoJuegosVendidos()     {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(System.getProperty(
                    "user.dir")+"\\src\\Reportes\\ListadoDeJuegosVendidos.pdf"));
            document.open();
            Image imagen = Image.getInstance("banner_Notnull.png");
            document.add(imagen);
            document.add(new Paragraph("                                             "
                        + "Listado De Juegos Vendidos",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Titulo"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Username"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Serie"));
            cell1.setColspan(1);
            cell2.setColspan(1);
            cell3.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            for (BLL.Biblioteca bb: new BLL.Biblioteca().ConsultarBiblioteca())
            {
                String Titulo = new BLL.VideoGame().tituloJuego(bb.getIdJuego());
                String username = bb.getUsername();
                String serie = bb.getSerie(); 
                table.addCell(Titulo);
                table.addCell(username);
                table.addCell(serie);
            }
            document.add(table);
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al crear reporte listado videojuegos");        
        }
    }

    //Genera reporte con la ganancia total obtenida por concepto de juegos.
    public void generarReporteGananciaTotal()             {
        try
        {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(System.getProperty(
                    "user.dir")+"\\src\\Reportes\\GananciaTotal.pdf"));
            int gananciaTotal= 0;
            document.open();
            Image imagen = Image.getInstance("banner_Notnull.png");
            document.add(imagen);
            document.add(new Paragraph("                                             "
                        + "Ganancia Total",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Titulo"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Valor Unitario"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Total Ganancia"));
            cell1.setColspan(1);
            cell2.setColspan(1);
            cell3.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);

            for (BLL.SerialNumber s: new BLL.SerialNumber().GananciaTotalxJuego())
            {
                String serie =  s.getSerie();
                String estado =String.valueOf(s.getEstado());
                String idJuego = String.valueOf(s.getIdjuego());
                table.addCell(serie);
                table.addCell(estado);
                table.addCell(idJuego);
                gananciaTotal+=s.getIdjuego();
            }
            document.add(table);
            document.add(new Paragraph(""));
            document.add(new Paragraph(""));
            document.add(new Paragraph(""));
            document.add(new Paragraph("                Ganancia Total Venta Todos los Juegos "
                    + "                   " + gananciaTotal));
            
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close();
         } 
         catch (Exception e) 
         {
            System.out.println("Error al crear reporte de ganancia");         
         }
     }
    
    //Genera reporte de juegos sin stock
    public void generarReporteJuegosSinStock()            {
        try
        {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(System.getProperty(
                    "user.dir")+"\\src\\Reportes\\JuegosSinStock.pdf"));
            document.open();
            Image imagen = Image.getInstance("banner_Notnull.png");
            document.add(imagen);
            document.add(new Paragraph("                                             "
                    + "Juegos Sin Stock",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(1);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Titulo"));
            cell1.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            ArrayList<BLL.SerialNumber> stock = new BLL.SerialNumber().contarSeriales();
            ArrayList<BLL.SerialNumber> compras = new BLL.SerialNumber().SerialesCompradas();

            if (!(stock.isEmpty() || compras.isEmpty()))
            {
                for (int i = 0; i < compras.size(); i++) 
                {
                    for (int j = 0; j < stock.size(); j++) 
                    {
                        if(stock.get(j).getIdjuego() == compras.get(i).getIdjuego())
                        {
                            if (stock.get(j).getEstado() == compras.get(i).getEstado())
                            {                           
                                String titulo = new BLL.VideoGame().tituloJuego(compras.get(i).getIdjuego());
                                table.addCell(titulo);
                            }
                        }
                    }
                } 
            }
            document.add(table);
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error al crear reporte de juegos sin stock");
        }     
    }

    //Genera reporte identificando al(los) usuario(s) con el mayor número de juegos en su biblioteca.
    public void generarReporteUsuarioMasJuegos()          {
        try 
        {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(System.getProperty(
                    "user.dir")+"\\src\\Reportes\\UsuarioConMayorJuegos.pdf"));
            document.open();
            Image imagen = Image.getInstance("banner_Notnull.png");
            document.add(imagen);
            document.add(new Paragraph("                                             Usuario Con Mayor Juegos",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.RED)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(2);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Usuario"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Cantidad Compras"));
            cell1.setColspan(1);
            cell2.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            table.addCell(cell2);
            int mayor = 0;
            ArrayList<SerialNumberDAL.ArryL> s = new BLL.SerialNumber().usuarioMax();
            if(!(s.isEmpty()))
            {
                mayor = s.get(0).getCantidad();
            }
            for (int i = 0; i < s.size(); i++) 
            {
                if (mayor != 0 && (mayor == s.get(i).getCantidad())) 
                {
                    String username = s.get(i).getUsername();
                    String cantidad = String.valueOf(s.get(i).getCantidad());
                    table.addCell(username);
                    table.addCell(cantidad);
                }
            }
            document.add(table);
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close(); 
        }
        catch (Exception e) 
        {
            System.out.println("Error al crear reporte de usuarios con más juegos");          
        }
    }

    //Genera reporte identificando los cinco juegos más vendidos.
    public void generarReporteTopFiveVentas()             {
            try 
            {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(System.getProperty(""
                        + "user.dir")+"\\src\\Reportes\\TopFive.pdf"));
                document.open();
                Image imagen = Image.getInstance("banner_Notnull.png");
                document.add(imagen);
                document.add(new Paragraph("                                             "
                            + "Top Five",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.RED)));
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                PdfPTable table = new PdfPTable(1);
                PdfPCell cell1 = new PdfPCell(new Paragraph("Titulo"));
                cell1.setColspan(1);
                cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(cell1);
                ArrayList<SerialNumber> s = new BLL.SerialNumber().topFive();
                if((!(s.isEmpty())) && s.size()>=5)
                {   
                    for (int i = 0; i < 5; i++)
                    {
                        Object fila[] = new Object[1];
                        String titulo= new BLL.VideoGame().tituloJuego(s.get(i).getIdjuego());
                        table.addCell(titulo);
                    }
                }
                else
                {
                    for (int i = 0; i < s.size(); i++)
                    {
                        Object fila[] = new Object[1];
                        String titulo2 = new BLL.VideoGame().tituloJuego(s.get(i).getIdjuego());
                        table.addCell(titulo2);
                    }
                }
                document.add(table);
                JOptionPane.showMessageDialog(null,"Reporte Guardado");
                document.close();     
            } 
            catch (Exception e) 
            {
                System.out.println("Error al crear reporte de 5 juegos más vendidos");
            }   
        }

}