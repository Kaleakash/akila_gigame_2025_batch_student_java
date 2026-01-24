package com.userdefinendobject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
public class EmployeeOperations {

	public static void main(String[] args) {
		
		List<Emloyee> listOfEmployees = Arrays.asList(new Emloyee(1, "IT", 56000),
				new Emloyee(2, "Non-IT", 52000),
				new Emloyee(3, "Marketing", 59000),
				new Emloyee(4, "IT", 44000),
				new Emloyee(5, "Non-IT", 55000),
				new Emloyee(6, "Marketing", 38000)
				);
		
			//Map<String, List<Emloyee>> result1 = listOfEmployees.stream().collect(Collectors.groupingBy(e->e.getDepartment()));
			//System.out.println(result1);
			
//			Map<String, Double> result2 = 
//					listOfEmployees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.averagingDouble(e->e.getSalary())));
//			System.out.println(result2);
//			

//		Map<String, Long> result2 = 
//				listOfEmployees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
//		System.out.println(result2);
		
		Map<Boolean, List<Emloyee>> partitionMap =
				listOfEmployees.stream()
		                 .collect(Collectors.partitioningBy(
		                         e -> e.getSalary() > 50000
		                 ));

		System.out.println(partitionMap);
	}

}
