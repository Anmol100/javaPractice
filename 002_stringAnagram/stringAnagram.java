import java.io.*;
import java.util.Scanner;

import java.lang.Math;

class stringAnagram {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int len1,len2,c = 0,n = 1,e = 0,f = 0;

        while(n > 0){

        System.out.print("Enter first String : ");
		String str1 = in.nextLine();
        len1 = str1.length();
        System.out.println("length of String: " + len1);

        System.out.print("Enter second String : ");
		String str2 = in.nextLine();
        len2 = str2.length();
        System.out.println("length of String: " + len2);
        
        System.out.println("You entered first String : "+str1);
        System.out.println("You entered second String : "+str2);

        //int re = str1.indexOf('e');
        //System.out.println("indexOf : "+re);


        if (len1 != len2) {
            System.out.println("Please enter both strings with equal lengths ");
        } else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            char[] ch3 = new char[len1];
            int[] ch4 = new int[len1];
            int[] ch5 = new int[len1];

        for(int l = 0; l < len1;l++){ 
            for (int index = str1.indexOf(ch1[l]);index >= 0;index = str1.indexOf(ch1[l], index + 1)){
                    e++;
                    System.out.println(" ch1 = " +ch1[l]+" at index = "+index+ " and e = " +e);
                }
            ch4[l] = e++;
            e=0;
        }

        for(int m = 0;m < len1;m++){ 
            for (int index = str2.indexOf(ch2[m]);index >= 0;index = str2.indexOf(ch2[m], index + 1)){
                    f++;
                    System.out.println(" ch2 = " +ch2[m]+" at index = "+index+ " and e = " +f );
                }
            ch5[m] = f++;
            f=0;
        }


            // for (int i=0,re = str1.indexOf(ch1[i]);(len1-1) > 0;i++, re = str1.indexOf(ch1[i], re +1)){
            //     System.out.println("indexOf : "+re);
    
            // }

            for (int i = 0;i < len1;i++){
                for (int j = 0;j < len1;j++){
                    if (ch1[i] == ch2[j]) {
                        ch3[i] = ch1[i];
                        System.out.println("ch3 = : " + ch3[i] +" at j = "+j+ " and i =" +i);
                    } 
                }
            }
            System.out.println("");
            for (int k = 0;k < len1;k++){
                System.out.print(ch4[k]); 
                 
            }
            System.out.println("");
            for (int k = 0;k < len1;k++){
                System.out.print(ch5[k]); 
            }
            System.out.println("");
            if (len2 == ch3.length) {
                System.out.println(str1+ " and " + str2 + " are Anagrams ");
            } else {
                System.out.println(str1+ " and " + str2 + " are not Anagrams ");
            }
            n=0;
        }
        }

        
		// int re = bnryStr.indexOf('.');
		// System.out.println("indexOf : "+re);
		
		//if(re != -1){
			//double bnryDbl = Double.parseDouble(bnryStr); // String to double conversion
			//System.out.println("Inside If : ");
        //} else {
			// long bnryLong = Long.parseLong(bnryStr); // String to long conversion
			//System.out.println("Inside Else : ");
		//}	
		//for (int i = 0;i < l1;i++){
        //    ch1[i] = in.next();
        //}
    
        //System.out.println("You entered : "+b);    
        
        //System.out.println(" in double array  : ");

        // //for (int i = 0;i < l1;i++){
        //     System.out.println("You entered : " + bnryStr);
        //     System.out.println("length of String: " + len);
		// 	//System.out.println(" in double  : " +bnryDbl);
		// 	System.out.println(" in long  : " +bnryLong);
			
        //}
		
		// for(int i = 0;i < len;i++){
        //     rem = bnryLong%10;
        //     //System.out.println("Remainder  : " +rem);
        //     quo = bnryLong/10;
        //     //System.out.println("Quotient  : " +quo);
        //     af = rem*Math.pow(2,i);
        //     //System.out.println("af  : " +decml);
        //     decml += af; 
        //     //System.out.println("Decimal  : " +decml);
        //     bnryLong = quo;
        //     //System.out.println("bnryLong  : " +bnryLong);
		// }
			
        // System.out.println(" in Decimal  : " +decml);
        in.close();
    } 
}   