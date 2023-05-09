package org.nioun.essentials.bien.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.nioun.essentials.bien.VO.Fournisseur;
import org.nioun.essentials.bien.VO.FournisseurBienVO;
import org.nioun.essentials.bien.model.Bien;
import org.nioun.essentials.bien.repository.BienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@Service
public class BienServiceImpl implements BienService {
	
	@Autowired
	BienRepository bienRepository; 
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public BienRepository getBienRepository() {
		return bienRepository;
	}

	public void setBienRepository(BienRepository bienRepository) {
		this.bienRepository = bienRepository;
	}

	public Bien saveBien(Bien bien) {

		return bienRepository.save(bien);
	}


	public Bien updateBien(Bien bien) {

		return bienRepository.save(bien);
	}


	public void deleteBien(Bien bien) {
		bienRepository.delete(bien);

	}


	public Bien getBien(Long bienId) {

		return bienRepository.findById(bienId).get();
	}


	public List<Bien> getAllBiens() {

		return bienRepository.findAll();
	}

	
	public  void saveBienToDB(MultipartFile file, String name, String description, BigDecimal price, String categorie) {
		Bien bien = new Bien();
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains("..")) {
			System.out.println("Fichier invalide");
		}
		
		try {
			bien.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		bien.setName(name);
		bien.setDescription(description);
		bien.setPrice(price);
		bien.setCategorie(categorie);
		bienRepository.save(bien);
		
	}

	public void changeBienImage(Long bienId, MultipartFile file) {
		Bien bien = new Bien();
			bien=bienRepository.findById(bienId).get();
		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		if(filename.contains("..")) {
			System.out.println("fichier introuvable");
		}
		try {
		bien.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		}catch(IOException e) {e.printStackTrace();}
		bienRepository.save(bien);
	}

	
	public void updateBienToDB(Long bienId, MultipartFile file, String name, String description, BigDecimal price,
			String categorie) {
Bien bien = new Bien();
bien.setBienId(bienId);
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains("..")) {
			System.out.println("Fichier invalide");
		}
		
		try {
			bien.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		bien.setName(name);
		bien.setDescription(description);
		bien.setPrice(price);
		bien.setCategorie(categorie);
		bienRepository.save(bien);
		
	}

	
	public void deleteBienById(Long bienId) {
			Bien bien = bienRepository.findById(bienId).get();
			bienRepository.delete(bien);
		
	}

	
	public FournisseurBienVO getBienWithFournisseurById(Long bienId) {
		FournisseurBienVO fbvo = new FournisseurBienVO();
		Bien bien = bienRepository.getById(bienId);
		Fournisseur fournisseur = restTemplate.
									getForObject("http://localhost:8300/fournisseur/fournisseurId/"+bien.getBienId(),
																						Fournisseur.class);
		fbvo.setBien(bien);
		fbvo.setFournisseur(fournisseur);
		
		return fbvo;
		
		
	}

}
