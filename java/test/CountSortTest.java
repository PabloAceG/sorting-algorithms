package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import src.algorithms.CountSort;
import src.exceptions.BadArgumentTypeException;
import src.exceptions.BadRadixArgumentException;
import src.strategy.Order;

/**
*
* Tests for Count Sort algorithm.
*
* @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
* @version: 1.0
* @license: Copyright 2021 © Pablo Acereda
* License under Apache License, Version 2.0
*
*/
public class CountSortTest {
	@Test
	void testAscendingOrderSortedIntegers() {
		Integer[] ordered = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] array   = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		try {
			array = cs.<Integer>sort(array, Order.ASC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderSortedIntegers() {
		Integer[] ordered = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		Integer[] array   = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		
		CountSort<Integer> cs = new CountSort<Integer>();
		try {
			array = cs.<Integer>sort(array, Order.DESC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderInvertedIntegers() {
		Integer[] ordered = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] array   = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		try {
			array = cs.<Integer>sort(array, Order.ASC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderInvertedIntegers() {
		Integer[] ordered = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		Integer[] array   = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		try {
			array = cs.<Integer>sort(array, Order.DESC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedIntegers() {
		Integer[] ordered = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] array   = {9, 5, 0, 1, 3, 2, 4, 8, 7, 6};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		try {
			array = cs.<Integer>sort(array, Order.ASC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedIntegers() {
		Integer[] ordered = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		Integer[] array   = {9, 5, 0, 1, 3, 2, 4, 8, 7, 6};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		try {
			array = cs.<Integer>sort(array, Order.DESC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedFloats() {
		Float[] array =   {0.943529879515157f, 0.472098705199645f, 
                		   0.308800541636632f, 0.658317309179441f, 
                		   0.835447955717431f, 0.218716609132574f, 
                		   0.250759585601376f, 0.613506363079981f, 
                		   0.607735863960446f, 0.130549262817116f};
		
		CountSort<Float> cs = new CountSort<Float>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> cs.<Float>sort(array, Order.ASC));
		
		String expectedMessage = "This implementation is not ready to sort a floating point array!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDescendingOrderUnsortedFloats() {
		Float[] array   = {0.943529879515157f, 0.472098705199645f, 
     		   			   0.308800541636632f, 0.658317309179441f, 
     		   			   0.835447955717431f, 0.218716609132574f, 
     		   			   0.250759585601376f, 0.613506363079981f, 
     		   			   0.607735863960446f, 0.130549262817116f};
		
		CountSort<Float> cs = new CountSort<Float>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> cs.<Float>sort(array, Order.DESC));
		
		String expectedMessage = "This implementation is not ready to sort a floating point array!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testAscendingOrderUnsortedChar() {
		Character[] ordered = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		Character[] array =   {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		CountSort<Character> cs = new CountSort<Character>();
		try {
			array = cs.<Character>sort(array, Order.ASC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testDescendingOrderUnsortedChar() {
		Character[] ordered = {'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] array   = {'e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i'};
		
		CountSort<Float> cs = new CountSort<Float>();
		try {
			array = cs.<Character>sort(array, Order.DESC);
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
		
		assertArrayEquals(ordered, array);
	}
	
	@Test
	void testAscendingOrderUnsortedString() {		
		String[] array =   {"ohS2yW0csn", "ru3TkQyUWv",
                			"YhHda1Xscs", "VVZ1YRcAY3",
                			"2uVuM9ogZL", "OLfyqOE8nX",
                			"3okG2eowaZ", "78lu6g4xPl",
                			"2ZvVygy7kV", "LaK7Zv0vFn"};
		
		CountSort<String> cs = new CountSort<String>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> cs.<String>sort(array, Order.ASC));
		
		String expectedMessage = "Count Sort cannot order String arrays, try with a Character array!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testDescendingOrderUnsortedString() {
		String[] array   = {"ohS2yW0csn", "ru3TkQyUWv",
    						"YhHda1Xscs", "VVZ1YRcAY3",
    						"2uVuM9ogZL", "OLfyqOE8nX",
    						"3okG2eowaZ", "78lu6g4xPl",
    						"2ZvVygy7kV", "LaK7Zv0vFn"};
		
		CountSort<String> cs = new CountSort<String>();
		BadArgumentTypeException e = assertThrows(BadArgumentTypeException.class, () -> cs.<String>sort(array, Order.DESC));
		
		String expectedMessage = "Count Sort cannot order String arrays, try with a Character array!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testEmptyArray() {
		Integer[] ordered = {};
		Integer[] array = {};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		
		try {
			assertArrayEquals(ordered, cs.sort(array, Order.ASC));
			assertArrayEquals(ordered, cs.sort(array, Order.DESC));
		} catch (BadRadixArgumentException | BadArgumentTypeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testInvalidArgumentsIsRadix() {
		Integer[] ordered = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		BadRadixArgumentException e = assertThrows(BadRadixArgumentException.class, () -> cs.<Integer>sort(ordered, Order.ASC, true, 0));
		
		String expectedMessage = "Using CountSort as part of RadixSort. Need a radix/base to proceed!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	void testInvalidArgumentsIsNotRadix() {
		Integer[] ordered = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		CountSort<Integer> cs = new CountSort<Integer>();
		BadRadixArgumentException e = assertThrows(BadRadixArgumentException.class, () -> cs.<Integer>sort(ordered, Order.ASC, false, 10));
		
		String expectedMessage = "No exponent is needed, provide exponent=0 or use function without isRadix and exponent arguments!";
	    String actualMessage = e.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
}
