package FileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {

	public static void main(String[] args) throws IOException 
	
	{
		String filepath="E:\\seleniumrepository\\BasicCoreJava\\src\\FileHandler\\AnuTestdata.xls";
		
		FileInputStream file=new FileInputStream(filepath);
		
		//workbook
		HSSFWorkbook wb =new HSSFWorkbook(file);
		
		//work sheet
	//	wb.getSheet("Sheet1");
		HSSFSheet sheet= wb.getSheet("Sheet1");
		
		//Rows
		HSSFRow row= sheet.getRow(0);
		
		//cell
		HSSFCell cell=row.getCell(0);
		String value=cell.getStringCellValue();
		System.out.println(value);
		
		
		
	}

}
