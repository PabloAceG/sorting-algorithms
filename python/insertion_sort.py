from strategy import Ordering
import sys

def sort(array:list, order:Ordering=Ordering.ASC) -> list:
    '''
        A sorting algorithm that virtually splits the array to order in two 
        sub-arrays:

        1) Ordered part - left-most part.
        2) Unordered part - right-most part.

        The elements of 2 are picked one by one and inserted in their
        respective position in 1.

        Time Complex:
            - Best    -> O(n)
            - Average -> O(n^2)
            - Worst   -> O(n^2)
        Space Complex (Auxiliary Space): O(1)
        Stable: Yes
    '''
    # Exists the program if the ordering is not valid. 
    if (order not in [Ordering.ASC, Ordering.DESC]):
        sys.exit("Not Valid Ordering")

    # Traverse the array. On each iteration, the corresponding element is 
    # placed at 
    for i in range(1, len(array)):
        key = array[i]
        # Move elements, that are greater/smaller than the key, to one 
        # position ahead of their current position
        j = i - 1
        while (j >= 0 and 
               order == Ordering.ASC  and key < array[j] or # ASCENDING
               order == Ordering.DESC and key > array[j]):  # DESCENDING
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = key

    return array
