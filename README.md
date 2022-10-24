# DSA-with-Kunal
[![GitHub forks](https://img.shields.io/github/forks/asdsyd/DSA-with-Kunal.svg)](https://GitHub.com/asdsyd/DSA-with-Kunal/network/)
[![GitHub stars](https://img.shields.io/github/stars/asdsyd/DSA-with-Kunal.svg)](https://GitHub.com/asdsyd/DSA-with-Kunal/stargazers/)
[![GitHub watchers](https://img.shields.io/github/watchers/asdsyd/DSA-with-Kunal.svg)](https://GitHub.com/asdsyd/DSA-with-Kunal/watchers/)
[![GitHub contributors](https://img.shields.io/github/contributors/asdsyd/DSA-with-Kunal.svg)](https://GitHub.com/asdsyd/DSA-with-Kunal/graphs/contributors/)

Learn Fundamentals of Datastructres and Algorithms in Java with Kunal.

## What is Java?
<img src="https://cdn.jsdelivr.net/npm/programming-languages-logos/src/java/java.png" height="70" align="left">

[Java](https://www.java.com/) is a popular programming language first released by Sun Microsystems in 1995. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile. It is owned by Oracle.

# Let's get started 

We have 8 primitive data types in Java:
1. `byte`
2. `short`
3. `int`
4. `long`
5. `float`
6. `double`
7. `boolean`
8. `char`

Non-primitive data types include
1. `String`
2. `Arrays`
3. `Classes`

## Arrays
Now let's look at Arrays!

Array in java is a group of like-typed variables referred to by a common name.

### Creating and Initializing an Array :
1. Using **new** operator
```java
datatype[] nameOfArray = new datatype[sizeOfArray];
```

<p align="center">OR</p>

```java
datatype nameOfArray[] = new datatype[ sizeOfArray];
```

**Example:**
```java
int[] myArray = new int[10];
```

2. Shortcut syntax
```java
datatype[] nameOfArray = {elt1, elt2, ... };
```

<p align="center">OR</p>

```java
datatype nameOfArray[] = {elt1, elt2, ... };
```

**Example:**
```java
int[] myArray = {10,20,30,40};
```
💡 Note: *Here the length of the array is determined by the number of values provided between braces and separated by commas.*

### Accessing an Array
1. Using **for** loop
```java
for (int i=0; i < nameOfArray.length; i++)
    System.out.println(nameOfArray[i]);
```
2. Using **for-each** loop
```java
for (datatype variable : Array)
    System.out.println(nameOfArray[i]);
```
**Example:**
```java
for(int i : arr)
    System.out.println(arr[i]);
```

3. Using **Arrays.toString()** method
```java
System.out.println(Arrays.toString(nameOfArray));
```
