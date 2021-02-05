package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import src.algorithms.QuickSort;
import src.strategy.Order;
import src.strategy.Pivot;

/**
*
* Tests for Quick Sort algorithm.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 © Pablo Acereda
* License under Apache License, Version 2.0
*
*/
public class QuickSortTest {
	@Test
	void testAscendingOrderSortedIntegers() {
		Integer[] ordered = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer[] array   = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		QuickSort<Integer> qs = new QuickSort<Integer>();
		array = qs.<Integer>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderSortedIntegers() {
		Integer[] ordered = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] array   = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		QuickSort<Integer> qs = new QuickSort<Integer>();
		array = qs.<Integer>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderInvertedIntegers() {
		Integer[] ordered = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer[] array   = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		QuickSort<Integer> qs = new QuickSort<Integer>();
		array = qs.<Integer>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderInvertedIntegers() {
		Integer[] ordered = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] array   = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		QuickSort<Integer> qs = new QuickSort<Integer>();
		array = qs.<Integer>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedIntegers() {
		Integer[] ordered = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer[] array   = {9, 5, 10, 1, 3, 2, 4, 8, 7, 6};
		
		QuickSort<Integer> qs = new QuickSort<Integer>();
		array = qs.<Integer>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedIntegers() {
		Integer[] ordered = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] array   = {9, 5, 10, 1, 3, 2, 4, 8, 7, 6};
		
		QuickSort<Integer> qs = new QuickSort<Integer>();
		array = qs.<Integer>sort(array, Order.DESC);
		
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.ASC);
		
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedChar() {
		Character[] ordered = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		Character[] array =   {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		QuickSort<Character> qs = new QuickSort<Character>();
		array = qs.<Character>sort(array, Order.ASC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedChar() {
		Character[] ordered = {'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] array   = {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Character>sort(array, Order.DESC);
		
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
		
		QuickSort<String> qs = new QuickSort<String>();
		array = qs.<String>sort(array, Order.ASC);
		
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
		
		QuickSort<String> qs = new QuickSort<String>();
		array = qs.<String>sort(array, Order.DESC);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testEmptyArray() {
		Integer[] ordered = {};
		Integer[] array = {};
		
		QuickSort<Integer> qs = new QuickSort<Integer>();
		
		assertArrayEquals(ordered, qs.sort(array, Order.ASC));
		assertArrayEquals(ordered, qs.sort(array, Order.DESC));
	}
	
	@Test
	void testAscendingOrderFirstPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.ASC, Pivot.FIRST);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderFirstPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.DESC, Pivot.FIRST);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderLastPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.ASC, Pivot.LAST);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderLastPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.DESC, Pivot.LAST);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderRandomPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.ASC, Pivot.RANDOM);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderRandomPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.DESC, Pivot.RANDOM);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderMedianPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.ASC, Pivot.MEDIAN);
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderMedianPivotUnsortedFloat() {
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
		
		QuickSort<Float> qs = new QuickSort<Float>();
		array = qs.<Float>sort(array, Order.DESC, Pivot.MEDIAN);
		
		assertArrayEquals(ordered, array);
	}
}
