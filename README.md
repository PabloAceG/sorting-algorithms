# Efficiency Evaluation

<table> 
    <thead>
        <tr>
            <th rowspan=2>Sorting Algorithm</th>
            <th colspan=6>Time Complexity/Num. Swaps</th>
            <th>Space Complexity</th>
            <th rowspan=2>Stable</th>
        </tr>
        <tr>
            <th colspan=2>Best Case</th>
            <th colspan=2>Average Case</th>
            <th colspan=2>Worst Case</th>
            <th>Auxiliary</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Bubble Sort</td>
            <td>O(n)</td>
            <td>O(1)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(1)</td>
            <td>Yes</td>
        </tr>
        <tr>
            <td>Selection Sort</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(1)</td>
            <td>O(1)</td>
            <td>No</td>
        </tr>
        <tr>
            <td>Insertion Sort</td>
            <td>O(n)</td>
            <td>O(1)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(1)</td>
            <td>Yes</td>
        </tr>
    </tbody>
</table>

# Implemented Algorithms

## Bubble Sort

Cam also be called **sinking sort**. Repeatedly compares adjacent elements and
swaps them if they are wrongly ordered.

Performs poorly in real world problem due to the number of swaps and time it 
takes to order a list of elements.

### When to use it?

For its simplicity, is a good starting point when learning sorting algorithms.

According to some sources 
([GeekforGeeks](https://www.geeksforgeeks.org/bubble-sort/) or 
[Wikipedia](https://en.wikipedia.org/wiki/Bubble_sort#Use)) it is also used in
computer graphics for its capability of detecting small errors in almost sorted
arrays and solve them in linear time complexity _O(2n)_.

### Comparison

When implementing or selecting an algorithm it is almost never used (despite
being the algorithm that is implemented by default in most sorting libraries).

The reason behind this discrimination is the number of swaps done by the 
algorithm. In **insertion sort**, the best case scenario (an almost ordered 
list) time complexity is the same as in **bubble sort** with the difference that 
the number of swaps done by **bubble sort each algorithm is vastly greater** .

## Selection Sort

This algorithms splits the array to order into separate parts: sorted (usually
left) and unsorted (usually right). The algorithm finds the largest/smallest
(descending/ascending) element and inserts it at the end of the sorted 
sub-array.

### When to use it?

It never uses more than _O(n)_ swaps, so it can be useful for when a memory 
write operation is costly. 

## Insertion Sort

This algorithm comes from an incremental approach, by building a sorted 
array/list one step at a time. 

It works by consuming one element at a time, by finding its location in the
ordered sub-array and reinserting the element at its rightful position. This
process is repeated until no element is left.

### When to use it?

This sorting algorithm is used when number of elements to order is small. 
Another situation where this approach can be useful is when the array is already
almost sorted as not many elements need to be moved.
