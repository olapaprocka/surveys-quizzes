package pl.paprocka.surveysquizzes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.paprocka.surveysquizzes.quiz.Quiz;
import pl.paprocka.surveysquizzes.quiz.QuizForm;
import pl.paprocka.surveysquizzes.quiz.QuizRepository;

@Service
public class QuizService {


    private QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public void registerQuizForm(QuizForm dto) {


        Quiz quiz = new Quiz();
        quiz.setQuizName(dto.getQuizName());

        quizRepository.save(quiz);


    }
}
