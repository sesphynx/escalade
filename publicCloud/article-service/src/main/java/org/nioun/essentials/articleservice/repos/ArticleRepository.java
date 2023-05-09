package org.nioun.essentials.articleservice.repos;

import org.nioun.essentials.niouncommerce.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
