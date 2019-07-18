package pl.paprocka.surveysquizzes.quiz;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class QuizForm {

    @NotNull(message = "Pole pytanie musi byc wypełnione")
    private String question;
    @NotNull(message = "Pole odpowiedź musi być wypełnione")
    private String answer1;
    @NotNull(message = "Pole odpowiedź musi być wypełnione")
    private String answer2;
    @NotNull(message = "Pole odpowiedź musi być wypełnione")
    private String answer3;
    @NotNull(message = "Pole odpowiedź musi być wypełnione")
    private String answer4;

    public String getQuizName() {
        return null;
    }
}