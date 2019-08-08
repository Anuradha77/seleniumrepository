package arrays;

public class Array2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[][] str=new String[3][2];
		
		//Row 1
		str[0][0]="U1";
		str[0][1]="J1";
		
		//Row 2
		str[1][0]="U2";
		str[1][1]="J2";
		
		//Row 3
		str[2][0]="U3";
		str[2][1]="J3";
		
		/*System.out.println(str[0][0]+str[0][1]);
		System.out.println(str[1][0]+str[1][1]);
		System.out.println(str[2][0]+str[2][1]);*/
		
		for(int r=0; r<3; r++)
		{
			for(int c=0; c<2; c++)
			{
				/*System.out.println(str[r][c]);*/
				System.out.print(str[r][c]+" ");
			}
			System.out.println();
		} 
		
		
	}

}
