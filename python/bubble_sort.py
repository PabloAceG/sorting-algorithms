from ordering_enum import Ordering
import sys

def sort(array:list, order:Ordering=Ordering.ASC) -> list:
    '''
        Simplest sorting algorithm that works by repeatedly swapping the 
        adjacent elements if they are in wrong order. 
    '''
    num_elements:int = len(array)

    # Traverse the array of elements
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
            else:                          # INVALID
                sys.exit("Not valid ordering")

        # HINT: If nothing is swapped, elements are already ordered. Therefore, 
        # no further ordering operations are needed
        if not swapped:
            break

    return array        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   