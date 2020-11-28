from strategy import Ordering
from strategy import Pivot
import random
import sys

def sort(array:list, order:Ordering=Ordering.ASC, strategy:Pivot=Pivot.MEDIAN) -> list:
    '''
        Simplest sorting algorithm that works by repeatedly swapping the 
        adjacent elements if they are in wrong order. 
        Time Complex:
            - Best    -> O(n log(n))
            - Average -> O(n log(n))
            - Worst   -> O(n^2)
        Space Complex (Auxiliary Space): O(log(n)). Extra space on recursion.
        Stable: No
    '''
    # Exists the program if the ordering is not valid. 
    if (order not in [Ordering.ASC, Ordering.DESC]):
        sys.exit("Not Valid Ordering")
    # Exists the program if the pivot is not valid. 
    if (strategy not in [Pivot.FIRST, Pivot.LAST, Pivot.RANDOM, Pivot.MEDIAN]):
        sys.exit("Not valid Pivot")

    return quicksort(array, order, strategy, 0, len(array) - 1)

def quicksort(array, order, strategy, lower, upper):
    '''
        Recursive function to order elements using pivots to redistribute the 
        rest of the elements of te array. The pivot selected is used as the 
        center element (ordering element) of the array.

        Input:
            - array: List of elements.
            - order: Ordering preference: ascending/descending.
            - strategy: Pivot selection strategy: first/last/random/median.
            - lower: Lowest index of array to reorder.
            - upper: Highest index of array to reorder.
        Output: Ordered array.
    '''
    # Recursion base condition, no more elements
    if lower > upper or not array: # Empty array
        return array

    # Define pivot depending on strategy
    pivot = None
    if (strategy == Pivot.FIRST):       # First
        pivot = 0
    elif (strategy == Pivot.LAST):      # Last
        pivot = -1
    elif (strategy == Pivot.RANDOM):    # Random
        pivot = random.randint[0, len(array)]
    elif (strategy == Pivot.MEDIAN):    # Median
        pivot = _median_of_three(array, lower, upper)

    # Moves elements to the respective sides of the pivot, and returns the 
    # position of the pivot
    pivot = _partition(array, order, pivot, lower, upper)

    # Recursive call with the rest of the array
    quicksort(array, order, strategy, lower,     pivot - 1)
    quicksort(array, order, strategy, pivot + 1, upper)

    return array

def _partition(array, order, pivot, lower, upper):
    '''
        Moves elements to their respective side of the array with the pivot as
        middle element (left for smaller/greater elements and 
        ascending/descending order; right for greater/smaller elements and 
        ascending/descending order). Returns the index of the pivot.

        Input:
            - array: List of elements.
            - order: Ordering preference: ascending/descending.
            - pivot: Index of pivot element.
            - lower: Lowest index of array to reorder.
            - upper: Highest index of array to reorder.
        Output: Index of pivot element (input array is also modified).
    '''
    # The pivot element is made the last not to interfere with other swaping 
    # operations
    array[pivot], array[upper] = array[upper], array[pivot]

    # Last index of smaller/greater (asc/desc) elements
    idx = lower

    for j in range(lower, upper):
        if (order == Ordering.ASC  and array[j] < array[upper] or # ASCENDING
            order == Ordering.DESC and array[j] > array[upper]):  # DESCENDING
            # Moves the current element at the end of the sub-array with
            # the smaller/grater (asc/desc) elements
            array[idx], array[j] = array[j], array[idx]
            idx += 1

    # Moves pivot as separator between greater and smaller numbers
    array[idx], array[upper] = array[upper], array[idx]

    return idx

def _median_of_three(array, lower, upper):
    '''
        The median value is the middle value of a sorted list of elements.

        Input:
            - array: List of unordered elements.
            - lower: Left-most element.
            - upper: Right-most element.
        Output: Median element.
    '''
    mid =  (lower + upper) // 2
    a = array[lower]
    b = array[mid]
    c = array[upper]
    # As only three unordered elements are passed down, the middle element must 
    # be found through comparisons
    if a <= b <= c or c <= b <= a:
        return mid
    if a <= c <= b or b <= c <= a:
        return upper

    return lower
