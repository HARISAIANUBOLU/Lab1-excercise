import java.util.Scanner;
public class SumCube {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		while(number>0)
		{
			int digit=number%10;
			digit=digit*digit*digit;
			sum+=digit;
			number=number/10;
		}
		System.out.println(sum);
		sc.close();
	}
}
