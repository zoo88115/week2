import java.util.Scanner;

class Week2HW2_1
{
		public static void main(String []args)
		{
			Scanner op = new Scanner(System.in);
			
			String name;
			int ymd[]={0,0,0};
			System.out.print("�п�J�m�W:");
			name=op.next();
			System.out.println("�п�J�ͤ�");
			System.out.print("�褸:");
			ymd[0]=op.nextInt();
			System.out.print("��:");
			ymd[1]=op.nextInt();
			System.out.print("��:");
			ymd[2]=op.nextInt();
			ymd[0]-=1911;//�褸�����ഫ
			System.out.println("�m�W:"+name);
			System.out.println("�ͤ�:����"+ymd[0]+"�~"+ymd[1]+"��"+ymd[2]+"��");		
		}
}
