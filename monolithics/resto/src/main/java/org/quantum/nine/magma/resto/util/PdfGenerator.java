package org.quantum.nine.magma.resto.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.quantum.nine.magma.resto.entities.Commande;

@Service
public class PdfGenerator {

	public void generateCommandeTable(Commande commande ,String filePath){
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(generateTable(commande));
			
		} catch (FileNotFoundException | DocumentException e) {
		
			e.printStackTrace();
		}
		
	}

	private PdfPTable generateTable(Commande commande) {
	PdfPTable	tableCommande = new PdfPTable(3) ;
	PdfPCell cell;
	
	cell = new PdfPCell(new Phrase("Commande Details "));
	cell.setColspan(2);
	tableCommande.addCell(cell);
	
	cell = new PdfPCell(new Phrase("Recaps"));
	cell.setColspan(2);
	tableCommande.addCell(cell);
	
	tableCommande.addCell("Commande Id");
	tableCommande.addCell(commande.getId().toString());

	tableCommande.addCell("Date Client");
	tableCommande.addCell(commande.getClient().toString());
	
	tableCommande.addCell("Etat Commande");
	tableCommande.addCell(commande.getEtat().toString());
	
	
	cell = new PdfPCell(new Phrase("Commande Details"));
	cell.setColspan(2);
	tableCommande.addCell(cell);

		return tableCommande;
	}

}
