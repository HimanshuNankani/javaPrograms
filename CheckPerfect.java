class CheckPerfect
{
	public static void main(String[] args)
	{
		int num,sum,i;

		num = Integer.parseInt(args[0]);

		sum = 0;

		for (i=1;i<=num/2;i++ ) 
		{
			if (num%i==0) 
			{
				sum+=i;
			}
		}
		//System.out.println(sum);
		//System.out.println(num);
		if (num==sum) 
			System.out.println(num+" is a Perfect Number");
		else
			System.out.println(num+" is Not a Perfect Number");
	}
}