package fun.steveisawesome.adventofcode2024;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Advent of Code", version = "2024.12"))
public class AdventOfCode2024Application {

	public static void main(String[] args) {
		SpringApplication.run(AdventOfCode2024Application.class, args);
	}

}
