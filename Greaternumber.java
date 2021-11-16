import java.util.Scanner;  
public class greaterNumber  
{  
public static void main(String[] args)   
{  
int a, b, c, largest;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
//reading input from the user  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
if(a>b){
  if(a>c){
    largest = a;
  }else{
    largest = c;
  }
}else{
  if(b>c){
    largest = b;
  }else{
    largest = c;
  }
}
System.out.println("The largest number is: "+largest);  
}  
}  
