package com.magma.quantum.flightreservation.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.magma.quantum.flightreservation.entities.Reservation;

@Component
public class PDFGenerator {
	
	
	public void generateItinerary (Reservation reservation ,String filePath){
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(generateTable(reservation));
			
		} catch (FileNotFoundException | DocumentException e) {
		
			e.printStackTrace();
		}
		
	}

	private PdfPTable generateTable(Reservation reservation) {
	PdfPTable	table = new PdfPTable(2) ;
	PdfPCell cell;
	
	cell = new PdfPCell(new Phrase("Flight Itinerary"));
	cell.setColspan(2);
	table.addCell(cell);
	
	cell = new PdfPCell(new Phrase("Flight Details"));
	cell.setColspan(2);
	table.addCell(cell);
	
	table.addCell("Flight Number");
	table.addCell(reservation.getFlight().getFlight_number());

	table.addCell("Departure City");
	table.addCell(reservation.getFlight().getDeparture_city());
	
	table.addCell("Arrival  City");
	table.addCell(reservation.getFlight().getArrival_city());
	
	table.addCell("Departure Date");
	table.addCell(reservation.getFlight().getDate_of_departure().toString());
	
	table.addCell("Departure Time");
	table.addCell(reservation.getFlight().getEstimated_departure_time().toString());
	
	cell = new PdfPCell(new Phrase("Passenger Details"));
	cell.setColspan(2);
	table.addCell(cell);
	
	
	table.addCell("First Name");
	table.addCell(reservation.getPassenger().getFirst_name());

	table.addCell("Last Name");
	table.addCell(reservation.getPassenger().getLast_name());
	
	table.addCell("Email");
	table.addCell(reservation.getPassenger().getEmail());
	
	table.addCell("Phone");
	table.addCell(reservation.getPassenger().getPhone());

	
		return table;
	}

}
