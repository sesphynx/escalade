package com.magma.quantum.politicone.service;

import java.util.List;

import com.magma.quantum.politicone.entities.Commission;

public interface CommissionService {
	
	Commission saveCommission(Commission commission);

	Commission updateCommission(Commission commission);

	void deleteCommission(Commission commission);

	Commission getCommissionById(Long id);

	List<Commission> getAllCommissions();

}
