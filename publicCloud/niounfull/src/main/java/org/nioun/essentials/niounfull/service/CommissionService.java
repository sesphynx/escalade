package org.nioun.essentials.niounfull.service;

import java.util.List;

import org.nioun.essentials.niounfull.model.Commission;

public interface CommissionService {
	
	Commission saveCommission(Commission commission);

	Commission updateCommission(Commission commission);

	void deleteCommission(Commission commission);

	Commission getCommissionById(Long id);

	List<Commission> getAllCommissions();

}
