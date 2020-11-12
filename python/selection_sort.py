from ordering_enum import Ordering
import sys

def sort(array:list, order:Ordering=Ordering.ASC) -> list:
    '''
        It sorts an array by repeatedly finding the minimum element 
        (considering ascending order) from unsorted part and putting ot at the
        beginning. The algorithm maintains two subarrays in a given array.
        
        1) Subarray that is already sorted.
        2) Remaining subarray which is unsorted.

    '''
    # Sub-array with sorted elements 
    sorted_elements:list = []

    # In every iteration of selection sort, the minimum element (considering 
    # ascending order) from the unsorted sub-array is picked and moved to the
    # sorted sub-array.
    while (array):
        position: int = 0

        if   (order == Ordering.ASC):
            position = __find_min(array)
        elif (order == Ordering.DESC):
            position = __find_max(array)
        else:
            sys.exit("Not valid ordering")

        element = array.pop(position)
        sorted_elements.append(element)
        
    return sorted_elements

def __find_max(array:list) -> int:
    pivot:int = 0
    max = None

    for position in range(len(array)):
        elem = array[position]
        if (not max or elem > max):
            max = elem
            pivot = position

    return pivot

def __find_min(array:list) -> int:
    pivot:int = 0
    max = None

    for position in range(len(array)):
        elem = array[position]
        if (not max or elem < max):
            max = elem
            pivot = position

    return pivot

if __name__ == '__main__':
    sort([1,2,3,4,5,6,7,8,9])
