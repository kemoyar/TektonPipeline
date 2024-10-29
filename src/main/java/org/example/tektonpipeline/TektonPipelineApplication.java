package org.example.tektonpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TektonPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TektonPipelineApplication.class, args);
	}
}
@RestController
class HelloWorldController {
	@GetMapping("/")
	public String hello() {
		return "<h1>Hello, World!<h1>";
	}
}
