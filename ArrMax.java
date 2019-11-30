import java.util.Scanner;

class ArrMax
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int r = sc.nextInt();

		System.out.print("Enter the number of columns : ");
		int c = sc.nextInt();

		int arr[][] = new int[r][c];
		int max,max2;

		if(arr[0][0]>arr[0][1])
		{
			max = arr[0][0];
			max2 = arr[0][1];
		}
		else
		{
			max = arr[0][1];
			max2 = arr[0][0];	
		}

		System.out.println("Enter the elements");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("a["+i+"]["+j+"]  ");
				arr[i][j] = sc.nextInt();

				if(arr[i][j]>max2)
				{
					if(arr[i][j]>max)
					{
						max2 = max;
						max = arr[i][j];
					}
					else
						max2 = arr[i][j];
				}

			}
		}
		System.out.println("Max element in array is : "+max);
		System.out.println("Second Max element in array is : "+max2);
	}
}