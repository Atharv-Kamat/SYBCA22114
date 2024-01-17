package gitHubProject;

import java.util.Scanner;

public class GitHubProject {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a,b,sum;
			System.out.println("Enter the two numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a + b;
			System.out.println("The sum of two numbers is " + sum);
		}
	}

}
