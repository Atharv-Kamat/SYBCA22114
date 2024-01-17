package gitHubProject;

import java.util.Scanner;

public class GitHubProject {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a,b,sum,sub;
			System.out.println("Enter the two numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a + b;
			System.out.println("The sum of two numbers is " + sum);
			sub = display(a,b);
			System.out.println("The subtraction of two numbers is " + sub);
		}
	}

	public static int display(int a,int b) {
		int s;
		s = a - b;
		return s;
	}
}
