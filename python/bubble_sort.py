from ordering_enum import Ordering
import sys

def sort(array:list, order:Ordering=Ordering.ASC) -> list:
    '''
        Simplest sorting algorithm that works by repeatedly swapping the 
        adjacent elements if they are in wrong order. 
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

    # Traverse the array of elements
    num_elements:int = len(array)
    for i in range(num_elements):
        swapped:bool = False

        # The last element should already be in place
        for j in range(num_elements - i - 1):
            
            # Ordering preference selection
            if   (order == Ordering.ASC):  # ASCENDING
                if (array[j] > array[j + 1]):
                    # Swap elements if second element is greater than first 
                    # element
                    array[j], array[j + 1] = array[j + 1], array[j]
                    swapped = True
            elif (order == Ordering.DESC): # DESCENDING
                if (array[j] < array[j + 1]):
                    # Swap elements if second element is smaller than first 
                    # element
                    array[j], array[j + 1] = array[j + 1], array[j]
                    swapped = True

        # HINT: If nothing is swapped, elements are already ordered. Therefore, 
        # no further ordering operations are needed
        if not swapped:
            break

    return array        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   