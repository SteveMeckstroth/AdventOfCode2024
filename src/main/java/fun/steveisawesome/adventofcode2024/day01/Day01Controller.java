package fun.steveisawesome.adventofcode2024.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fun.steveisawesome.adventofcode2024.Solution;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/Day01")
public class Day01Controller {

	
	@PostMapping("/part1")
	@Operation(summary = "Part 1", description = "Get the difference between two sorted lists.")
	public Solution part1(@RequestBody String inputData) {
		
		String lines[] = inputData.split(System.lineSeparator());
		
		int total = 0;
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		for (String location : lines) {
			String pattern = "(\\d+)\\s+(\\d+)";
			
			Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(location);
			
			System.out.println("Location: " + location);
			
			while(m.find()) {
				leftList.add(Integer.parseInt(m.group(1)));
				rightList.add(Integer.parseInt(m.group(2)));
			}
			
        }
		
		Collections.sort(leftList);
		Collections.sort(rightList);
		
		System.out.println(leftList.toString());
		System.out.println(rightList.toString());
		
		for (int i=0; i < leftList.size(); i++) {
			total += Math.abs(leftList.get(i) - rightList.get(i));
			System.out.println("Total: " + total + " left: " + leftList.get(i) + " right: " + rightList.get(i));
		}
		
		System.out.println("total: " + total);
	    
		return new Solution(1, 1, total);
	}
	
	@PostMapping("/part2")
	@Operation(summary = "Part 2", description = "Get the product of the number of times the first number appears in the 2nd list.")
	public Solution part2(@RequestBody String inputData) {
		
		String lines[] = inputData.split(System.lineSeparator());
		
		int total = 0;
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		
		for (String location : lines) {
			String pattern = "(\\d+)\\s+(\\d+)";
			
			Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(location);
			
			System.out.println("Location: " + location);
			
			while(m.find()) {
				leftList.add(Integer.parseInt(m.group(1)));
				rightList.add(Integer.parseInt(m.group(2)));
			}
			
        }
		
		
		System.out.println(leftList.toString());
		System.out.println(rightList.toString());
		
		for (int i=0; i < leftList.size(); i++) {
			int rightCount = Collections.frequency(rightList, leftList.get(i));
			total += leftList.get(i) * rightCount;
			System.out.println("Total: " + total + " left: " + leftList.get(i) + " rightCount: " + rightCount);
		}
		
		System.out.println("total: " + total);
	    
		return new Solution(1, 2, total);
	}
	

}