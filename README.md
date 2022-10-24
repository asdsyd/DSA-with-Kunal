# DSA-with-Kunal
Learning DSA.

## What is Java?
Java is a popular programming language, created in 1995.
It is owned by Oracle

# Let's get started 

We have 8 primitive data types in Java

1. byte
2. short
3. int
4. long
5. float
6. double
7. boolean 
8. char

Non-primitive data types include
1. String
2. Arrays
3. Classes

Now let's look at Arrays
## Creating and Initializing an Array :
1. Using **new** operator
*datatype*[] *nameOfArray* = new *datatype*[ *sizeOfArray*];
            OR
*datatype* *nameOfArray*[] = new *datatype*[ *sizeOfArray*];
int[] myArray = new int[10];

2. Shortcut syntax
*datatype*[] *nameOfArray* = { *elt1*, *elt2*, ... };
            OR
*datatype* *nameOfArray*[] = { *elt1*, *elt2*, ... };
int[] myArray = {10,20,30,40};
* Here the length of the array is determined by the number of values provided between braces and separated by commas.

## Accessing an Array
1. Using **for** loop
for (int i=0; i < *nameOfArray*.length; i++)
    System.out.println(*nameOfArray*[i]);

2. Using **for-each** loop
for (*datatype* *variable* : *Array*)
    System.out.println(*nameOfArray*[i]);

- Ex:
for(int i : arr)
    System.out.println(arr[i]);

3. Using **Arrays.toString()** method
System.out.println(Arrays.toString(*nameOfArray*));


