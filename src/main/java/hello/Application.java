package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

	 @RequestMapping("/j")
	 @ResponseBody
	    public String home() {
	        System.out.println("hi");
	    	
	        return "Hello Docker World";
	    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
