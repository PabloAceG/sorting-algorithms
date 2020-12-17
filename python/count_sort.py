from strategy import Order
import sys

def sort(array:list, order:Order=Order.ASC, is_char:bool=True):
    """Sorts a list of characters using CountingSort.

    Sorting algorithm that is based on keys between a specific range. It counts
    the number of occurences of each element of the array (hashing-like). 
    Afterwards, the position of each object is calculated adding the 
    occurrences at each position.

    1) Store the number of occurences of each object.
    2) Modify the count array so that each element stores the sum of previos
    counts.
    3) Output each object from the input sequence and decrease its count by 1.

    Time Complex:
        Best    -> O(n + k); where n is the number of elements in input array
        Average -> O(n + k); where k is the range of input
        Worst   -> O(n + k)
    Space Complex (Auxiliary Space): O(n + k)
    Stable: Yes

    Args:
        array (list) -- Elements to order.
        order (Order) -- Order preference (default ASCending).
        is_char (bool) -- Are elements to order characters?

    Returns:
        list: Ordered elements.
    """
    num_elems = len(array)
    range_val = 256

    if not is_char:
        range_val = 10

    # Sorted array
    output = [0 for i in range(num_elems)]

    # Storage for the count of individual characters 
    count  = [0 for i in range(range_val)]

    # Count the number of appearences of each character
    for c in array:
        if is_char: 
            count[ord(c)] += 1
        else:
            count[c] += 1

    # Each index stores the sum of the previous counts, symbolizing the index
    # of the output array
    for i in range(1, range_val):
        count[i] += count[i-1]

    # Build the output array
    for i in range(num_elems):
        pos = None
        if is_char: 
            pos = ord(array[i])
        else:
            pos = array[i]

        output[count[pos] - 1] = array[i] 
        count[pos] -= 1

    return output