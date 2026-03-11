package springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class restapi {


    @GetMapping
    String helloworld()
    {
        return "Hello I am Noman";
    }
    
    @PostMapping("/old")
    String condi(@RequestParam int age)
    {
        if (age < 18) {
            return "You are under 18.";
        }

        if (age > 18 && age < 100) {
            return "You are more than 18 years old";
        }

        return "You are a living legend";
    }

}