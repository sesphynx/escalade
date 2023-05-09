package org.nioun.essentials.machinter.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.nioun.essentials.machinter.repo.ProspectExcellRepository;
import org.nioun.essentials.machinter.service.ProspectExcellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.nioun.essentials.machinter.model.ProspectExcell;

@Service
public class ProspectExcellServiceImpl implements ProspectExcellService {

	@Value("${app.upload.file:${user.home}}")
	String EXCEL_FILE_PATH ;
	
	@Autowired
	ProspectExcellRepository repo;
	
	Workbook workbook ;
	
	
	public List<ProspectExcell> getDatafromList() {
		
		List<String> list = new ArrayList<String>();
		
		// Create Data Formatter to format cell's value 
		DataFormatter dataFormatter= new DataFormatter();
		
		// create workbook
		try {
			workbook = WorkbookFactory.create(new File(EXCEL_FILE_PATH));
		}catch(EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		
		//Retrieving number of sheets in workbook 
		System.out.println("------Workbookhas '" + workbook.getNumberOfSheets() + " 'sheets ----");
		
		//Sheet at 0 index
		Sheet sheet = workbook.getSheetAt(0);
		
		// Getting numbers of column
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		System.out.println("Sheets got '"+noOfColumns+"' columns ----");
		
		//Using for-each loop to iterate over the rows and columns
		
		for(Row row:sheet) {
			for(Cell cell:row) {
				String cellValue=dataFormatter.formatCellValue(cell);
				list.add(cellValue);
			}
		}
	//filling excel data and creating list as List<ProspectXls>	
		List<ProspectExcell> prosList = createList(list,noOfColumns);
		
		//Closing workbook
		try {
			workbook.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prosList;
	}
	
	private List<ProspectExcell> createList(List<String> excelData, int noOfColumns){
		ArrayList<ProspectExcell> prosList = new ArrayList<ProspectExcell>();
		int i = noOfColumns;
		do {
			ProspectExcell pros = new ProspectExcell();
			pros.setNom(excelData.get(i));
			pros.setPrenom(excelData.get(i+1));
			pros.setAddresse(excelData.get(i+2));
			pros.setMail(excelData.get(i+3));
			pros.setNumeroF(excelData.get(i+4));
			pros.setNumeroM(excelData.get(i+5));
		
			prosList.add(pros);
			i = i + noOfColumns ;
		
		}while ( i<excelData.size());
		return prosList;
	}

	@Override
	public int saveData(List<ProspectExcell> prospects) {
		prospects = repo.saveAll(prospects);
		return prospects.size();
	}

	
}
