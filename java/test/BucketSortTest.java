package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import src.algorithms.BucketSort;
import src.exceptions.BadArgumentTypeException;
import src.exceptions.NotEnoughBucketsException;
import src.strategy.Order;

/**
*
* Tests for Bucket Sort algorithm.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 © Pablo Acereda
* License under Apache License, Version 2.0
*
*/
public class BucketSortTest {
	@Test
	void testAscendingOrderSortedIntegers() {
		Integer[] array   = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		BucketSort<Integer> bs = new BucketSort<Integer>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Integer>sort(array, Order.ASC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDescendingOrderSortedIntegers() {
		Integer[] array   = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		
		BucketSort<Integer> bs = new BucketSort<Integer>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Integer>sort(array, Order.DESC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAscendingOrderInvertedIntegers() {
		Integer[] array   = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		BucketSort<Integer> bs = new BucketSort<Integer>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Integer>sort(array, Order.ASC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDescendingOrderInvertedIntegers() {
		Integer[] array   = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		BucketSort<Integer> bs = new BucketSort<Integer>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Integer>sort(array, Order.DESC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAscendingOrderUnsortedIntegers() {
		Integer[] array   = {9, 5, 0, 1, 3, 2, 4, 8, 7, 6};
		
		BucketSort<Integer> bs = new BucketSort<Integer>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Integer>sort(array, Order.ASC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDescendingOrderUnsortedIntegers() {
		Integer[] array   = {9, 5, 0, 1, 3, 2, 4, 8, 7, 6};
		
		BucketSort<Integer> bs = new BucketSort<Integer>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Integer>sort(array, Order.DESC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAscendingOrderUnsortedFloats() {
		Float[] ordered = {0.130549262817116f, 0.218716609132574f, 
			               0.250759585601376f, 0.308800541636632f, 
			               0.472098705199645f, 0.607735863960446f, 
			               0.613506363079981f, 0.658317309179441f, 
			               0.835447955717431f, 0.943529879515157f};
		Float[] array =   {0.943529879515157f, 0.472098705199645f, 
                		   0.308800541636632f, 0.658317309179441f, 
                		   0.835447955717431f, 0.218716609132574f, 
                		   0.250759585601376f, 0.613506363079981f, 
                		   0.607735863960446f, 0.130549262817116f};
		
		BucketSort<Float> bs = new BucketSort<Float>();	    
		try {
			array = bs.<Float>sort(array, Order.ASC);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedFloats() {
		Float[] ordered = {0.943529879515157f, 0.835447955717431f,
						   0.658317309179441f, 0.613506363079981f,
						   0.607735863960446f, 0.472098705199645f,
						   0.308800541636632f, 0.250759585601376f,
						   0.218716609132574f, 0.130549262817116f};
		Float[] array   = {0.943529879515157f, 0.472098705199645f, 
			   			   0.308800541636632f, 0.658317309179441f, 
			   			   0.835447955717431f, 0.218716609132574f, 
			   			   0.250759585601376f, 0.613506363079981f, 
			   			   0.607735863960446f, 0.130549262817116f};
		
		BucketSort<Float> bs = new BucketSort<Float>();	    
		try {
			array = bs.<Float>sort(array, Order.DESC);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedChar() {
		Character[] array =   {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		BucketSort<Character> bs = new BucketSort<Character>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Character>sort(array, Order.ASC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDescendingOrderUnsortedChar() {
		Character[] array   = {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		BucketSort<Character> bs = new BucketSort<Character>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<Character>sort(array, Order.DESC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAscendingOrderUnsortedString() {
		String[] array =   {"ohS2yW0bsn", "ru3TkQyUWv",
                			"YhHda1Xsbs", "VVZ1YRcAY3",
                			"2uVuM9ogZL", "OLfyqOE8nX",
                			"3okG2eowaZ", "78lu6g4xPl",
                			"2ZvVygy7kV", "LaK7Zv0vFn"};
		
		BucketSort<String> bs = new BucketSort<String>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<String>sort(array, Order.DESC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDescendingOrderUnsortedString() {
		String[] array   = {"ohS2yW0bsn", "ru3TkQyUWv",
    						"YhHda1Xsbs", "VVZ1YRcAY3",
    						"2uVuM9ogZL", "OLfyqOE8nX",
    						"3okG2eowaZ", "78lu6g4xPl",
    						"2ZvVygy7kV", "LaK7Zv0vFn"};
		
		BucketSort<String> bs = new BucketSort<String>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> bs.<String>sort(array, Order.DESC));
		
		String expectedMessage = "This implementation of Bucket Sort is only prepared for Float elements!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testEmptyArray() {
		Integer[] ordered = {};
		Integer[] array = {};
		
		BucketSort<Integer> bs = new BucketSort<Integer>();
		
		try {
			assertArrayEquals(ordered, bs.sort(array, Order.ASC));
			assertArrayEquals(ordered, bs.sort(array, Order.DESC));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testNotEnoughBucketsException() {
		Float[] array = {0.943529879515157f, 0.835447955717431f,
					     0.658317309179441f, 0.613506363079981f,
					     0.607735863960446f, 0.472098705199645f,
					     0.308800541636632f, 0.250759585601376f,
					     0.218716609132574f, 0.130549262817116f};
		
		BucketSort<Float> bs = new BucketSort<Float>();	  
		NotEnoughBucketsException e = assertThrows(NotEnoughBucketsException.class, () -> bs.<Float>sort(array, Order.ASC, 0));
		
		String expectedMessage = "There must be at least one bucket to be able to execute this sorting algorithm!";
		String actualMessage = e.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
