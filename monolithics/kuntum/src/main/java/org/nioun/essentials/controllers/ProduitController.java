package org.nioun.essentials.controllers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;

import javax.activation.FileTypeMap;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.nioun.essentials.entities.Category;
import org.nioun.essentials.entities.Producteur;
import org.nioun.essentials.entities.Produit;
import org.nioun.essentials.repos.CategoryRepository;
import org.nioun.essentials.repos.ProducteurRepository;
import org.nioun.essentials.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/produit")
public class ProduitController {
	
	@Autowired
	ProduitRepository prodRep ;
	
	@Autowired
	CategoryRepository categoryRep ;
	
	@Autowired
	ProducteurRepository producteurRep ;
	
	
	@GetMapping(value="/creerProduit")
	public String creerProduit(Model model) {
		List<Producteur> producteurs = producteurRep.findAll();
		 model.addAllAttributes(producteurs);
		 List<Category> categories = categoryRep.findAll();
		 model.addAllAttributes(categories);
		 
		 Produit produit=new Produit();
		model.addAttribute(produit);
		return "creerProduit";
	}
		
	@PostMapping(path="/sauvegarderProduit")
	public String sauvegarderProduit(@ModelAttribute("produit") Produit produit,
			@RequestParam ("categoryId") Long categoryId , @RequestParam ("producteurId") Long producteurId ,
			@RequestParam("image") MultipartFile image ) {
		
		Producteur producteurProduit = producteurRep.getOne(producteurId);
		Category categoryProduit  = categoryRep.getOne(categoryId);
		
		produit.setCategory(categoryProduit);
		categoryProduit.getProduits().add(produit);
		
		produit.setProducteur(producteurProduit);	
		producteurProduit.getProduits().add(produit);
		
		produit.setImageUrl(image.getOriginalFilename());
		
				prodRep.save(produit);
		return "creeProduitView";	
	}
	
	
	@GetMapping(value="/toutproduits")
	public String toutProduits(ModelMap  map) {
		
	List<Produit>	 produits= prodRep.findAll();
	map.addAttribute("produits", produits);
		return "toutProduits";
	}
	
	@PutMapping(path="/reglercategory")
	public String updatecategory(@ModelAttribute("produit") Produit produit) {
		prodRep.save(produit);
	return "toutProduits";	
	}
	
	@GetMapping("/produit/{produitId}")
	public ResponseEntity<byte[]> getImageProduit(@RequestParam Long produitId) throws IOException{
		Produit oneProduit = prodRep.getOne(produitId);
		File img = new File(oneProduit.getImageUrl());
	    return ResponseEntity.ok().contentType(MediaType.valueOf(FileTypeMap.getDefaultFileTypeMap().getContentType(img))).body(Files.readAllBytes(img.toPath()));
	}
	
	
		
	@GetMapping("/ciblerProduit")
	@ResponseBody
	public String ciblerProduit(@RequestParam ("id") Long id  ,ModelMap model) {
		Produit produit = prodRep.getOne(id);
	
		model.addAttribute("produit", produit);
		return "ciblerProduit";
	}
		
		
	}


