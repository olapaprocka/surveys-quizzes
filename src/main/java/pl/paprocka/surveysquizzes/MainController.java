package pl.paprocka.surveysquizzes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;


import javax.validation.Valid;

@Controller
public class MainController {

//    @Autowired
//    @Qualifier("myBeanCustomName") // adnotacja która definiuje który bean (w przpadku gdy w kontekście jest kilka) wstrzyknąć
//    private ObjectMapper objectMapper;

//    @Autowired
//    @Qualifier("")
//    private AuthService authService;

    @GetMapping("/")
    public String showHomePage() {
        return "homePage";
    }

}