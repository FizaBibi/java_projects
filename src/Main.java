import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        System.out.println("Enter 1 to check Even and Odd");
        System.out.println("Enter 2 to calculate sum of natural numbers");
        System.out.println("Enter 3 to display the table of a number entered by user");
        System.out.println("Enter 4 to calculate the factorial of a number entered by user");
        System.out.println("Enter 5 to check whether the number is prime or not,entered by user");
        System.out.println("Enter 6 to find the largest number among 3 numbers  entered by user");
        System.out.println("Enter 7 to print the  Fibonacci series up to N terms, where N is entered by the user. ");
        System.out.println("Enter 8 to print the reverse of a number entered by user ");
        System.out.println("Enter 9 to print Even numbers from 1 to 100");
        System.out.println("Enter 10 to count the number of digits in an integer");
        System.out.println("Enter 11 to check whether the number is palindrome or not");
        System.out.println("Enter 12 to sum of the digits of a number given by user");
        System.out.println("Enter 13 to print the sum of odd numbers between 1 to N where N is input by user");
        System.out.println("Enter 14 to calculate the GCD of two numbers given by user");
        System.out.println("Enter 15 to calculate the power of the number ");
        System.out.println("Enter 16 to check whether the character is vowel or consonant");
        System.out.println("Enter 17 to check whether the given year is leap year or not");
        System.out.println("Enter 18 to print the sum of multiples of 3 and 5 below 1000");
        System.out.println("Enter 19 to check whether the number is an Armstrong Number");
        System.out.println("Enter 20 to covert binary number to decimal number");
        System.out.println("Enter 21 to prints the numbers from 1 to 100 but replaces multiples of 3 with \"Fizz\" \n" +
                "and multiples of 5 with \"Buzz\". For numbers which are multiples of both 3 and 5, print \n" +
                "\"FizzBuzz\". ");
        System.out.println("Enter 22 to prints a pattern of stars in the shape of a pyramid, where the number of \n" +
                "rows is input by the user");
        System.out.println("Enter 23 to prints the sum of squares of the first N natural numbers, where N is input by the user. ");
        System.out.println("Enter 24 to check whether the number is positive, negative or zero");
        System.out.println("Enter 25 to calculate and display the sum of the first N even numbers.");
        System.out.println("Enter 26 to find the second largest number in an array of integers. ");
        System.out.println("Enter 27 to  calculates the compound interest for a given principal, rate, and time using loops. ");
        System.out.println("Enter 28 to prints the prime numbers between 1 and 100.");
        System.out.println("Enter 29 to checks if a given number is a perfect number.");
        System.out.println("Enter 30 to simulates a simple ATM. The user should be able to deposit, withdraw,and check the balance");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                checkEvenOdd();
                break;
            }
            case 2: {
                calculateSum();
                break;
            }
            case 3: {
                printTable();
                break;
            }
            case 4: {
                calculateFactorial();
                break;
            }
            case 5: {
                checkPrime();
                break;
            }
            case 6: {
                findLargest();
                break;
            }
            case 7: {
                printFibonacci();
                break;
            }
            case 8:
            {
                printReverse();
                break;
            }
            case 9:
            {
                printEven();
                break;
            }
            case 10:
            {
                countDigits();
                break;
            }
            case 11:
            {
                checkPalindrome();
                break;
            }
            case 12:
            {
                calculateSumOfDigits();
                break;
            }
            case 13:
            {
                calculateSumOfOdd();
                break;
            }
            case 14:
            {
                calculateGCD();
                break;
            }
            case 15:
            {
                calculatePower();
                break;
            }
            case 16:
            {
                checkVowel();
                break;
            }
            case 17:
            {
                checkLeapYear();
                break;
            }
            case 18:
            {
                printMultiples();
                break;
            }
            case 19:
            {
                checkArmstrong();
                break;
            }
            case 20:
            {
                binaryToDecimal();
                break;
            }
            case 21:
            {
                replaceMultiples();
                break;
            }
            case 22:
            {
                printPyramid();
                break;
            }
            case 23:
            {
                sumOFSquares();
                break;
            }
            case 24:
            {
                checkInteger();
                break;
            }
            case 25:
            {
                printSumOfEven();
                break;
            }
            case 26:
            {
                break;
            }
            case 27:
            {
                break;
            }
            case 28:
            {
                break;
            }
            case 29:
            {
                break;
            }
            case 30:
            {
                break;
            }
            default:
            {
                System.out.println("Invalid choice...");
                break;
            }

        }
    }

    //method to check whether the number is even or odd
    public static void checkEvenOdd()
    {
        int a;
        System.out.println("Enter a number:");
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }

    }

    //program to calculate the sum of natural numbers
    public static void calculateSum() {
       int num;
       int sum=0;
        System.out.println("Enter a number for sum:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of "+num +"natural numbers are: "+sum);
    }
    //program to print the table of a number entered by user
    public static void printTable() {
        int num;
        System.out.println("Enter a number to print table");
        num=sc.nextInt();
        System.out.println("The table is:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"  x  "+i+" = "+num*i);
        }


    }
    //program to calculate the factorial of a number entered by user
    public static void calculateFactorial()
    {
        int num;
        int factorial=1;
        System.out.println("Enter a number for factorial");
        num=sc.nextInt();
        for(int i=num;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println("The factorial of "+num+" is "+factorial);

    }
    //program to check the given number is prime number or not
    public static void checkPrime()
    {
        int num;
        System.out.println("Enter a number to check for a prime number");
        num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("The number is not a prime number");
                break;
            }
            if(num%i!=0)
            {
                System.out.println("The number is a prime number");
                break;
            }
        }
    }
    //program to check the largest number from 3 numbers
    public static void findLargest()
    {
         int a,b,c;
  Scanner sc=new Scanner(System.in);
        System.out.println("Input 1st number:");
        a=sc.nextInt();
        System.out.println("Input 2nd number:");
        b=sc.nextInt();
        System.out.println("Input 3rd number:");
        c=sc.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("The greatest: "+a);
        }
        else if((b>a)&&(b>c))
        {
            System.out.println("The greatest: "+b);
        }
        else
        {
            System.out.println("The greatest: "+c);
        }
    }
    //program to print the Fibonacci series till the number entered by user
    public static void  printFibonacci(){
        int num;
        System.out.println("Enter a number to check for fibonacci series");
        num=sc.nextInt();
        int[]arr=new int[num];
        arr[0]=0;
        arr[1]=1;
        System.out.println("Fibonacci series is:");
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i=2;i<num;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
    }
    //program to print the reverse of a number
    public static void printReverse()
    {
        int num;
        System.out.println("Enter a number to print a reverse number");
        num=sc.nextInt();
//        while(num!=0) {
//            int reminder = num % 10;
//            num = num / 10;
//            System.out.print(reminder);
//
//        }

        for( ;num!=0; )
        {
            int reminder = num % 10;
           num=num/10;
            System.out.print(reminder);
        }

    }

    //program tpo print all even number from 1 to 100
    public static void printEven()
    {
        System.out.println("Even numbers from 1 to 100 are:");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
        }
    }
    //program to count the number of digits in the integer
    public static void countDigits() {
        int num;
        int count=0;
        System.out.println("Enter a number to count the number of digits");
        num=sc.nextInt();
        //using while loop
//      while(num!=0) {
//            count++;
//            num = num / 10;
//        }
        for(;;)
        {
            //int reminder = num % 10;
           count++;
           num = num / 10;
           if (num==0) {
               break;
           }
        }
        System.out.println("The numbers of digits are: "+count);
    }
    //program to check the palindrome
    public static void checkPalindrome() {

        int num;
        System.out.println("Enter a number to check palindrome");
        num=sc.nextInt();
        int number=num;
        int reverse=0;
        while(num!=0) {
            int reminder = num % 10;
            reverse=(reverse * 10) + reminder;
            num = num / 10;
        }
       // System.out.println(reverse);
        if(number==reverse)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
    }
    //program to calculate the sum of the given digits
    public static void calculateSumOfDigits()
    {
        int num;
        int sum=0;
        System.out.println("Enter a number to calculate the sum of its digits");
        num=sc.nextInt();
        while(num!=0) {
            int reminder = num % 10;
            num = num / 10;
            sum=sum+reminder;
        }
        System.out.println("The sum of digits is: "+sum);
    }

    // program to calculate sum of odd number till n, n is given by user
    public static void calculateSumOfOdd()
    {
        int num;
        int sum=0;
        System.out.println("Enter a number for sum of odd numbers");
        num=sc.nextInt();
        for(int i=2;i<num;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("The sum of the odd numbers between 1 to "+ num +" is " +sum);
    }
    //program to find the greatest common divisor of 2 numbers
    public static void calculateGCD()
    {

    }
    //program to calculate the power of a number
    public static void  calculatePower()
    {
        int base;
        int power;
        int num=1;
        System.out.println("Enter base:");
        base=sc.nextInt();
        System.out.println("Enter power:");
        power=sc.nextInt();
        for(int i=power;i>=1;i--)
        {
            num=num*base;
        }
        System.out.println("The power of  "+ base +" is "+num);
    }
    //check whether the given character is vowel or consonant
    public static void checkVowel()
    {
        char a;
        System.out.println("Enter a character:");
        a=sc.next().charAt(0);
        if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
        {
            System.out.println(a +" is a vowel");
        }
        else
        {
            System.out.println(a +" is a consonant");
        }
    }
    // program to check whether the given year is leap year or not
    public static void checkLeapYear()
    {
        int num;
        System.out.println("Enter an year to check for leap year");
        num=sc.nextInt();
        if(num%4==0)
        {

        }


    }
    //to print the sum of multiples of 3 and 5
    public static void printMultiples()
    {
      int sum1=1;
      int sum2=1;
      for(int i=2;i<=1000;i++)
      {
          if(i%3==0)
          {
              sum1+=i;
          }
          if(i%5==0)
          {
              sum2+=i;
          }
      }
        System.out.println("The sum of multiples of 3 are:"+sum1);
        System.out.println("The sum of multiples of 5 are:"+sum2);
    }
    //program to check whether the number is an Armstrong number or not
    public static void checkArmstrong()
    {
        int num;
        int count=0;
        System.out.println("Enter a number to check the number is Armstrong number or not");
        num=sc.nextInt();
       int  number1=num;              //to store the initial value of number
       // System.out.println(number1);
        int number2=0;                  //stores the sum of numbers
        while(num!=0) {
            int reminder = num % 10;
            count++;
            num = num / 10;
        }
        int newNumber=number1;
       // System.out.println("count: "+count);
        while(number1!=0) {
            int reminder = number1 % 10;
            number1 = number1 / 10;
            number2= (int) (number2+(Math.pow(reminder,count)));
        }
        if(newNumber==number2)
        {
            System.out.println("The number is an Armstrong Number");
        }
        else
        {
            {
                System.out.println("The number is not an Armstrong Number");
            }
        }

    }
 //covert the binary number into decimal number
    public static void binaryToDecimal()
    {
        int num;
        int pow=0;
        int decimalNumber=1;
        System.out.println("Enter a binary number");
        num=sc.nextInt();
        while(num!=0) {
            int reminder = num % 10;
            num = num / 10;
            decimalNumber= (int) (decimalNumber+(reminder*Math.pow(2,pow)));
            pow++;
        }
        System.out.println("The conversion from binary to decimal is:"+decimalNumber);
    }
    // replace the multiples of 3 and 5 with String
    public static void replaceMultiples()
    {
        for(int i=1;i<=100;i++)
        {

            if(i%3==0)
            {
                System.out.print(" Fizz ");
            }
            else if(i%5==0)
            {
                System.out.print(" Buzz ");
            }
            else if((i%3==0)&&(i%5==0))
            {
                System.out.println(" FizzBuzz ");
            }
            else
            {
                System.out.println(i+" ");
            }
        }
    }
    //print the pyramid pattern using *
    public static void printPyramid()
    {
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)         //for rows
        {
          for(int k=i;k<num;k++)
          {
              System.out.print(" ");
          }
            for(int j =1;j<=i; j++)
            {

                System.out.print("* ");
                continue;
            }
            System.out.println();
        }
    }
    // calculate the sum of squares of natural numbers input by user
    public static void sumOFSquares()
    {
        int num;
        int sum=0;
        System.out.println("Enter a  number");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum=sum+(i*i);
        }
        System.out.println("The Sum of the squares of first "+num +" numbers are "+sum );
    }
    //check the number is positive negative or zero
    public static void checkInteger()
    {
        int num;
        System.out.println("Enter  a number: ");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("The number is positive");

        }
        else if(num<0)
        {
            System.out.println("The number is negative");
        }
        else if(num==0)
        {
            System.out.println("Th number is zero");
        }
        else
        {
            System.out.println();
        }
    }
    //display the sum of N even numbers
    public static void printSumOfEven() {
        int num;
        int sum = 0;
        System.out.println("Enter  a number: ");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of 1 to "+num+ "even numbers are "+sum);
    }






    }//end of class