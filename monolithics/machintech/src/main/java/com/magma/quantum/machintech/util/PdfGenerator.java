package com.magma.quantum.machintech.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.magma.quantum.machintech.entities.Vente;

@Service
public class PdfGenerator {

	public void generateItinerary (Vente vente ,String filePath){
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(generateTable(vente));
			
		} catch (FileNotFoundException | DocumentException e) {
		
			e.printStackTrace();
		}
		
	}

	private PdfPTable generateTable(Vente vente) {
	PdfPTable	table = new PdfPTable(2) ;
	PdfPCell cell;
	
	cell = new PdfPCell(new Phrase("Vente Details "));
	cell.setColspan(2);
	table.addCell(cell);
	
	cell = new PdfPCell(new Phrase("Recaps"));
	cell.setColspan(2);
	table.addCell(cell);
	
	table.addCell("Vente Id");
	table.addCell(vente.getId().toString());

	table.addCell("Date Vente");
	table.addCell(vente.getDateVente().toString());
	
	table.addCell("Durée Engagement");
	table.addCell(vente.getDureeEngagement().toString());
	
	
	cell = new PdfPCell(new Phrase("Offre Details"));
	cell.setColspan(2);
	table.addCell(cell);
	
	

	
		return table;
	}

}
