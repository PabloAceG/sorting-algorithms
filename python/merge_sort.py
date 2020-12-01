from strategy import Ordering
import sys

def sort(array:list, order: Ordering=Ordering.ASC) -> list:
    '''
        Recursive function to order elements by dividing the input array into
        two halves, making one recursive call per half, and then merging the 
        returned elements into an ordered array.

        Time Complex:
            - Best    -> O(n log(n))
            - Average -> O(n log(n))
            - Worst   -> O(n log(n))
        Space Complex (Auxiliary Space): O(n)
        Stable: Yes
    '''
    # Exists the program if the ordering is not valid. 
    if (order not in [Ordering.ASC, Ordering.DESC]):
        sys.exit("Not Valid Ordering")

    return _merge_sort(array, order)

def _merge_sort(array, order):
    '''
        Recursive function where array is splitted into two separate parts 
        (divided in the middle) and then merged ordering the two independing
        parts into a new ordered array.

        Input:
            - array: List of elements to order.
            - order: Ordering preference: ascending/descending.
        Output: Ordered array.
    '''
    # Recursion base condition, no more elements
    if (len(array) <= 1): # Single element array (or empty)
        return array

    # Middle element of the array
    middle = len(array) // 2

    # Split array into two parts
    L = array[      :middle]    # First half
    R = array[middle:      ]    # Second half

    # Revurive call to order each half
    L = _merge_sort(L, order)       # First half
    R = _merge_sort(R, order)       # Second half

    # Merge the parts respecting order
    return _merge(L, R, order)

def _merge(arr1, arr2, order):
    '''
        Merges the two arrays passed as parameters into an ordered array. 
        Assumes that the inputting arrays are ordered.

        Input:
            - arr1: First ordered array.
            - arr2: Second ordered array.
            - order: Ordering preference: ascending/descending.
        Output: Ordered union of both input array.
    '''
    # Iterators: i for arr1; j for arr2
    i = j = 0

    sorted_arr = []

    while i < len(arr1) and j < len(arr2):
        if (order == Ordering.ASC):     # ASCENDING
            if (arr1[i] < arr2[j]):
                sorted_arr.append(arr1[i])
                i += 1
            else:
                sorted_arr.append(arr2[j])
                j += 1
        elif (order == Ordering.DESC):  # DESCENDING
            if (arr1[i] > arr2[j]):
                sorted_arr.append(arr1[i])
                i += 1
            else:
                sorted_arr.append(arr2[j])
                j += 1

    # Empty list of elements left
    while i < len(arr1):
        sorted_arr.append(arr1[i])
        i += 1
    while j < len(arr2):
        sorted_arr.append(arr2[j])
        j += 1

    return sorted_arr
