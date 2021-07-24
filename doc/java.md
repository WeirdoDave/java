<h1>Java Class Notebook</h1>

## Getting Started

[Java API document] (https://docs.oracle.com/javase/8/docs/api/)

* Check Java JDK installation
```DOS
java -version
javac -version
```
* install JDK
* install Eclipse
* install VS Code
  
## Questions and Answers

❓How do I create new Java Project in Eclipse?

✔️Right-click Explore window ⟹ New ⟹ Java Project ⟹ enter name ⟹ [Finish]

❓How do I create new package?

✔️Right click your sourecode(src) 

❓How do I create new Java class?

✔️

❓How do I run Java class?
✔️There are more then one way to run java class:
1. Click the green run icon on toolbar;
2. Right-click Enditor window ⟹ Run As... ⟹ Java Application
3. Run menu ⟹ Run As... ⟹Java Application


* [HelloWorld.java](../src/../davidci/src/com/huaxia/davidci/HelloWorld.java)

1. Public modier on class is not important at this moment

2. remove public modifier on main() method. (That would make a runtime error)
   
❗️⚡️main() method must be public

3. remove static modifier on main() method. (that also made a runtime error)

❗️⚡️main() method must be static

4. remove void from main() method. (this would make a compiler error)

main() method has void return type means returns nothing

5. Change main() method return to int, and return 1, (that makes a runtime error)

6. change main() method to main1() gives runtime error

7. changing argument type from String[] to String will give error.

8. you can change the argument name!

✔️main() method is special

✔️Signature of main method includes name; argument (type, number of arguments); may be return type and modidifeir.

✔️the signature os main() method cannot be changed.


```mermaid
graph TB
A[Program Laguage Basics]
B[Data Type]
C[Operator]
D[Execution Control<br>if-else, switch]
E[Loop<br>for-loop, while-loop]

A --provides--> B & C & D & E
```
## Print
* [Print.java](../src/../john/src/com/huaxia/john/Print.java)

## Variable Naming
1. variable name cannot start with number
2. variable can only start with letter and combine with letter and number a~z, A~Z, 0~9, and _, no other special characters allowed.
3. cannot use reserved java key words and existing class name for variable name.

![](images/javaKeywords.png)

## Comment

1. single line comment
2. multiple line comment
   
❓ Why do I need comment?

1. document my code
## Data Type

[](../davidci/src/com/huaxia/davidci/DataType.java)
* 2 based number(binary number)
$$ myByte = 1\cdot2^5+1\cdot2^4+4+0*2^3+0*2^21\cdot2^1+1\cdot2^0 $$= 32+ 16 + 2 +1 
* 10 based number(decimal number)
$$ 602 = 6\cdot10^2 + 02\cdot10^0$$

* primitve data type: boolean, byte, int, float, double...
* Java defined data type: String
* Developer defined data type: Hello, Print
## Operator
* [Operators](../davidci/src/com/huaxia/davidci/Operator.java)
* arithmetic operator: +, -, *, /, %
* assignment operator: =, +=, -=, *=, /=, %=
* binary operator: ++, --, increase or decrease the variable value by 1
* comparison operator: >, <, >=, <=, ==, !=, always return boolean which are true or false
* binary operator: ++, --, increase or decrease the variable value by 1
* comparison operator: >, <, >=, <=, ==, !=, always return boolean which are true or false
*  logical operator: && and, || or, ! not; return only true or false
*  ternary operator: combination of ? and :
*  


## Loop
[For-loop, for each, continue, break](../davidci/src/com/huaxia/davidci/Loop.java)
* continue on for-loop
```mermaid
graph TB
A([Loop])
B{loop<br>condition<br>i<=10>}
C[code block 1]
D{continue<br>condition}
F[code block 2]
E[END]

A-->B
B--true-->C-->D
D--true-->B
D--False-->F-->B
B--false-->E

classDef start fill:green,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef end1 fill:red,stroke:#DE9E1F,stroke-width:2px,color:white;
classDef if fill:#EBCD6F,stroke:black,stroke-width:2px;

class A start
class E end1
class D,B if 
```
## Array

## ArrayList