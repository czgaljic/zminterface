package com.nsxtreme.zm; /**
 * Created by chris on 4/24/2017.
 */
import com.nsxtreme.zm.api.ZmApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.nsxtreme.zm.api")
public class Application {
    private static final Logger log = Logger.getLogger(Application.class);


    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

   /* @Bean
    public CommandLineRunner run()throws Exception{
        return args -> {
            log.debug(zmapi.getAllEventsURL());
        };
    }*/
}



