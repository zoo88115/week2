class Week2HW1_2
{
	public static void main(String []args)
	{
		int n[]={1,2,3,4,5,6,7,8,9};
		int total=0,count=0;
		double ave;
		for(int x:n)
		{
			total+=x;
			count++;
		}
		ave=(double)total/count;
		System.out.println("Á`©M:"+total+"  ¥­§¡:"+ave);
	}
}