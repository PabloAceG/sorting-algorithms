package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import src.algorithms.HeapSort;
import src.strategy.Order;

/**
*
* Tests for Bubble Sort algorithm.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 © Pablo Acereda
* License under Apache License, Version 2.0
*
*/
public class HeapSortTest {
	@Test
	void testAscendingOrderSortedIntegers() {
		Integer[] ordered = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer[] array   = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		HeapSort<Integer> hs = new HeapSort<Integer>();
		array = hs.<Integer>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderSortedIntegers() {
		Integer[] ordered = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] array   = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		HeapSort<Integer> hs = new HeapSort<Integer>();
		array = hs.<Integer>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderInvertedIntegers() {
		Integer[] ordered = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer[] array   = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		HeapSort<Integer> hs = new HeapSort<Integer>();
		array = hs.<Integer>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderInvertedIntegers() {
		Integer[] ordered = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] array   = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		HeapSort<Integer> hs = new HeapSort<Integer>();
		array = hs.<Integer>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedIntegers() {
		Integer[] ordered = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer[] array   = {9, 5, 10, 1, 3, 2, 4, 8, 7, 6};
		
		HeapSort<Integer> hs = new HeapSort<Integer>();
		array = hs.<Integer>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedIntegers() {
		Integer[] ordered = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] array   = {9, 5, 10, 1, 3, 2, 4, 8, 7, 6};
		
		HeapSort<Integer> hs = new HeapSort<Integer>();
		array = hs.<Integer>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
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
		
		HeapSort<Float> hs = new HeapSort<Float>();
		array = hs.<Float>sort(array, Order.ASC);
		
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
		
		HeapSort<Float> hs = new HeapSort<Float>();
		array = hs.<Float>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedChar() {
		Character[] ordered = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		Character[] array =   {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		HeapSort<Character> hs = new HeapSort<Character>();
		array = hs.<Character>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedChar() {
		Character[] ordered = {'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] array   = {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		HeapSort<Float> hs = new HeapSort<Float>();
		array = hs.<Character>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedString() {
		String[] ordered = {"2ZvVygy7kV", "2uVuM9ogZL",
                		    "3okG2eowaZ", "78lu6g4xPl",
                		    "LaK7Zv0vFn", "OLfyqOE8nX",
                		    "VVZ1YRcAY3", "YhHda1XsQS",
                		    "ohS2yW0msn", "ru3TkQyUWv"};
		
		String[] array =   {"ohS2yW0msn", "ru3TkQyUWv",
                			"YhHda1XsQS", "VVZ1YRcAY3",
                			"2uVuM9ogZL", "OLfyqOE8nX",
                			"3okG2eowaZ", "78lu6g4xPl",
                			"2ZvVygy7kV", "LaK7Zv0vFn"};
		
		HeapSort<String> hs = new HeapSort<String>();
		array = hs.<String>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedString() {
		String[] ordered = {"ru3TkQyUWv", "ohS2yW0msn",
							"YhHda1XsQS", "VVZ1YRcAY3",
							"OLfyqOE8nX", "LaK7Zv0vFn",
							"78lu6g4xPl", "3okG2eowaZ",
							"2uVuM9ogZL", "2ZvVygy7kV"};
		String[] array   = {"ohS2yW0msn", "ru3TkQyUWv",
    						"YhHda1XsQS", "VVZ1YRcAY3",
    						"2uVuM9ogZL", "OLfyqOE8nX",
    						"3okG2eowaZ", "78lu6g4xPl",
    						"2ZvVygy7kV", "LaK7Zv0vFn"};
		
		HeapSort<String> hs = new HeapSort<String>();
		array = hs.<String>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testEmptyArray() {
		Integer[] ordered = {};
		Integer[] array = {};
		
		HeapSort<Integer> hs = new HeapSort<Integer>();
		
		assertArrayEquals(ordered, hs.sort(array, Order.ASC));
		assertArrayEquals(ordered, hs.sort(array, Order.DESC));
	}
}
