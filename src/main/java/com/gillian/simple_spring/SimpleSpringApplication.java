package com.gillian.simple_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleSpringApplication {
	
	

	public static void main(String[] args) {
		
		//BinarySearchImpl binarysearch  = new BinarySearchImpl(new BubbleSortAlgorithm());
		//Spring boot do this for us ; Spring Application Context will maintain the beans(the following
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SimpleSpringApplication.class, args);
		BinarySearchImpl binarysearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarysearch.binarySearch(new int[] {123,5,6},3);
		
		
		System.out.println(123);
		System.out.println(result);
		
	}
	
}
