package annotation;

import java.io.IOException;

public class HWTestxlsreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HWxlsreader xl= new HWxlsreader("E:\\\\seleniumrepository\\\\HWTestNGProject\\\\src\\\\annotation\\\\Testdata.xls");
		
		int rows=xl.getRowCount("Sheet1");
		int cols=xl.getColCount("Sheet1");
		
		System.out.println(rows);
		System.out.println(xl.getColCount("Sheet1"));
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				System.out.println(xl.getcelldata("Sheet1", r, c));
			}
	

		}

}
}