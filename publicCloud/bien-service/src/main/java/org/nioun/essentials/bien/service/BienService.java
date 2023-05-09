package org.nioun.essentials.bien.service;

import java.math.BigDecimal;
import java.util.List;

import org.nioun.essentials.bien.VO.FournisseurBienVO;
import org.nioun.essentials.bien.model.Bien;
import org.springframework.web.multipart.MultipartFile;

public interface BienService {
	
Bien saveBien(Bien bien);
	
	void saveBienToDB(MultipartFile file ,String name , String description ,BigDecimal price, String env);
	
	void updateBienToDB(Long bienId , MultipartFile file ,String name , String description ,BigDecimal price, String env);
	
	Bien updateBien(Bien bien);
	
	void deleteBien(Bien bien);

	void deleteBienById(Long bienId);
	
	Bien getBien(Long bienId);
	
	List<Bien> getAllBiens();
	
	void changeBienImage(Long bienId,MultipartFile file);
	
	FournisseurBienVO  getBienWithFournisseurById(Long bienId);

}
