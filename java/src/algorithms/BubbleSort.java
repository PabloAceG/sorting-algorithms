package src.algorithms;

import src.strategy.Order;

/**
 *
 * Simplest sorting algorithm, that works by repeatedly swapping the adjacent
 * elements, if they are in the wrong order.
 *
 * @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
 * @version: 1.0
 * @license: Copyright 2021 © Pablo Acereda
 * License under Apache License, Version 2.0
 * 
 * @param <T>
 *
 */
public class BubbleSort<T> implements SortingAlgorithm<T> {
	/**
     * Sort an array of elements using Bubble sort algorithm.
     * 
     * @TimeComplexity  
     * Best    -> O(n) <br>
     * Average -> O(n^2) <br>
     * Worst   -> O(n^2) <br>
     * 
     * @SpaceComplexity
     * O(1)
     * 
     * @Stable
     * Yes
     *
     * @param array Elements to be ordered.
     * @param order Order preference.
     *
     * @return      Sorted array.
     */
	@Override
	public <T extends Comparable<T>> T[] sort(T[] elements, Order order) {		
		int numElements = elements.length;
		boolean swapped;
		// Iterate through all array
		for (int i=0; i < numElements - 1; i++) {
			swapped = false;
			// Iterate through the disordered part of the array (left-most part
			// should be ordered)
			for(int j=0; j < numElements-i-1; j++) {
				T current = elements[j];
				T next    = elements[j+1];
				
				if ((order == Order.ASC && current.compareTo(next) > 0)   || 
					(order == Order.DESC && current.compareTo(next) < 0)) {
					swap(elements, j, j+1);
					swapped = true;
				} 
			}
			
			if(!swapped) break;
		}
		
		return elements;
	}
	
	/**
	 * 
	 * @param <T> Generic type array.
	 * @param array Elements.
	 * @param i Position of first element to swap.
	 * @param j Position of second element to swap.
	 */
	private <T> void swap(T[] array, int i, int j) {
		T temporal = array[i];
		array[i] = array[j];
		array[j] = temporal;
	}

}