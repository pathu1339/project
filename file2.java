class DemoSingleArray2
{
	public static void main(String args [])
	{
		int a[]={10,20,30,40,50,60};
		//for loop
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		
		//for each
		for(int i : a)
		{
			System.out.println(i);
		}
	}
}
