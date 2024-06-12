package pl.danielbukowski.demo.recipe_sharing_app;

import org.springframework.boot.SpringApplication;

public class TestRecipeSharingAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(RecipeSharingAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
