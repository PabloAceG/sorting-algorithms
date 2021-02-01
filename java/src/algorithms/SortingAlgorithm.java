package src.algorithms;

import src.strategy.Order;

/**
 *
 * @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
 * @version: 1.0
 * @license: Copyright 2021 © Pablo Acereda
 * License under Apache License, Version 2.0
 *
 * @param T Primitive datatype.
 *
 */
public interface SortingAlgorithm<T> {
    /**
     * Sort a given array of any primitive datatype.
     *
     * @param array Elements to be ordered.
     * @param order Order preference.
     *
     * @return      Sorted array.
     */
    public <T extends Comparable<T>> T[] sort(T[] elements, Order order);
}
