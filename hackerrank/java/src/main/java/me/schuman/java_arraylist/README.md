https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

Sometimes it's better to use dynamic size arrays. Java's [Arraylist](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) can provide you this feature. Try to solve this problem using Arraylist.

You are given **_n_** lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in **_y<sup>th</sup>_** position of **_x<sup>th</sup>_** line.

Take your input from System.in.

**Input Format**

The first line has an integer **_n_**. In each of the next **_n_** lines there will be an integer **_d_** denoting number of integers on that line and then there will be **_d_** space-separated integers. In the next line there will be an integer **_q_** denoting number of queries. Each query will consist of two integers **_x_** and **_y_**.

**Constraints**

- **1 &le; _n_ &le; 20000**
- **0 &le; _d_ &le; 50000**
- **1 &le; _q_ &le; 1000**
- **1 &le; _x_ &le; _n_**

Each number will fit in signed integer.

Total number of integers in **_n_** lines will not cross **10<sup>5</sup>**.

**Output Format**

In each line, output the number located in **_y<sup>th</sup>_** position of **_x<sup>th</sup>_** line. If there is no such position, just print "ERROR!"

**Sample Input**

```
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
```

**Sample Output**

```
74
52
37
ERROR!
ERROR!
```
Explanation

The diagram below explains the queries:

<img src="https://s3.amazonaws.com/hr-assets/0/1489168616-b25dd38013-arraylist.png"/>