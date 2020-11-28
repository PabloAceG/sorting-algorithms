import unittest
from quick_sort import sort

class SelectionSortTest(unittest.TestCase):
    # Empty
    def test_empty_list(self):
        self.assertEqual([], sort([]))

    # Integers
    def test_order_list_ten_numbers(self):
        # The desired order of the array
        ordered_arr_int = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        # See if it does not desorders an ordered array of integers and that
        # it is able to order an array of integers
        arr  = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        arr2 = [9, 5, 10, 1, 3, 2, 4, 8, 7, 6]
        self.assertEqual(ordered_arr_int, sort(arr))
        self.assertEqual(ordered_arr_int, sort(arr2))

        # The desired order of the array
        ordered_arr_float = [0.130549262817116, 0.218716609132574, 
                             0.250759585601376, 0.308800541636632, 
                             0.472098705199645, 0.607735863960446, 
                             0.613506363079981, 0.658317309179441, 
                             0.835447955717431, 0.943529879515157]

        # See if it does not desorders an ordered array of floats and that
        # it is able to order an array of floats
        arr3 = [0.130549262817116, 0.218716609132574, 
                0.250759585601376, 0.308800541636632, 
                0.472098705199645, 0.607735863960446, 
                0.613506363079981, 0.658317309179441, 
                0.835447955717431, 0.943529879515157]
        arr4 = [0.943529879515157, 0.472098705199645, 
                0.308800541636632, 0.658317309179441, 
                0.835447955717431, 0.218716609132574, 
                0.250759585601376, 0.613506363079981, 
                0.607735863960446, 0.130549262817116]
        self.assertEqual(ordered_arr_float, sort(arr3))
        self.assertEqual(ordered_arr_float, sort(arr4))

    # Strings
    def test_order_list_ten_strings(self):
        # The desired order of the array
        ordered_arr_char = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']
        
        # See if it does not desorders an ordered array of chars and that 
        # it is able to order an array of chars
        arr  = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']
        arr2 = ['e', 'c', 'j', 'b', 'h', 'f', 'd', 'a', 'g', 'i']
        self.assertEqual(ordered_arr_char, sort(arr))
        self.assertEqual(ordered_arr_char, sort(arr2))        

        # The desired order of the array
        ordered_arr_string = ['2ZvVygy7kV', '2uVuM9ogZL',
                              '3okG2eowaZ', '78lu6g4xPl',
                              'LaK7Zv0vFn', 'OLfyqOE8nX',
                              'VVZ1YRcAY3', 'YhHda1XsQS',
                              'ohS2yW0msn', 'ru3TkQyUWv']

        # See if it does not desorders an ordered array of strings and that 
        # it is able to order an array of strings
        arr3 = ['2ZvVygy7kV', '2uVuM9ogZL',
                '3okG2eowaZ', '78lu6g4xPl',
                'LaK7Zv0vFn', 'OLfyqOE8nX',
                'VVZ1YRcAY3', 'YhHda1XsQS',
                'ohS2yW0msn', 'ru3TkQyUWv']
        arr4 = ['ohS2yW0msn', 'ru3TkQyUWv',
                'YhHda1XsQS', 'VVZ1YRcAY3',
                '2uVuM9ogZL', 'OLfyqOE8nX',
                '3okG2eowaZ', '78lu6g4xPl',
                '2ZvVygy7kV', 'LaK7Zv0vFn']
        self.assertEqual(ordered_arr_string, sort(arr3))
        self.assertEqual(ordered_arr_string, sort(arr4)) 
        
if __name__ == '__main__':
    unittest.main()
