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
            
            # Select the ordering for the array
            # Ascending order
            # Swap elements if second element is greater than first element
            if   (order == Ordering.ASC):
                if (array[j] > array[j + 1]):
                    array[j], array[j + 1] = array[j + 1], array[j]
                    swapped = True

            # Descending order
            # Swap elements if second element is smaller than first element
            elif (order == Ordering.DESC):
                if (array[j] < array[j + 1]):
                    array[j], array[j + 1] = array[j + 1], array[j]
                    swapped = True
            else:
                sys.exit("Not valid ordering")

        # In case nothing is swapped, that means that the elements are 
        # ordered and therefore no further ordering operations are needed
        if not swapped:
            break

    return array        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   