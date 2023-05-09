package org.nioun.essentials.articleservice.controller;

import java.util.List;

import org.nioun.essentials.articleservice.service.ArticleService;
import org.nioun.essentials.niouncommerce.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ArticleController {
	
	@Autowired
	ArticleService articleService ;
	
	@RequestMapping(value = "/article" , method = RequestMethod.POST)
	Article save ( @RequestBody Article article){
		return articleService.saveArticle(article) ;
	}

	@RequestMapping(value="/article" , method = RequestMethod.GET)
	Article fetch(@RequestParam Long articleId){
		return articleService.getArticleById(articleId);
	}
	
	@RequestMapping(value="/articles" , method = RequestMethod.GET)
	List<Article> fetch(){
		return articleService.getAllArticles();
	}
	
}
