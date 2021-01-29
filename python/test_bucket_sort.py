import unittest
from bucket_sort import sort
from strategy import Order, BadOrderError

__author__ = "Pablo Acereda"
__copyright__ = "Copyright 2020"
__credits__ = [ "Pablo Acereda" ]

__license__ = "Apache License 2.0"
__version__ = "1.0"
__maintainer__ = "Pablo Acereda"
__email__ = "p.aceredag@gmail.com"

class BucketSortTest(unittest.TestCase):
    # Order decimals
    def test_order_list_ten_decimals(self):
        # The desired order of the array
        ordered_arr_float = [0.130549262817116, 0.218716609132574, 
                             0.250759585601376, 0.308800541636632, 
                             0.472098705199645, 0.607735863960446, 
                             0.613506363079981, 0.658317309179441, 
                             0.835447955717431, 0.943529879515157]

        # See if it does not desorders an ordered array of floats and that
        # it is able to order an array of floats
        arr = [0.130549262817116, 0.218716609132574, 
               0.250759585601376, 0.308800541636632, 
               0.472098705199645, 0.607735863960446, 
               0.613506363079981, 0.658317309179441, 
               0.835447955717431, 0.943529879515157]
        arr2 = [0.943529879515157, 0.472098705199645, 
                0.308800541636632, 0.658317309179441, 
                0.835447955717431, 0.218716609132574, 
                0.250759585601376, 0.613506363079981, 
                0.607735863960446, 0.130549262817116]
        self.assertEqual(ordered_arr_float, sort(arr))
        self.assertEqual(ordered_arr_float, sort(arr2))

    # Order escending
    def test_order_descending(self):
        # The desired order of the array
        ordered_arr = [0.943529879515157, 0.835447955717431,
                       0.658317309179441, 0.613506363079981,
                       0.607735863960446, 0.472098705199645,
                       0.308800541636632, 0.250759585601376, 
                       0.218716609132574, 0.130549262817116]

        # See if it is able to sort the array descending order
        arr = [0.943529879515157, 0.472098705199645, 
               0.308800541636632, 0.658317309179441, 
               0.835447955717431, 0.218716609132574, 
               0.250759585601376, 0.613506363079981, 
               0.607735863960446, 0.130549262817116]
        self.assertEqual(ordered_arr, sort(arr, order=Order.DESC))

    # Empty array
    def test_empty_list(self):
        # Empty list ordering should return empty list
        self.assertEqual([], sort([]))

    # Bad Order
    def test_bad_order(self):
        with self.assertRaises(BadOrderError):
            sort([], order="BadOrder")

    # Not Valid Types
    def test_order_non_valid_type(self):        
        # This implementation of BucketSort is not able to sort Integers
        arr  = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        with self.assertRaises(ValueError):
            sort(arr)
        # This implementation of BucketSort is not able to sort Strings
        arr2  = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']
        with self.assertRaises(ValueError):
            sort(arr2)

if __name__ == '__main__':
    unittest.main()
