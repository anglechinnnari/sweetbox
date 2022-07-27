import java.util.Scanner;
public class lab1 {

	public static void main(String[] args) {
		System.out.println("Demonstration of Datatypes");
		//char datatype
		System.out.println("1.char");
		char marks,grade;
		marks = '8';
		grade = 'B';
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);
		//byte datatype
		System.out.println("2.byte");
		byte myByte1,myByte2;
		myByte1 = 127;
		myByte2 = -48;
		System.out.println("Byte 1: " +myByte1);
		System.out.println("Byte 2: " +myByte2);
		myByte1++;
		System.out.println("Incremented Value of myByte1: " +myByte1);
		//short datatype
		System.out.println("3.short");
		short myShort = 6000;
		System.out.println("myShort: " + myShort);
		//int datatype
		System.out.println("4.int");
		int x,y, result1;
		x= -7000;
		y= 90000;
		result1 = x + y;
		System.out.println("Number 1: " +x);
		System.out.println("Number 2: " +y);
		System.out.println("Number 1 + Number 2: " +result1);
		// float datatype
		System.out.println("5.float");
		float myFloat1,myFloat2,result2;
		myFloat1=1000.666f;
		myFloat2=110.77f;
		result2=myFloat1-myFloat2;
		System.out.println("Number1: "+myFloat1);
		System.out.println("Number2: "+myFloat2);
		System.out.println("Number1-Number2: "+result2);
		// double datatype
		System.out.println("6.double");
		double myDouble1, myDouble2, result3;
		myDouble1 = 48976.8987;
		myDouble2 = 29513.7812d;
		result3= myDouble1 + myDouble2;
		System.out.println("Number 1: " +myDouble1);
		System.out.println("Number 2: " +myDouble2);
		System.out.println("Number 1 + Number 2: " +result3);
		//long datatype
		System.out.println("7.long");
		long myLong1, myLong2, result4;
		myLong1 = 100000000L;
		myLong2 = 200L;
		result4 = myLong1 * myLong2;
		System.out.println("Number 1: " +myLong1);
		System.out.println("Number 2: " +myLong2);
		System.out.println("Number 1 * Number 2: " +result4);
		//boolean datatype
		System.out.println("8.boolean");
		int a=100, b=200;
		System.out.println(x>y);
		System.out.println("****************");
		System.out.println("Demonstration of arrays");
		System.out.println("1.Single Dimensional Array");
		int p[]=new int[5];
		p[0]=10;
		p[1]=20;  
		p[2]=70;  
		p[3]=40;  
		p[4]=50;  
     	for(int i=0;i<p.length;i++){
		System.out.println(p[i]);  
		}
		System.out.println("2.Multi Dimensional Array");
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
		System.out.println("****************");
		System.out.println("Type Casting");
		System.out.println("1.Explicit Type Casting");
		short a1=250;
		int b1=48;
		a1=(short)b1;
		System.out.println("The short value of b1 is " +a1);
		System.out.println("2.Implicit Type Casting");
		short t=172;
		int z=t;
		System.out.println("int value of short t is " +z);
		}

	}

