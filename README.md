# Quicksort Algorithm
Program to perform quick sort on an array list in java.

### How it works

The algorithm analyzes a list of intergers, starting with a pivot point - which is usually the first element. 
We then look at the next element in the list and if it is bigger than the pivot point, it remains on the right side of the pivot, 
if it is smaller it moves to the left of the pivot point. The interger list has now been divided into two:  A side 
less-than-pivot and a side greater-than-pivot. Both of these sublists each get a new pivot point and the same 
iteration continues until the list is fully sorted.

e.g
4 is the staring pivot:<br>
**4** 3 7 2 6 5 9

3 and 7 are now pivots in the two sublists:<br>
(**3** 2) 4 (**7** 6 9)

List is now sorted:<br>
2 3 4 6 7 9
