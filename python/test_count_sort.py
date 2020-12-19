import unittest
from count_sort import sort
from strategy import Order

class CountSortTest(unittest.TestCase):
    # Integers
    def test_order_list_ten_numbers(self):
        # The desired order of the array
        ordered_arr_char = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]

        # See if it does not desorders an ordered array of integers and that
        # it is able to order an array of integers
        arr  = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        arr2 = ["9", "5", "0", "1", "3", "2", "4", "8", "7", "6"]
        self.assertEqual(ordered_arr_char, sort(arr))
        self.assertEqual(ordered_arr_char, sort(arr2))
    
    def test_order_list_integers(self):
        # The desired order of the array
        ordered_arr_int = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        # See if it does not desorders an ordered array of integers and that
        # it is able to order an array of integers
        arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        arr2 = [9, 5, 0, 1, 3, 2, 4, 8, 7, 6]
        self.assertEqual(ordered_arr_int, sort(arr))
        self.assertEqual(ordered_arr_int, sort(arr2))
    
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

    # Descending
    def test_order_descending(self):
        # The desired order of the array
        ordered_arr = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

        # See if it is able to sort the array descending order
        arr = [9, 5, 0, 1, 3, 2, 4, 8, 7, 6]
        self.assertEqual(ordered_arr, sort(arr, order=Order.DESC))

    # Not Valid Values
    def test_order_list_non_valid(self):        
        # This implementation of CountSort is not able to sort Decimals
        arr  = [0.130549262817116, 0.218716609132574, 
                0.250759585601376, 0.308800541636632, 
                0.472098705199645, 0.607735863960446, 
                0.613506363079981, 0.658317309179441, 
                0.835447955717431, 0.943529879515157]
        with self.assertRaises(ValueError):
            sort(arr)

        # Uses RADIX sort but does not provide exponent
        with self.assertRaises(AttributeError):
            sort([], is_radix=True)
        # No RADIX sort but uses exponent
        with self.assertRaises(AttributeError):
            sort([], exponent=10)
    
if __name__ == '__main__':
    unittest.main()
