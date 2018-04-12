package com.gillian.simple_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	//binarySearchImpl depends on sortAlgorithm ; SortAgl is its dependency
	@Autowired
	private SortAlgorithm sortalg ;

	//autogen
//	public void setSortalg(SortAlgorithm sortalg) {
//		this.sortalg = sortalg;
//	}

	public int binarySearch(int[] numbers , int numberToSearchFor)
	{
		int[] result = sortalg.sort(numbers);
		System.out.println(sortalg);;
		return 3;
	}
}
