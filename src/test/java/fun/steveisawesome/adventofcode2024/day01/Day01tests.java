package fun.steveisawesome.adventofcode2024.day01;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class Day01tests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void part1() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/api/Day01/part1")
				.accept(MediaType.APPLICATION_JSON)
				.content("3   4\n"
						+ "4   3\n"
						+ "2   5\n"
						+ "1   3\n"
						+ "3   9\n"
						+ "3   3")
				)
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.answer").value(11))
				.andExpect(jsonPath("$.part").value(1))
				.andExpect(jsonPath("$.day").value(1));
	}
	
	@Test
	public void part2() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/api/Day01/part2")
				.accept(MediaType.APPLICATION_JSON)
				.content("3   4\n"
						+ "4   3\n"
						+ "2   5\n"
						+ "1   3\n"
						+ "3   9\n"
						+ "3   3")
				)
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.answer").value(31))
				.andExpect(jsonPath("$.part").value(2))
				.andExpect(jsonPath("$.day").value(1));
	}
}