package Javaconcepts;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=6;
for (int row=1;row<=no;row++)
{
	for(int col=1;col<=no;col++)
{
	if((row+col==5))
	{
		System.out.print("#");
	}
	else
	{
		System.out.print(" ");
	}
}
	System.out.println(" ");

}}}
