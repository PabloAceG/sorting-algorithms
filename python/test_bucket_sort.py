import unittest
from bucket_sort import sort

class SelectionSortTest(unittest.TestCase):
    # Floats
    def test_order_list_ten_numbers(self):
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

    # Not Valid Values
    def test_order_list_non_valid(self):        
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
