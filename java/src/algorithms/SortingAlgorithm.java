package src.algorithms;

import src.strategy.Order;

/**
 *
 * @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
 * @version: 1.0
 * @license: Copyright 2021 © Pablo Acereda
 * License under Apache License, Version 2.0
 *
 * @param <T> Primitive datatype or object.
 *
 */
public abstract class SortingAlgorithm<T> {
	/**
	 * Sort a given array of any primitive datatype.
	 * 
	 * @param <T> Primitive datatype or object.
	 * 
	 * @param elements Elements to be ordered.
	 * 
	 * @return         Sorted array.
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> T[] sort(T[] elements) 
			throws Exception {
		return this.sort(elements, Order.ASC);
	}
	
    /**
     * Sort a given array of any primitive datatype.
     *
     * @param <T> Primitive datatype or object.
     *
     * @param elements Elements to be ordered.
     * @param order Order preference.
     *
     * @return      Sorted array.
     * 
     * @throws Exception
     */
    @SuppressWarnings("hiding")
	public abstract <T extends Comparable<T>> T[] sort(T[] elements, Order order) 
    		throws Exception;
    
    /**
	 * Interchange two elements.
	 * 
	 * @param <T> Generic type or object array.
	 * 
	 * @param array Elements.
	 * @param i Position of first element to swap.
	 * @param j Position of second element to swap.
	 */
	@SuppressWarnings("hiding")
	protected <T> void swap(T[] array, int i, int j) {
		T temporal = array[i];
		array[i] = array[j];
		array[j] = temporal;
	}
}
