class Week2HW1_1
{
	public static void main(String[] args) {
		int t[]={4,23,45},total=0;
		while(true)
		{
			t[2]+=1;
			total+=1;
			if(t[2]==60)
			{
				t[1]+=1;
				t[2]=0;
				if(t[1]==60)
				{
					t[0]+=1;
					t[1]=0;
				}
			}
			if(t[0]==13 && t[1]==54 && t[2]==23)
			{
				break;
			}
		}
		System.out.println("4�I23��45���13�I54��23�������`��Ƭ�"+total+"��");
	}
}