import unittest
from count_sort import sort

class SelectionSortTest(unittest.TestCase):
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
        arr3 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        arr4 = [9, 5, 0, 1, 3, 2, 4, 8, 7, 6]
        self.assertEqual(ordered_arr_int, sort(arr3, is_char=False))
        self.assertEqual(ordered_arr_int, sort(arr4, is_char=False))
    
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
    
if __name__ == '__main__':
    unittest.main()
