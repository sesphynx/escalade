package com.magma.quantum.machintech.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.magma.quantum.machintech.entities.ProspectExcell;
import com.poiji.bind.Poiji;

@Service
public class ProspectExcellServiceImpl implements ProspectExcellService {

	@Value("${filePath}")
	public String File_Path;
	
	@Override
	public List<ProspectExcell> getDatafromList() {
		File file= new File(File_Path);
		List<ProspectExcell> prospectsXls = Poiji.fromExcel(file,ProspectExcell.class);
		return prospectsXls;
	}

}
