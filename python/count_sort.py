from strategy import Order
import sys

def sort(array:list, order:Order=Order.ASC):
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

    Returns:
        list: Ordered elements.
    """
    num_elems = len(array)

    # Sorted array
    output = [0 for i in range(num_elems)]

    # Storage for the count of individual characters 
    count  = [0 for i in range(256)]

    # Count the number of appearences of each character
    for c in array:
        count[ord(c)] += 1

    # Each index stores the sum of the previous counts, symbolizing the index
    # of the output array
    for i in range(256):
        count[i] += count[i-1]

    # Build the output array
    for i in range(num_elems):
        output[count[ord(array[i])] - 1] = array[i] 
        count[ord(array[i])] -= 1

    return output