package pjys.board.article.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjys.board.article.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
