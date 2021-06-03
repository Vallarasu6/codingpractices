//Reverse the words in sentence
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
      String str = sc.nextLine();
      String[] str1 = str.split(" ");
       
      for(int i=0;i<3 ;i++){
          char[] s1=str1[i].toCharArray();
          for(int j=s1.length-1;j>=0;j--){
              System.out.print(s1[j]);
             
          }
           System.out.print(" ");
      }
     }
}