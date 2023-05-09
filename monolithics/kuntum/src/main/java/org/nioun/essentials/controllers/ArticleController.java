
package org.nioun.essentials.controllers;

import java.util.List;

import org.nioun.essentials.entities.Article;
import org.nioun.essentials.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ArticleController {
	
	@Autowired
	ArticleService service ;
	
	@RequestMapping("/ajouterArticle")
	public String ajouterArticle(ModelMap map) {
		Article article = new Article();
		map.addAttribute(article);
		return "creerArticle";
	}

	@RequestMapping("/sauvegarderArticle")
	public String sauvegarderArticle(@ModelAttribute("article") Article article,
							ModelMap modelMap) {
		Article articleSaved = service.saveArticle(article);
		String msg = "Article saved with id :" + articleSaved.getId() ;
		modelMap.addAttribute("msg", msg);
		return "creerArticle";
	}

	@RequestMapping("/toutArticles")
	public String toutArticles(ModelMap modelMap) {

		List<Article> articles = service.getAllArticles();
		modelMap.addAttribute("articles", articles);
		return "toutArticles";
	}

	@RequestMapping("supprimerArticle")
	public String supprimerArticle(@RequestParam("id") Long id, ModelMap modelMap) {
		Article article = new Article();
		article.setId(id);
		service.deleteArticle(article);
		List<Article> articles = service.getAllArticles();
		modelMap.addAttribute("articles", articles);
		return "toutArticles";
	}

	@RequestMapping("/ciblerArticle")
	public String ciblerArticle(@RequestParam("id") Long  id, ModelMap modelMap) {
		Article article = new Article();
		article.setId(id);
		modelMap.addAttribute("article", article);
		return "ciblerArticle";
	}

	@RequestMapping("reglerArticle")
	public String reglerArticle(@ModelAttribute("article") Article article, ModelMap modelMap) {
		service.updateArticle(article);
		List<Article> articles = service.getAllArticles();
		modelMap.addAttribute("articles", articles);
		return "toutArticles";
	}

	
	
}
