package guvi;
import java.util.Scanner;
public class Sumpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,m;
int temp;
int r;
int sum=0;
Scanner s=new Scanner(System.in);
System.out.print("enter the two numbers");
n=s.nextInt();
m=s.nextInt();
temp=n+m;
while(temp>0){
	r=temp%10;
	sum=(sum*10)+r;
	temp=temp/10;
}

if(sum%2==0)
{
	System.out.println("the number is palindrome");
	}
else{
	System.out.println("the number is not a palindrome");
}

	}

}
