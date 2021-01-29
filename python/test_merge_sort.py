import unittest
from merge_sort import sort
from strategy import Order, BadOrderError

__author__ = "Pablo Acereda"
__copyright__ = "Copyright 2020"
__credits__ = [ "Pablo Acereda" ]

__license__ = "Apache License 2.0"
__version__ = "1.0"
__maintainer__ = "Pablo Acereda"
__email__ = "p.aceredag@gmail.com"

class MergeSortTest(unittest.TestCase):
    # Order integers
    def test_order_list_ten_integers(self):
        # The desired order of the array
        ordered_arr_int = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        # See if it does not desorders an ordered array of integers and that
        # it is able to order an array of integers
        arr  = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        arr2 = [9, 5, 10, 1, 3, 2, 4, 8, 7, 6]
        self.assertEqual(ordered_arr_int, sort(arr))
        self.assertEqual(ordered_arr_int, sort(arr2))

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

    # Order characters
    def test_order_list_ten_characters(self):
        # The desired order of the array
        ordered_arr_char = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']
        
        # See if it does not desorders an ordered array of chars and that 
        # it is able to order an array of chars
        arr  = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']
        arr2 = ['e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i']
        self.assertEqual(ordered_arr_char, sort(arr))
        self.assertEqual(ordered_arr_char, sort(arr2))        

    # Order strings
    def test_order_list_ten_strings(self):
        # The desired order of the array
        ordered_arr_string = ['2ZvVygy7kV', '2uVuM9ogZL',
                              '3okG2eowaZ', '78lu6g4xPl',
                              'LaK7Zv0vFn', 'OLfyqOE8nX',
                              'VVZ1YRcAY3', 'YhHda1XsQS',
                              'ohS2yW0msn', 'ru3TkQyUWv']

        # See if it does not desorders an ordered array of strings and that 
        # it is able to order an array of strings
        arr = ['2ZvVygy7kV', '2uVuM9ogZL',
               '3okG2eowaZ', '78lu6g4xPl',
               'LaK7Zv0vFn', 'OLfyqOE8nX',
               'VVZ1YRcAY3', 'YhHda1XsQS',
               'ohS2yW0msn', 'ru3TkQyUWv']
        arr2 = ['ohS2yW0msn', 'ru3TkQyUWv',
                'YhHda1XsQS', 'VVZ1YRcAY3',
                '2uVuM9ogZL', 'OLfyqOE8nX',
                '3okG2eowaZ', '78lu6g4xPl',
                '2ZvVygy7kV', 'LaK7Zv0vFn']
        self.assertEqual(ordered_arr_string, sort(arr))
        self.assertEqual(ordered_arr_string, sort(arr2)) 

    # Order descending
    def test_order_descending(self):
        # The desired order of the array
        ordered_arr = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

        # See if it is able to sort the array descending order
        arr = [9, 5, 0, 1, 3, 2, 4, 8, 7, 6]
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

if __name__ == '__main__':
    unittest.main()
