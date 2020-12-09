# Efficiency Evaluation

<table> 
    <thead>
        <tr>
            <th rowspan=2>Sorting Algorithm</th>
            <th colspan=6>Time Complexity/Num. Swaps</th>
            <th>Space Complexity</th>
            <th rowspan=2>Stable</th>
            <th rowspan=2>In Place</th>
            <th rowspan=2>Algorithm Paradigm</th>
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
            <td>Yes</td>
            <td>--</td>
        </tr>
        <tr>
            <td>Bucket Sort</td>
            <td>O(n+k)</td>
            <td>--</td>
            <td>O(n+k)</td>
            <td>--</td>
            <td>O(n<sup>2</sup>)</td>
            <td>--</td>
            <td>O(1)</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>SG</td>
        </tr>
        <tr>
            <td>Insertion Sort</td>
            <td>O(n)</td>
            <td>O(1)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n+k)</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Inc</td>
        </tr>
        <tr>
            <td>Merge Sort</td>
            <td>O(n log(n))</td>
            <td>--</td>
            <td>O(n log(n))</td>
            <td>--</td>
            <td>O(n log(n))</td>
            <td>--</td>
            <td>O(n)</td>
            <td>Yes</td>
            <td>No</td>
            <td>D&C</td>
        </tr>
        <tr>
            <td>Quick Sort</td>
            <td>O(n log(n))</td>
            <td>O(1)</td>
            <td>O(n log(n))</td>
            <td>O(n)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n)</td>
            <td>O(log(n))</td>
            <td>No</td>
            <td>Yes</td>
            <td>D&C</td>
        </tr>
        <tr>
            <td>Selection Sort</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(1)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n)</td>
            <td>O(n<sup>2</sup>)</td>
            <td>O(n)</td>
            <td>O(1)</td>
            <td>No</td>
            <td>Yes</td>
            <td>--</td>
        </tr>
    </tbody>
</table>

##### Glossary

**_D&C_** - Divide & Conquer Approach. In algorithmics means to break down a 
problem into smaller and separate parts until it is simple enough to be it 
directly. 

**_Inc_** - Incremental Approach. Given an input, a solution is built working
incrementally (step by step) on changes by adapting the input.

**_In Place_** An algorithm that does not need extra space and produces output 
in the same space (memory) that contains the data.

**_SG_** Scatter-Gather Approach. It sparsely copies the elements of _x_ their
corresponding locations in _y_. After performing the necessary operations, the
elements are then put together from _y_ to _x_.

**_Stable_** - For sorting algorithms it means that in independent executions 
elements that are equal are going to be in the same order.

# Implemented Algorithms

## Bubble Sort

Cam also be called **sinking sort**. Repeatedly compares adjacent elements and
swaps them if they are wrongly ordered.

Performs poorly in real world problem due to the number of swaps and time it 
takes to order a list of elements.

#### Comparison

When implementing or selecting an algorithm it is almost never used (despite
being the algorithm that is implemented by default in most sorting libraries).

The reason behind this discrimination is the number of swaps done by the 
algorithm. In 
[insertion sort](https://github.com/PabloAceG/sorting-algorithms#insertion-sort),
the best case scenario (an almost ordered 
list) time complexity is the same as in **bubble sort** with the difference 
that the number of swaps done by **bubble sort each algorithm is vastly 
greater**.

#### When to use it?

For its simplicity, is a good starting point when learning sorting algorithms.

According to some sources 
([GeekforGeeks](https://www.geeksforgeeks.org/bubble-sort/) or 
[Wikipedia](https://en.wikipedia.org/wiki/Bubble_sort#Use)) it is also used in
computer graphics for its capability of detecting small errors in almost sorted
arrays and solve them in linear time complexity _O(2n)_.

## Bucket Sort

Also known as **bin sort**, is a sorting algorithm that works by distributing 
elements into buckets and then applying sorting on each individual bucket. The
time complexity of the algorithm depends on the sorting algorithm of the 
buckets.

For this implementation, it has been selected 
[insertion sort](https://github.com/PabloAceG/sorting-algorithms#insertion-sort) 
as defualt.

#### Comparison

**Bucket sort** is a generalization of counting sort; it can degenerate into 
this algorithm if this size of the bucket approximates to _1_. 

## Insertion Sort

This algorithm comes from an incremental approach, by building a sorted 
array/list one step at a time. 

It works by consuming one element at a time, by finding its location in the
ordered sub-array and reinserting the element at its rightful position. This
process is repeated until no element is left.

#### When to use it?

This sorting algorithm is used when number of elements to order is small. 
Another situation where this approach can be useful is when the array is 
already almost sorted as not many elements need to be moved.

## Merge Sort

It is a Divide and Conquer approach that divides a given list or array into _N_
separate parts (sub-lists), with each of those lists containing one element.
Afterwards, each sub-lists is merged into a new sorted sub-list, until one 
ordered list is left.

#### Comparison

MergeSort is used to sort linked lists in O(nLog(n)) time complexity. It is 
more efficient that, say, 
[QuickSort](https://github.com/PabloAceG/sorting-algorithms#quick-sort). Unline
in array, inserting an element in the middle of the array takes O(1), in extra 
space and time, very useful for the merge operation (sequential data access).

On the other hand, arbitrary access to a give position, is is more expensive on
a linked-list than on an array. That is why **QuickSort** is more efficient 
with arrays, as it uses a lot of this kind of accesses.

#### When to use it?

For the aforementioned reasons, **MergeSort** is used when dealing with 
LinkedLists. It also comes in handy when having a 
[Count Inversion Problems](https://www.geeksforgeeks.org/counting-inversions/).
It is also used in 
[External Sorting](https://www.geeksforgeeks.org/external-sorting/).

## Quick Sort

Divide and Conquer approach. In the algorithm a _pivot_ element is used to 
divide the array into two separate sub-arrays, depending on whether the 
elements are smaller/bigger than the _pivot_. Then, the arrays are sorted 
recursively.

This can be on place to reduce space complexity, although the recursion also 
takes some space. That's why it takes O(nLog(n)) in of auxiliary space.

Regarding on the pivot selection, there are different approaches:
1. Always pick the **first** element.
2. Always pick the **last** element.
3. Select a **random** number.
4. Select **median** using first and last elements and the element in the 
of these two.

According to Jon L. 
Bentley[[1]](https://github.com/PabloAceG/sorting-algorithms#references), using
the median seems like the most optimal approach.

#### Comparison

When sorting array, it is preferred over 
[MergeSort](https://github.com/PabloAceG/sorting-algorithms#merge-sort) 
as it does not need as much
auxiliary space. Both algorithms are recursive, but **MergeSort** needs O(n).

#### When to use it?

When dealing with sorting arrays and having to decide **MergeSort** or 
**QuickSort**. 

QuickSort is also tail recursive, therefore tail call optimization can be 
applied.

## Selection Sort

This algorithms splits the array to order into separate parts: sorted (usually
left) and unsorted (usually right). The algorithm finds the largest/smallest
(descending/ascending) element and inserts it at the end of the sorted 
sub-array.

#### When to use it?

It never uses more than _O(n)_ swaps, so it can be useful for when a memory 
write operation is costly. 

# References

[1] Jon L. Bentley, M. Douglas McIlroy, 
"[Engineering a Sort Function](https://cs.fit.edu/~pkc/classes/writing/papers/bentley93engineering.pdf)". 
Software Practice and Experience, 23(11):1249-1265, Nov 1993.