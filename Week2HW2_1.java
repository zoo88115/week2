import java.util.Scanner;

class Week2HW2_1
{
		public static void main(String []args)
		{
			Scanner op = new Scanner(System.in);
			
			String name;
			int ymd[]={0,0,0};
			System.out.print("請輸入姓名:");
			name=op.next();
			System.out.println("請輸入生日");
			System.out.print("西元:");
			ymd[0]=op.nextInt();
			System.out.print("月:");
			ymd[1]=op.nextInt();
			System.out.print("日:");
			ymd[2]=op.nextInt();
			ymd[0]-=1911;//西元民國轉換
			System.out.println("姓名:"+name);
			System.out.println("生日:民國"+ymd[0]+"年"+ymd[1]+"月"+ymd[2]+"日");		
		}
}
