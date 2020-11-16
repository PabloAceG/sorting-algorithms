from ordering_enum import Ordering
import sys

def sort(array:list, order:Ordering=Ordering.ASC) -> list:
    '''
        A sorting algorithm that sorts a given array by finding the minimum 
        element (with ascending order). It then moves the array to another
        sub-array containing the ordered subset. That means that two sub-arrays
        are needed.
        
        1) Sub-array sorted subset.
        2) Remaining unsorted sub-array.

        Time Complex:
            - Best    -> O(n^2)
            - Average -> O(n^2)
            - Worst   -> O(n^2)
        Space Complex (Auxiliary Space): O(1)
    '''

    # In every iteration of selection sort, the minimum/maximum element 
    # (depending on ordering) from the unsorted sub-array is picked and moved 
    # to the sorted sub-array - in this code, the left-most part of the array.
    for i in range (len(array)):
        idx = i

        # Look for the minimum/maximum (ascending/descending) element of the
        # unordered array.
        for j in range(i + 1, len(array)):
            # Ordering preference selection
            if   (order == Ordering.ASC):  # ASCENDING
                if (array[idx] > array[j]):
                    idx = j
            elif (order == Ordering.DESC): # DESCENDING
                if (array[idx] < array[j]):
                    idx = j
            else:                          # INVALID
                sys.exit("Not valid ordering")   

        # Swap elements with the first element of the unordered sub-array, 
        # now the last position of the ordered sub-array.
        array[i], array[idx] = array[idx], array[i]

    return array
