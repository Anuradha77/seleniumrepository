package arrays;

public class Array1 {

	public static void main(String[] args)
	{
		String[] std=new String[9];

			std[0]="Pooja";
			std[1]="Akshay";
			std[2]="Pranali";
			std[3]="Daya";
			std[4]="Vijay";
			std[5]="Sumit";
			std[6]="Gauri";
			std[7]="Anuradha";
			std[8]="Vinod";
			
			/*System.out.println("1st name is= "+std[0]);
			System.out.println(std[1]);
			System.out.println(std[2]);
			System.out.println(std[3]);
			System.out.println(std[4]);*/
			
			/*for(int i=0; i<=8; i++)
			{
				System.out.println(std[i]);
			}*/
			
			int i=0;
			
			while(i<8)// conditional statement
			{
				//increment
				System.out.println(std[i]);
				i++;
			}
	}

}
