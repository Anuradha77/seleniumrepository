package basicallocation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Xls_reader {

		String filepath =null; 
		
		public Xls_reader(String filepath)
		{
			this.filepath=filepath;
		}
		
		public String getCellData(String sheetName, int rowNum, int colNum) throws IOException
		{
			String filepath="E:\\seleniumrepository\\TestNGProject\\src\\basicallocation\\AnuTestdata.xls";
			
			FileInputStream file=new FileInputStream(filepath);
			
			//workbook
			HSSFWorkbook wb =new HSSFWorkbook(file);
			
			//work sheet
		
			HSSFSheet sheet= wb.getSheet(sheetName);
			
			//Rows
			HSSFRow row= sheet.getRow(rowNum-1);
			
			//cell
			HSSFCell cell=row.getCell(colNum-1);
			String value=cell.getStringCellValue();
			return value;
		}
		
		public void setCellData (String sheetName, int rowNum, int colNum, String value) throws IOException
		{
			FileInputStream file=new FileInputStream(filepath);
			
			//workbook
			HSSFWorkbook wb =new HSSFWorkbook(file);
			
			//work sheet
		//	wb.getSheet("Sheet1");
			HSSFSheet sheet= wb.getSheet(sheetName);
			
			//Rows
			HSSFRow row= sheet.getRow(rowNum-1);
			
			//if row is not available in sheet
			if (row==null)
				row=sheet.createRow(rowNum-1);
				
			//cell
			HSSFCell cell=row.getCell(colNum-1);
			if (cell==null)
				cell=row.createCell(colNum-1);
			
			
			
			
			FileOutputStream fileout= new FileOutputStream(filepath);//need to create obj
			
			cell.setCellValue(value);//save temp
			
			wb.write(fileout);//write in excel
		
		}
		
		public int getRowCount(String sheetName) throws IOException
		{
			
			
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
