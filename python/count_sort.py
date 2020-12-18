from strategy import Order, CountType
import sys

def sort(array:list, order:Order=Order.ASC, type:CountType=CountType.CHAR, exponent:int=None):
    """Sorts a list of characters using CountingSort.

    Sorting algorithm that is based on keys between a specific range. It counts
    the number of occurences of each element of the array (hashing-like). 
    Afterwards, the position of each object is calculated adding the 
    occurrences at each position.

    1) Store the number of occurences of each object.
    2) Modify the count array so that each element stores the sum of previos
    counts.
    3) Output each object from the input sequence and decrease its count by 1.

    DISCLAIMER: 
        When using COUNTING SORT as part of RADIX SORT, take into account that 
        the output array from this call is just a partial ordering of one digit
        at a time. Therefore, those digits need to be traversed to obtain full
        ordering of the input array.
    
    DISCLAIMER 2: 
        This implementation only allows positive integers and characters 
        sorting.

    Time Complex:
        Best    -> O(n + k); where n is the number of elements in input array
        Average -> O(n + k); where k is the range of input
        Worst   -> O(n + k)
    Space Complex (Auxiliary Space): O(n + k)
    Stable: Yes

    Args:
        array (list) -- Elements to order.
        order (Order) -- Order preference (default ASCending).
        type (CounType) -- What type of elements are going to be ordered

    Returns:
        list: Ordered elements.
    """
    # Exists the program if the ordering is not valid. 
    if (order not in [Order.ASC, Order.DESC]):
        sys.exit("Not Valid Ordering Preference")

    # This algorithm cannot order Strings
    if (isinstance(array[0], float)): 
        raise ValueError("This sorting algorithm does not take floating point numbers!")

    num_elems = len(array)
    range_val = 256 # Default range of values (for characters)

    if type is not CountType.CHAR: # When just sorting numbers, range goes  
        range_val = 10             # within 1 digit numbers (0..9)

    # Sorted array
    output = [0 for i in range(num_elems)]

    # Storage for the count of individual characters 
    count  = [0 for i in range(range_val)]

    # Count the number of appearences of each character
    for c in array:
        if type is CountType.CHAR:  # CHARACTERS
            count[ord(c)] += 1
        elif type is CountType.INT: # INTEGERS
            count[c] += 1
        else:                       # RADIX SORT
            pos = int((c / exponent) % 10)
            count[pos] += 1

    # Each index stores the sum of the previous counts, symbolizing the index
    # of the output array
    for i in range(1, range_val):
        count[i] += count[i-1]

    # Build the output array
    for i in range(num_elems):
        pos = None
        j = i # Necessary to take into account RADIX SORT special case
        if   type is CountType.CHAR: # CHARACTERS
            pos = ord(array[i])
        elif type is CountType.INT:  # INTEGERS
            pos = array[i]
        else:                        # RADIX SORT
            # For RADIX sort it should be traversed in reverse order to 
            # maintain the order of already ordered elements (previous call).
            j = (num_elems - 1) - i
            pos = int((array[j] / exponent) % 10)
        output[count[pos] - 1] = array[j] 
        count[pos] -= 1

    return output