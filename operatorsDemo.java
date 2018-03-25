package conceptDemos;
/*Simple Assignment Operator
=       Simple assignment operator
Arithmetic Operators
+       Additive operator (also used
        for String concatenation)
-       Subtraction operator
*       Multiplication operator
/       Division operator
%       Remainder operator
Unary Operators
+       Unary plus operator; indicates
        positive value (numbers are 
        positive without this, however)
-       Unary minus operator; negates
        an expression
++      Increment operator; increments
        a value by 1
--      Decrement operator; decrements
        a value by 1
!       Logical complement operator;
        inverts the value of a boolean
Equality and Relational Operators
==      Equal to
!=      Not equal to
>       Greater than
>=      Greater than or equal to
<       Less than
<=      Less than or equal to
Conditional Operators
&&      Conditional-AND
||      Conditional-OR
?:      Ternary (shorthand for 
        if-then-else statement)
Type Comparison Operator
instanceof      Compares an object to 
                a specified type 
Bitwise and Bit Shift Operators
~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive OR*/
public class operatorsDemo {

	public static void main(String[] args) {
		// assignment operator
		int a=10;
		int b = 20;
	    int c=30;
	    int d= a+b+c;
	    //Arithmetic Operators
		System.out.println("Addition of a , b and c is : "+d);
		System.out.println("\nSubstration of c and a is "+(c-a));
		System.out.println("\nb divided by a is :" +(b/a));
		System.out.println("b multiplied by a is :" +(b*a));
		System.out.println("Remider of c divided by a is : "+(c%a));
		
		//Logical operators
		boolean res = (a==b)&&(a!=b);
		System.out.println(res);
		boolean res1 = (a==b)||(a!=b);
		System.out.println(res1);
		
		//Conditional Operators
		int f =a>b?a:b;
		System.out.println(f);
		
		//Unary plus operator
			a= +1;
			System.out.println(a);
		//Unary minus operator;
			a= -a;
			System.out.println(a);
		//Increment operator
			a++;
			System.out.println(a);
		//Decrement operator
			a--;
			System.out.println(a);
		// Pre and Post Increment operators
			 b= a+a++-a-++a;
			 c = ++b + a++-b+a +a++;

			System.out.println(c);
			System.out.println(b);
			
			//Equality and Relational Operators
			int value1 = 1;
	        int value2 = 2;
	        if(value1 == value2)
	            System.out.println("value1 == value2");
	        if(value1 != value2)
	            System.out.println("value1 != value2");
	        if(value1 > value2)
	            System.out.println("value1 > value2");
	        if(value1 < value2)
	            System.out.println("value1 < value2");
	        if(value1 <= value2)
	            System.out.println("value1 <= value2");
	        // unary bitwise complement operator "~" inverts a bit pattern
	        
	        int g =0x000F;
	        System.out.println("bit " + g);
	        
			
	}

}
