class ArrPrime
{
	public static void main(String[] args) 
	{
		int arr[][] = {{2,3},{5,6},{8,10}};

		for(int i=0; i<3; i++)
		{
			for (int j=0; j<2; j++) 
			{
				if(chkPrime(arr[i][j]))
					System.out.println(arr[i][j]);
			}
		}
	}
	static public boolean chkPrime(int num)
	{
		if(num<2)
			return false;

		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
				return false;
		}

		return true;
	}
}