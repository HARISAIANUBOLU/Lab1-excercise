import java.util.*;

public class fibonacci {
	public static int fibo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=1,b=1;
		int temp=0;
		for(int i=3;i<=num;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
		}
		System.out.println("Nth fibonacii number using non recursive : "+b);
		System.out.println("Nth fibonacii number using  recursive : "+fibo(num));
		sc.close();

	}

}
