package org.nioun.essentials.articleservice.service;

import java.util.List;

import org.nioun.essentials.articleservice.repos.ArticleRepository;
import org.nioun.essentials.niouncommerce.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleRepository articleRepository ;
	
	

	public ArticleRepository getArticleRepository() {
		return articleRepository;
	}

	public void setArticleRepository(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	@Override
	public Article saveArticle(Article article) {

		return articleRepository.save(article);
	}

	@Override
	public Article updateArticle(Article article) {
		return articleRepository.save(article);
	}

	@Override
	public void deleteArticle(Article article) {
    articleRepository.delete(article);

	}

	@Override
	public Article getArticleById(Long id) {
		return articleRepository.getOne(id);
	}

	@Override
	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}


}
