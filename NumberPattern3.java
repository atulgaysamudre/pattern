class NumberPattern3
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.print("\t\t\t");
				for(int j=5; j>=i; j--)
					System.out.print(j+" ");
			System.out.println();	
		}


	}
}
