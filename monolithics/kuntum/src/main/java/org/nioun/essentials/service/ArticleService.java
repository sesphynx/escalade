package org.nioun.essentials.service;

import java.util.List;

import org.nioun.essentials.entities.Article;

public interface ArticleService {
	

	Article saveArticle(Article article);

	Article updateArticle(Article article);

	void deleteArticle(Article article);

	Article getArticleById(Long id);

	List<Article> getAllArticles();

}
