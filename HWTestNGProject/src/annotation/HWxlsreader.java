package annotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class HWxlsreader 

{
	String filepath = null;
	
	public HWxlsreader (String filepath)
	{
		this.filepath=filepath;
	}
	
	public String getcelldata (String sheetName, int rowNum, int colNum) throws IOException
	{
		String filepath= "E:\\seleniumrepository\\HWTestNGProject\\src\\annotation\\Testdata.xls";
		
		FileInputStream file= new FileInputStream(filepath);
		
		HSSFWorkbook wb =new HSSFWorkbook(file);
		
		HSSFSheet sheet = wb.getSheet(sheetName);
		
		HSSFRow rows = sheet.getRow(rowNum-1);
		
		HSSFCell cell = rows.getCell(colNum-1);
		
		String value = cell.getStringCellValue();
		return value;
		
		
	}
	
	public void setcelldata (String sheetName, int rowNum, int colNum, String value) throws IOException
	{
		FileInputStream file =new FileInputStream(filepath);
		
		HSSFWorkbook wb =new HSSFWorkbook(file);
		HSSFSheet sheet = wb.getSheet(sheetName);
		HSSFRow rows = sheet.getRow(rowNum-1);
		
		if (rows==null)
				rows= sheet.createRow(rowNum-1);
		
		HSSFCell cell = rows.getCell(colNum-1);
		
		if (cell==null)
			cell = rows.getCell(colNum-1);
		
		FileOutputStream fileout = new FileOutputStream(filepath);
		cell.setCellValue(value);
		wb.write(fileout);
	}
	
	public int getRowCount(String sheetName) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream(filepath);
		
		//workbook
		HSSFWorkbook wb =new HSSFWorkbook(file);
		
		//work sheet
		HSSFSheet sheet= wb.getSheet(sheetName);
		
		
		return sheet.getLastRowNum()+1;
	}
				
		public int getColCount(String sheetName) throws IOException
		{
			FileInputStream file=new FileInputStream(filepath);
			
			//workbook
			HSSFWorkbook wb =new HSSFWorkbook(file);
			
			//work sheet
			HSSFSheet sheet= wb.getSheet(sheetName);
			
			return sheet.getRow(0).getLastCellNum();
		}

		
		
	
	
	
}
