package ita3.car.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DeveloperData implements ApplicationRunner {

    // Denne klasse er jeres legeplads. Vi bruger den til at lave de første øvelser
    // og til at teste ting af inden vi putter dem over i et "rigtigt projekt"

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("I was Called!");
    }
}
