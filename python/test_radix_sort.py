import unittest
from radix_sort import sort
from strategy import Order, BadOrderError

__author__ = "Pablo Acereda"
__copyright__ = "Copyright 2020"
__credits__ = [ "Pablo Acereda" ]

__license__ = "Apache License 2.0"
__version__ = "1.0"
__maintainer__ = "Pablo Acereda"
__email__ = "p.aceredag@gmail.com"

class RadixSortTest(unittest.TestCase):
    # Order integers 
    def test_order_list_integers(self):
        # The desired order of the array
        ordered_arr_int = [5, 37, 54, 76, 78, 82, 113, 420]

        # See if it does not desorders an ordered array of integers and that
        # it is able to order an array of integers
        arr =  [5, 37, 54, 76, 78, 82, 113, 420]
        arr2 = [113, 54, 78, 82, 420, 37, 5, 76]
        self.assertEqual(ordered_arr_int, sort(arr))
        self.assertEqual(ordered_arr_int, sort(arr2))
    
    # Order descending
    def test_order_descending(self):
        # The desired order of the array
        ordered_arr = [420, 113, 82, 78, 76, 54, 37, 5]

        # See if it is able to sort the array descending order
        arr = [113, 54, 78, 82, 420, 37, 5, 76]
        self.assertEqual(ordered_arr, sort(arr, order=Order.DESC))

    # Empty array
    def test_empty_list(self):
        # Empty list ordering should return empty list
        self.assertEqual([], sort([]))

    # Bad Inputs
    def test_bad_order(self):
        # Bad ordering preference should raise an error
        with self.assertRaises(BadOrderError):
            sort([], order="BadOrder")

    # Not Valid Values
    def test_order_list_non_valid(self):        
        # This implementation of RadixSort is not able to sort decimals
        arr  = [0.130549262817116, 0.218716609132574, 
                0.250759585601376, 0.308800541636632, 
                0.472098705199645, 0.607735863960446, 
                0.613506363079981, 0.658317309179441, 
                0.835447955717431, 0.943529879515157]
        with self.assertRaises(ValueError):
            sort(arr)

        # This implementation of RadixSort is not able to sort Strings
        arr2  = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']
        with self.assertRaises(ValueError):
            sort(arr2)
    
if __name__ == '__main__':
    unittest.main()
