package org.nioun.essentials.machinter.service;

import java.util.List;

import org.nioun.essentials.machinter.model.ProspectExcell;

public interface ProspectExcellService {
 List<ProspectExcell>  getDatafromList();
 int saveData(List<ProspectExcell> prospects);
}
