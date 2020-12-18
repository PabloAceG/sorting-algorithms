from strategy import Order, CountType
import count_sort
import sys

def sort(array:list, order:Order=Order.ASC):
    """Sorts a list of floating point numbers using RadixSort.

    A sorting algorithm that uses digit by digit sorting, starting from the 
    least significant digit to the most significant digit. 
    
    DISCLAIMER: 
        This implementation only allows positive integers sorting.

    Time Complex:
        Best    -> O(n * k) where k is the number of bits required to to store 
        Average -> O(n * k) each key.
        Worst   -> O(n * k)
    Space Complex (Auxiliary Space): O(n + k)
    Stable: Yes

    Args:
        array (list) -- Elements to order.
        order (Order) -- Order preference (default ASCending).

    Returns:
        list: Ordered elements.
    """
    # Exists the program if the ordering is not valid. 
    if (order not in [Order.ASC, Order.DESC]):
        sys.exit("Not Valid Ordering Preference")

    # This algorithm cannot order Strings
    if (not isinstance(array[0], int)): 
        raise ValueError("This sorting algorithm only sorts positive integers arrays!")

    # Find maximum number to be able to compare
    max_element = max(array)

    # Perform counting sort for every digit
    exponent = 1
    while (max_element // exponent) > 0:
        array = count_sort.sort(array, order=order, type=CountType.RADIX, exponent=exponent)
        exponent *= 10

    return array