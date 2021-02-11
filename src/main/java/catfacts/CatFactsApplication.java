package catfacts;

import catfacts.Kat.GetFact;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@SpringBootApplication
public class CatFactsApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(CatFactsApplication.class, args);
    }

}
