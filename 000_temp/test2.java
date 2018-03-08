import java.io.*;
        import java.util.Scanner;
        
        import java.lang.Math;
        
        class test2 {
            public static void main(String args[]) {
                Scanner in = new Scanner(System.in);
                int len1,len2,len3,c = 0,n = 1,e = 0,f = 0;
        
        
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

                char[] ch1 = str1.toCharArray();
                int[] ch4 = new int[len1];
                char[] ch2 = str2.toCharArray();
                int[] ch5 = new int[len1];
                char[] ch3 = new char[len1];
                    

                for(int l = 0; l < len1;l++){ 
                    for (int index = str1.indexOf(ch1[l]);index >= 0;index = str1.indexOf(ch1[l], index + 1)){
                            e++;
                            System.out.println(" ch1 = " +ch1[l]+" at index = "+index+ " and e = " +e+" C = "+c);
                        }
                    c += e;
                    ch4[l] = e;
                    if (c == len1){
                        break;
                    }
                    e=0;
                }

                c=0;
                
                for(int m = 0;m < len1;m++){ 
                    for (int index = str2.indexOf(ch2[m]);index >= 0;index = str2.indexOf(ch2[m], index + 1)){
                            f++;
                            System.out.println(" ch2 = " +ch2[m]+" at index = "+index+ " and f = " +f+" C = "+c);
                        }
                    c += f;
                    ch5[m] = f;
                    if (c == len2){
                        break;
                    }
                    f=0;
                }

                System.out.println("");
                for (int k = 0;k < len1;k++){
                    System.out.print(ch4[k]); 
                 
                }
                
                System.out.println("");

                for (int k = 0;k < len1;k++){
                     System.out.print(ch5[k]); 
                }
                //int re = str1.indexOf('e');
                //System.out.println("indexOf : "+re);
        
        
                // if (len1 != len2) {
                //     System.out.println("Please enter both strings with equal lengths ");
                // } else {
                    //char[][] ch6 = new char[len1][len2];
                    
                    
                    // 

                // for(int p = 0;p < 2;p++){
                //     for(int r = 0;r < len2;r++){
                //         char[]
                //     }
                // }
        
                
            
                in.close();
            } 
        }   
