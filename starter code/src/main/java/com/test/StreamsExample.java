package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsExample {

	
	public static void main(String[] args) {
//		IntStream.range(1, 4)
//	    .forEach(System.out::println);
		
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println);  // 5.0
	}
}
