package basicallocation;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGClass1 
{
	@Test(dataProvider="getData2")
	public void loginTestCase (String username, String password)
	{
		System.out.println("username");
		System.out.println("password");
	}
	
	@DataProvider
	public  String[][] getData()
	{
		String[][] data=new String[3][2];
		
		//Row1
		
		data[0][0]= "user1";
		data[0][1]= "Password1";
		
		//Row2
		
		data[1][0]= "user2";
		data[1][1]= "Password2";
		
		//Row3
		
		data[2][0]= "user3";
		data[2][1]= "Password3";
		
		return data;
	}
	
	@DataProvider
	public  String[][] getData2() throws IOException
	{
		
		Xls_reader xl= new Xls_reader("E:\\seleniumrepository\\TestNGProject\\src\\basicallocation\\AnuTestdata.xls");
		
		int rows=xl.getRowCount("Sheet1");
		int cols=xl.getColCount("Sheet1");
		
		String[][] data=new String[rows][cols];
		
		System.out.println(rows);
		System.out.println(xl.getColCount("Sheet1"));
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				//System.out.println(xl.getCellData("Sheet1", r, c));
				data[r-1][c-1]= xl.getCellData("Sheet1", r, c);
				
				/* System.out.print(xl.getCellData("Sheet1", r, c)+" "); */
			} /* System.out.println(""); */
			
		}
		
		
		
		
		/*
		 * //Row1
		 * 
		 * data[0][0]= "user1"; data[0][1]= "Password1";
		 * 
		 * //Row2
		 * 
		 * data[1][0]= "user2"; data[1][1]= "Password2";
		 * 
		 * //Row3
		 * 
		 * data[2][0]= "user3"; data[2][1]= "Password3";
		 */
		return data;
	}
	}

