package session1;

import java.util.Scanner;

public class Problem1 {
	public static int numberOfGrandchildren(String[][] members,String find) {
		for(int i=0;i<members.length;i++)
		{
			if(members[i][1].equals(find))
			{
				return numberOfGrandchildren(members,members[i][0]) + 1;
			}else {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number Of Generations:");
		int generations = scan.nextInt();
		String[][] members = new String[generations][2];
		String find;
		for(int i=0;i<generations;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(j==0) 
				{
					System.out.println("Enter the "+ (i+1) +" generation Child Name:");
					members[i][j]=scan.next();
				}else 
				{
					System.out.println("Enter the "+ (i+1) +" generation Father Name:");
					members[i][j]=scan.next();
				}
			}
		}
		System.out.println("Enter the Name to find:");
		find=scan.next();
		scan.close();
		System.out.println(numberOfGrandchildren(members,find));
	}
}
