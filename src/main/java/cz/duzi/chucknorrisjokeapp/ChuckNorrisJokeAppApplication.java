package cz.duzi.chucknorrisjokeapp;

import cz.duzi.chucknorrisjokeapp.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisJokeAppApplication {

    public static void main(String[] args) {
        //context property a everything connected to it is only for showing it in terminal window
        final ApplicationContext context = SpringApplication.run(ChuckNorrisJokeAppApplication.class, args);

        JokeService service = (JokeService) context.getBean("jokeServiceImpl");

        System.out.println(service.getJoke());
    }

}
