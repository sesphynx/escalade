package com.magma.quantum.politicone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magma.quantum.politicone.entities.Commission;
import com.magma.quantum.politicone.repos.CommissionRepository;

@Service
public class CommissionServiceImpl implements CommissionService {

	@Autowired
	CommissionRepository commissionRepository ;
	
	

	public CommissionRepository getCommissionRepository() {
		return commissionRepository;
	}

	public void setCommissionRepository(CommissionRepository commissionRepository) {
		this.commissionRepository = commissionRepository;
	}

	@Override
	public Commission saveCommission(Commission commission) {

		return commissionRepository.save(commission);
	}

	@Override
	public Commission updateCommission(Commission commission) {
		return commissionRepository.save(commission);
	}

	@Override
	public void deleteCommission(Commission commission) {
    commissionRepository.delete(commission);

	}

	@Override
	public Commission getCommissionById(Long id) {
		return commissionRepository.getOne(id);
	}

	@Override
	public List<Commission> getAllCommissions() {
		return commissionRepository.findAll();
	}

}
