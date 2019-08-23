package basicallocation;

import java.io.IOException;

public class TestXlsReader {

	public static void main(String[] args) throws IOException 
	{
		Xls_reader xl= new Xls_reader("E:\\seleniumrepository\\TestNGProject\\src\\basicallocation\\AnuTestdata.xls");
	
		int rows=xl.getRowCount("Sheet1");
		int cols=xl.getColCount("Sheet1");
		
		System.out.println(rows);
		System.out.println(xl.getColCount("Sheet1"));
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				System.out.println(xl.getCellData("Sheet1", r, c));
				/* System.out.print(xl.getCellData("Sheet1", r, c)+" "); */
			} /* System.out.println(""); */
			
		}
		
	}

}
