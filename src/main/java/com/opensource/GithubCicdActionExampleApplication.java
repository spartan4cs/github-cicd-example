package com.opensource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionExampleApplication {

	@GetMapping("/welcome")
	private String welcome() {
		return "Welcome";

	}

//	echo "# github-cicd-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M master
//	git remote add origin https://github.com/spartan4cs/github-cicd-example.git
//	git push -u origin master
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionExampleApplication.class, args);
	}

}
