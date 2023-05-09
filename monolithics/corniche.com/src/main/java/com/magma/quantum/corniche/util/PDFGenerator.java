package com.magma.quantum.corniche.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.magma.quantum.corniche.entities.Reservationchambre;

@Component
public class PDFGenerator {
	
	
	public void generateItinerary (Reservationchambre reservationchambre ,String filePath){
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(generateTable(reservationchambre));
			
		} catch (FileNotFoundException | DocumentException e) {
		
			e.printStackTrace();
		}
		
	}

	private PdfPTable generateTable(Reservationchambre reservationchambre) {
	PdfPTable	table = new PdfPTable(2) ;
	PdfPCell cell;
	
	cell = new PdfPCell(new Phrase("Chambre Itinerary"));
	cell.setColspan(2);
	table.addCell(cell);
	
	cell = new PdfPCell(new Phrase("Chambre Details"));
	cell.setColspan(2);
	table.addCell(cell);
	
	table.addCell(" Numero Logis");
	table.addCell(reservationchambre.getLogis().getNumero());

	table.addCell("Type Logis");
	table.addCell(reservationchambre.getLogis().getType());
	
	table.addCell("Date Debut Reservationchambre");
	table.addCell(reservationchambre.getStartReservationDate().toString());
	
	table.addCell(" Date Fin Reservationchambre");
	table.addCell(reservationchambre.getEndReservationDate().toString());
	
	table.addCell("Departure Time");
	table.addCell(reservationchambre.getCreatedDate().toString());
	
	cell = new PdfPCell(new Phrase("Locator Details"));
	cell.setColspan(2);
	table.addCell(cell);
	
	
	table.addCell("First Name");
	table.addCell(reservationchambre.getCustomer().getFirst_name());

	table.addCell("Last Name");
	table.addCell(reservationchambre.getCustomer().getLast_name());
	
	table.addCell("Email");
	table.addCell(reservationchambre.getCustomer().getEmail());
	
	table.addCell("Phone");
	table.addCell(reservationchambre.getCustomer().getPhone());

	
		return table;
	}

}
