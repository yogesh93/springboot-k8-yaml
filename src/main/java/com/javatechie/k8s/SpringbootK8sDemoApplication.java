package com.javatechie.k8s;

import com.sun.tools.javac.util.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping("/message")
	public String DisplayCode(){

		return "Congratulation you successfully deployed your application to kubernetes !!";
	}

	@GetMapping("/message1")
	public String DisplayCOde123() {
		return "Congratulation you successfully deployed your application to kubernetes !!";

	}
	@GetMapping("/message1")
	public String DisplayCOde123() {
		String a = "Congratulation you successfully deployed your application to kubernetes !!";
		String a1 = "Congratulation you successfully deployed your application to kubernetes !!";
		String a32 = "Congratulation you successfully deployed your application to kubernetes !!";
		String a34 = "Congratulation you successfully deployed your application to kubernetes !!";
		String a4 = "Congratulation you successfully deployed your application to kubernetes !!";
		String a456 = "Congratulation you successfully deployed your application to kubernetes !!";
		String a3 = "Congratulation you successfully deployed your application to kubernetes !!";
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
