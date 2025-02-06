///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// */
//
//package com.mycompany.main;
//import java.util.*;
//
///**
// *
// * @author user
// */
//public class Main {
//
//    public static void main(String[] args) {
////        System.out.println("Hello World!");
////        int num1 = 10;
////        int num2 = 2;
////        int rem = num1%num2;
////        System.out.print("Remainder of num1/num2 is " +rem);
//
//////ques : average of three numbers
////
////int num1,num2,num3;
////num1 = 10;
////num2 = 20;
////num3 = 30;
////
////double avg = (num1+num2+num3)/3;
////
////        System.out.print(avg);
////        
//
////
//
////ques : swap two numbers without using a temporary variable
//
////int num1 = 10;
////int num2 = 20;
////
////num1 = num1 + num2;
////num2 = num1 - num2;
////num1 = num1 - num2;
////
////        System.out.println("num1 is " + num1);
////        System.out.println("num2 is " + num2);
//
////Type casting in java
//
////implicit casting , up casting , widening , compiler
//
////int a = 5;
////double b = a;
////
////        System.out.print(b);
//
////explicit casting , down , narrowing
//
////double a = 14.5;
////int b = (int)a;
////        System.out.print(b);
//
////char and boolean can never be interconverted
//
//
////user input 
//
////Scanner sc = new Scanner(System.in);
////integer
////        System.out.print("Enter a number = ");
////int num1 = sc.nextInt();
////        System.out.print(num1);
// 
//
////string ---> sc.next() , sc.nextLine()
//
////conditional statements if{} else if{}
//
////ques : take a number from user and check whether it is positive or negative
//
//
////Scanner sc = new Scanner(System.in);
////        System.out.print("Enter the number");
////int num = sc.nextInt();
////
////if(num >= 0){
////    System.out.print(num + " is positive");
////}else{
////    System.out.print(num + " is negative");
////}
// 
//
////SWITCH CASE IMPLEMENTATION
//
////Scanner sc = new Scanner(System.in);
////char ch = sc.next().charAt(0);
////
////switch(ch){
////    case 'a':
////        System.out.print("you entered a vowel a");
////        break;
////        
////        case 'e':
////        System.out.print("you entered a vowel e");
////        break;
////        
////        case 'i':
////        System.out.print("you entered a vowel i");
////        break;
////        
////        case 'o':
////        System.out.print("you entered a vowel o");
////        break;
////        
////        case 'u':
////        System.out.print("you entered a vowel u");
////        break;
////        
////        default:
////            System.out.print("not a vowel character");
////        
////        
////}
//
////QUES : FEE ACORDING TO VEHICLE TYPE
//
////Scanner sc = new Scanner(System.in);
////        System.out.print("Enter your vehicle type : ");
////        int fee;
////        String vehicleType = sc.nextLine();
////        switch(vehicleType){
////            case "car" :
////                fee = 20;
////                System.out.print("Fee for your vehicle type car is $"+fee );
////                break;
////                
////                case "bike" :
////                fee = 10;
////                System.out.print("Fee for your vehicle type bike is $"+fee );
////                break;
////                
////                case "truck" :
////                fee = 30;
////                System.out.print("Fee for your vehicle type truck is $"+fee );
////                break;
////                
////                default :
////                    System.out.print("unknown vehicleType and fee for this vehicle is &0");
////                
////        }
//
//
//
////WHILE LOOP IMPLEMENTATION
//
//
////int i = 1;
////int value;
////        System.out.print("Enter which table you want ");
////        Scanner sc = new Scanner(System.in);
////        value = sc.nextInt();
////        
////while(i<=10){
////    System.out.println(value +" * " +i + " = " +(value*i));
////    i++;
////}
//
////FOR LOOP IMPLENTATION
//
////NESTED FOR LOOP IMPLEMENTATION
//
////QUES : SUM OF 0DD NUMBERS TILL 20 USING WHILE LOOP
//
////QUES : SUM OF FIRST N NATURAL NUMBERS
//
////QUES : PRINT J<=I WAALA PATTERN 
//
////QUES : PRINT J = N AND J >= I WAALA PATTERN
//
////QUES : PASSWORD MATCHING USING DO WHILE LOOP IF(PASS=NEWPASS) => BREAK ELSE WRONG PASSWORD
//
////QUES : NUMBER GUESSING  GAME USING RANDOM CLASS
//
//
////Random ran = new Random();
////Scanner sc = new Scanner(System.in);
////int number_To_Guess = ran.nextInt(10) + 1;
////int your_number;
////
////do{
////    System.out.print("Guess a number = ");
////    your_number = sc.nextInt();
////    if(your_number == number_To_Guess){
////        System.out.println("Congratulations, you won");
////        break;
////    }else if(your_number > number_To_Guess){
////        System.out.println("Too High");
////    }else if(your_number < number_To_Guess){
////        System.out.println("To Low");
////    }
////}while(true);
//
////STRING IMPLMENTAIONS
//
////String str = "Mayank";
////
////String str1 = new String("Mayank");
//
////Memory -> stack and heap.
////stack stores str and str1 
////heap stores Mayank 
////but if you are using method 1 it Mayank goes into String Constant pool which saves memory
//
////immutable : jvm deletes old string and adds new string
//
//
////SPECIAL CHARACTERS
//// ->  " \"string\" "
//// ->   //   
//// -> \t
//
////STRING FUCTIONS 
//
///*
//1. str1.concat(str2)
//2. str.length() interger
//3. str.contains("aur"); boolean
//4. str.toUpperCase  Lower
//5. str1.equals(str2)  boolean
//6. str1.equalsIgnoreCase(str2)
//7. str1.replace('char' , 'new char') string also 
//8. str1.trim() // starting ending space delete
//9. str1.indexOf('character') // first index if duplicate characters
//*/
//
///*
//OBJECT ORIENTED PROGRAMMING
//
//Functions
//
//public static int sum(int a , int b)
//{
//
//      body
//
//
//}
//
//static means no need to create object to call functions since it is created inside class
//
//
//functions should be declared inside class
//
//function to add two numbers
//
//function to check if a number is even or not ----> static boolean isEven(int a)
//
//CLASSES AND OBJECTS :
//
//
//TANGIBLE AND INTANGIBLE OBJECTS
//
//class don't take space is memory but objects do
//
//
// CONSTRUCTOR
//
//1.DEFAULT CONSTRUCTOR
//2.NON PARAMETERISED CONSTRUCTOR
//3.PARAMETERIZED CONSTRUCTOR
//
//this keyword is used to tell compiler that this variable is class variable 
//in case we have passed same name variable in constructor calling
//
//
//
//ACCESS MODIFIERS
//1.PUBLIC
//2.PRIVATE
//3.PROTECTED IN INHERITANCE
//
//
//DATA ENCAPSULATION : USED FOR HIDING DATA USING PRIVATE ..... SETTERS AND GETTERS ARE USED.
//
//->SETTERS CAN BE REPLACED BY PARAMETERISED CONSTRUCTORS
//->GETTERS CAN'T BE REPLACED.
//
//
//
//INHERITANCE
//
//->JAVA DON'T SUPPORT MULTIPLE INHERITANCE
//->SINGLE INHERITANCE
//  EXTENDS KEYWORD IS USED
//
//
//BY USING INHERITANCE CODE REUSABILITY IS PROMOTED 
//LIKE WE CREATE A STUDENT CLASS HAVING ATTRIBUTES NAME AGE AND METHODS DISPLAY_INFO
//THEN BY ,
//
//CLASS TEACHER EXTENDS STUDENT{
//    BODY IS LEFT EMPTY
//}
//
//INT MAIN(){
// 
//TEACHER T1 = NEW TEACHER();
//T1.NAME = "MAYANK"
//T1.AGE = 21
//
//}
//
//WE CAN USE THEIR ATTRIBUTES AND FUCNTIONS IN THIS MANNER
//
//WE CAN INHERIT ONLY WITHIN THE PACKAGE IF OUR CLASS IS DEFAULT NOT PUBLIC
//BUT IF OUR CLASS IS PUBLIC WE CAN INHERIT FROM DIFFERENT PACKAGES ALSO BY 
//JUST IMPORTING THE PACKAGE.  ~IMPORT PACKAGE
//PUBLIC THE CLASS , VARIABLE AND METHODS EACH AND EVERYTHING.
//
//
//PROTECTED : CAN ACCESS IN CHILD CLASS WITHIN THE PACKAGE
//
//MULTILEVEL INHERITANCE:
//
//HIERARICHAL INHERITANCE:
//
//MULTIPLE INHERITANCE : TO REDUCE COMPLEXITY WE DON'T USE BUT
//CAN BE USED USING INTERFACES
//
//
//POLYMORPHISM:
//->COMPILE TIME : METHOD OVERLOADING -> SAME NAME METHOD IN PARENT AND CHILD 
//BUT DIFFERENT PARAMETERS(NUMBER OR TYPE)
//COMPILER DECIDED ACC TO PARAMETERS WHICH METHOD  TO CALL USING CHILD'S OBJECT
//
//
//->RUN TIME : METHOD OVERRIDING  -> SAME FUNCTION NAME IS PARENT AND CHILD  
//
//ABSTRACTION: HINDING THE IMPLEMENTATION DETAILS
//
//1.JAVA ABSTRACT CLASS --> OBJECT CANNOT BE CREATED 
//2.JAVA ABSTRACT METHOD --> ABSTRACT KEYWORD IS USED AND DON'T HAVE BODY ,
//USED  IN ABSTRACT CLASS ONLY
//
//ABSTRACT METHOD CAN BE USED IN CHILD CLASS AND DEFINED(IMPLEMTATION)
//ALL ANSTRACT CLASS SHOULD BE IMPLEMENTED OR DECLARED IN CHILD CLASS
//
//IF YOU CALL CONSTRUCTOR OF CHILD CLASS WHICH EXTENDS ABSTARCT CLASS
//YOU SHOULD MENTION super KEYWORD IN CHILD CLASS SO THAT WHILE CREATING OBJECT
//OF CHILD CLASS AND IT'S CONTRUCTOR IS CALLED AND BECAUSE OF super KEYWORD 
//ABSTRACT CLASS CONSTRUCTOR IS ALSO CALLED.
//
//}
