package org.nioun.essentials.articleservice.service;

import java.util.List;

import org.nioun.essentials.niouncommerce.*;

public interface ArticleService {


	Article saveArticle(Article article);

	Article updateArticle(Article article);

	void deleteArticle(Article article);

	Article getArticleById(Long id);

	List<Article> getAllArticles();
}
