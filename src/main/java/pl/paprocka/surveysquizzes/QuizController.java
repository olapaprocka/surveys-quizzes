package pl.paprocka.surveysquizzes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.paprocka.surveysquizzes.quiz.QuizForm;
import pl.paprocka.surveysquizzes.quiz.QuizRepository;
import pl.paprocka.surveysquizzes.service.QuizService;

@RestController
public class QuizController {


    private QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }


    @Autowired
    QuizRepository quizRepository;

    @GetMapping("/quiz")
    public String showQuizForm(Model model) {
        model.addAttribute("quizForm", new QuizForm());

        return "quizForm";
    }
}
