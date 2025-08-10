//write a program on Bitwise Operators.
/* What Are Bitwise Operators?
In Java, bitwise operators work directly on the binary representation of integers (byte, short, int, long, and char).
Instead of working with whole numbers, they operate bit by bit. There are 7 types of Bitwise operators. they are:
1)Bitwise AND denoted by &
2)Bitwise OR denoted by |
3)Bitwise XOR denoted by ^
4)Bitwise Complement denoted by ~
5)Left shift denoted by <<
6)Right shift denoted by >>
*/
package Day1;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 5, b = 3;
        System.out.println((a & b));  
        System.out.println((a | b));  
        System.out.println((a ^ b));  
        System.out.println((~a));        
        System.out.println((a << 1));
        System.out.println((a >> 1));
        }

}

/*
 output:
 1
7
6
-6
10
2
*/

