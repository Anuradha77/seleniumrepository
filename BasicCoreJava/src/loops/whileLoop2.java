package loops;

public class whileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean login=false;
		
			for(int i=0; i<=5; i++)
			{
				if(login)
				{
					break;
				}
				
				if(i==4)
					
					login=true;
							
				
			}
			
			System.out.println("Testing "+login);
			
	}

}
