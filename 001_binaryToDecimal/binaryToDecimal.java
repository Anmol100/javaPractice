import java.io.*;
import java.util.Scanner;

import java.lang.Math;

class binaryToDecimal {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int len;
        long quo,rem,decml = 0;
        double af = 0;
		//double b = 0;
        
        //System.out.print("Pls enter the length of Binary number : ");
        //int l1 = in.nextInt();

        //double binArr[] = new double[l1];
        //char ch1[] = new char[l1];

        System.out.print("Enter a Binary number : ");
		String bnryStr = in.nextLine();
		len = bnryStr.length();
		
		int re = bnryStr.indexOf('.');
		System.out.println("indexOf : "+re);
		
		//if(re != -1){
			//double bnryDbl = Double.parseDouble(bnryStr); // String to double conversion
			//System.out.println("Inside If : ");
        //} else {
			long bnryLong = Long.parseLong(bnryStr); // String to long conversion
			//System.out.println("Inside Else : ");
		//}	
		//for (int i = 0;i < l1;i++){
        //    ch1[i] = in.next();
        //}
    
        //System.out.println("You entered : "+b);    
        
        //System.out.println(" in double array  : ");

        //for (int i = 0;i < l1;i++){
            System.out.println("You entered : " + bnryStr);
            System.out.println("length of String: " + len);
			//System.out.println(" in double  : " +bnryDbl);
			System.out.println(" in long  : " +bnryLong);
			
        //}
		
		for(int i = 0;i < len;i++){
            rem = bnryLong%10;
            //System.out.println("Remainder  : " +rem);
            quo = bnryLong/10;
            //System.out.println("Quotient  : " +quo);
            af = rem*Math.pow(2,i);
            //System.out.println("af  : " +decml);
            decml += af; 
            //System.out.println("Decimal  : " +decml);
            bnryLong = quo;
            //System.out.println("bnryLong  : " +bnryLong);
		}
			
        System.out.println(" in Decimal  : " +decml);
        in.close();
    } 
}   