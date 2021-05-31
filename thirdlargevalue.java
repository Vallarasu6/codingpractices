/*Third highest value using one loop*/

import java.util.*;
public class thirdlargevalue{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      
      int secmax=-9999,max=-9999,thirdmax=-9999,n;
      //int z=x+y;
    System.out.println("Enter the array size");
    n= sc.nextInt();
     int a[] = new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the value");
        a[i]=sc.nextInt();
        if(a[i]>max && a[i]>secmax && a[i]>thirdmax){
			thirdmax=secmax;
			secmax=max;
			max =a[i];
		}
		else if(a[i]>max && a[i]<secmax && a[i]<thirdmax){
			secmax = max;
			max = a[i];
		}
		else if(a[i]>max && a[i]>secmax){
			secmax = max;
		max = a[i];
			
		}
		else if(a[i]>secmax && a[i]>thirdmax){
		thirdmax = 	secmax;
		secmax = a[i];
			
		}
		else if(a[i]<max && a[i]>secmax && a[i]>thirdmax){
			thirdmax = secmax;
			secmax = a[i];
		}
		else if(a[i]<max && a[i]<secmax && a[i]>thirdmax){
			thirdmax = a[i];
			
		}
	
	}
	if(secmax == max){
		System.out.println("NULL");
	}
	else
	System.out.println("Third highest value is"+" "+thirdmax);
    }
    
}
