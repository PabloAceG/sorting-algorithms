import unittest
from radix_sort import sort
from strategy import CountType

class SelectionSortTest(unittest.TestCase):
    # Integers    
    def test_order_list_integers(self):
        # The desired order of the array
        ordered_arr_int = [5, 37, 54, 76, 78, 82, 113, 420]

        # See if it does not desorders an ordered array of integers and that
        # it is able to order an array of integers
        arr =  [5, 37, 54, 76, 78, 82, 113, 420]
        arr2 = [113, 54, 78, 82, 420, 37, 5, 76]
        self.assertEqual(ordered_arr_int, sort(arr))
        self.assertEqual(ordered_arr_int, sort(arr2))

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
