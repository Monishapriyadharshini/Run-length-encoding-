# Run-length-encoding-
A java program to perform run length encoding in a string
import java.util.*;
import java.io.*;

public class Run{ 
    
  
    public static void main(String[] args) 
    { 
       Scanner sc=new Scanner(System.in);
       String str;
       int n,i,count,j;
       str=sc.next();
       n=str.length();
       for(i=0;i<n;i++)
       {
          count=0;
         // j=i;
          while(i<n-1 && str.charAt(i)==str.charAt(i+1))
          {
            count++;
            i++;
          }
          System.out.print(str.charAt(i));
          System.out.print(count+1);
       }
    } 
} 
