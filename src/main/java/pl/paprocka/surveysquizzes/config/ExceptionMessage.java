package pl.paprocka.surveysquizzes.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExceptionMessage {
    private String message;
    private int httpCode;
}