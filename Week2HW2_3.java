import java.util.Scanner;

class Week2HW2_3
{
		public static void main(String []args)
		{
			Scanner op = new Scanner(System.in);

			int year;
			try
			{
				System.out.print("輸入西元年:");
				year=op.nextInt();
				int count=0;
				for(int i=1;i<=year;i++)
				{
					if(i%400==0 || (i%4==0 && i%100!=0))
					{
						System.out.print(String.format("%4d",i)+"\t");
						count++;
					}
					if(count/10==1)
					{
						System.out.println();
						count=0;
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("錯誤訊息:"+e);
			}
		}
}
