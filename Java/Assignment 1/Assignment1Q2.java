

public class Assignment1Q2 {

	public static void main(String[] args) {

		AmstrongNumberInRange l = new AmstrongNumberInRange();
		l.AmstrongNumber();
		

	}

}
class AmstrongNumberInRange {
	public void AmstrongNumber ()
	{
		for (int i =100 ; i<999 ; i++)
		{
			int n = i;int k;
			int total = 0;
			while(n!=0)
			{
				k=n%10;
				total=total+(k*k*k);
				n=n/10;
			}
			if(total==i)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
			
		}
	}
}

