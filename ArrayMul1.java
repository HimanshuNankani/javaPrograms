class ArrayMul1
{
	public static void main(String[] args) 
	{
		int arr1[][] = {{1,5},{4,5},{7,8}};
		int arr2[][] = {{1,5,4},{5,7,8}};
		int arr3[][] = new int[3][3];

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				int sum = 0;

				for(int k=0; k<2; k++)
				{
					sum+=arr1[i][k]*arr2[k][j];					
				}
				arr3[i][j] = sum;
			}
		}

		for(int i=0; i<3; i++)
		{
			for (int j=0;j<3 ;j++ ) 
			{
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

//0.0*0.0 + 0.1*1.0 + 0.2*2.0    0.0*0.1 + 0.1*1.1 + 0.2*2.1