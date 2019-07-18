package pl.paprocka.surveysquizzes.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    Optional<Quiz> findAllByQuizName (String quizName);

}