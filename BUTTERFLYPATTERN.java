//Butterfly pattern
import java.util.*;
class Pattern{
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			//1st part stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//spaces
			for(int j=1;j<=2*(n-i);j++){
				System.out.print(" ");
			}
			//2nd part stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd half
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}