package com.magma.quantum.machintech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.magma.quantum.machintech.repos.ProspectExcellRepository;
import com.magma.quantum.machintech.service.ProspectExcellService;

@Component
public class XLDataUploadRunner implements CommandLineRunner {

	@Autowired
	ProspectExcellRepository prospectExcellRepository;
	
	@Autowired
	ProspectExcellService prospectExcellService;
	
	
	@Override
	public void run(String... args) throws Exception {
		prospectExcellRepository.saveAll(prospectExcellService.getDatafromList());
	}

}
