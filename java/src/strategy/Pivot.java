package src.strategy;

/**
 * Helps defining order preference on sorting algorithms.
 * {@link #ASC}
 * {@link #DESC}
 * 
 * @author: <a href="mailto:p.aceredag@gmail.com">Pablo Acereda</a>
 * @version: 1.0
 * @license: Copyright 2021 © Pablo Acereda
 * License under Apache License, Version 2.0
 *
 */
public enum Pivot {
	/** First element as pivot */
	FIRST,
	/** Second element as pivot */
    LAST,
    /** Random element as pivot */
    RANDOM,
    /** Median value as pivot */
    MEDIAN
}
