package pattern;
import java.util.*;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N Value:");
		int n=sc.nextInt();
		sc.close();
		Pattern1(n);
		Pattern2(n);
		Pattern3(n);
		Pattern4(n);
		Pattern5(n);
		Pattern6(n);
		Pattern7(n);
		Pattern8(n);
		Pattern9(n);
		Pattern10(n);
		Pattern11(n);
		Pattern12(n);
		Pattern13(n);
		Pattern14(n);
		Pyramid1(n);
		Pyramid2(n);
		Pyramid3(n);
		Pyramid4(n);
		Pyramid5(n);
		Pyramid6(n);
		Pyramid7(n);
	}
	public static void Pattern1(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j)
				{
					if(i==0 || i==j || j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern2(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=n-1)
				{
					if(i==0 || j==0 || i+j==n-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern3(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n*2;j++)
			{
				if(i==j || i==0)
					System.out.print("*");
				else if(i+j==(n*2)-1 && i<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern4(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n*2;j++)
			{
				if((i==0 && j==n-1)|| i+j==n-1 || j-i==n-1 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern5(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n*2) - 1 ;j++)
			{
				if(i==0&&j<n-1 || i==j&&i<n-1 || (j-n)+1==i&&i<n-1 || i==n-1&&j>=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern6(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n*2) - 1 ;j++)
			{
				if(i==0&&j>n-1 || i+j==n-1&&i<n-1 || i+j==(n*2)-1 || i==n-1&&j<=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern7(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j && i+j<=n)
					if((i==j&& n/2!=i) || i+j==n-1 || j==0)
						System.out.print("*");
					else
						System.out.print(" ");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern8(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i<=j && i+j>=n-1)&&(i==j||i+j==n-1||j==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern9(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j>=n-1 && i>=j)&&(i==j || i+j==n-1 || j==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i<=j && i+j<=n-1) && (i==j || i+j==n-1 || j==0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern10(int n)
	{
		int c=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
					System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern11(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern12(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==n-1 || j==0 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern13(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==j || i+j==n-1)||(i==0 || i==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	public static void Pattern14(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i>=j && i+j<=n-1)||(i<=j && i+j>=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------");
	}
	public static void Pyramid1(int n)
	{
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
	}
	public static void Pyramid2(int n)
	{
        for (int i=n;i>0;i--)
        {
            for (int j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++ )
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
	}
	public static void Pyramid3(int n)
	{
        for (int i=n;i>0;i--)
        {
            for (int j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++ )
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
	}
	public static void Pyramid4(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0;j<n-1;j++)
				if(i+j>=n-1)
					System.out.print(j+1);
				else
					System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				if(j<=n)
					System.out.print(n-j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
	}
	public static void Pyramid5(int n)
	{
		System.out.print(" ");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
		for(int j=1,k=2*i-1; j<=2*i-1; j++,k--)
		{
			if(j <= k)
				System.out.print(j);
			else
				System.out.print(k);
		}
		System.out.println();
		System.out.print(" ");
		}
		System.out.println("---------------------------");
	}
	public static void Pyramid6(int n)
	{
        for(int i=0; i<n; i++)
        {
            for(int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
	}
	public static void Pyramid7(int n)
	{
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++ )
            {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
	}
}
