package FileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {
		
String filepath="E:\\seleniumrepository\\BasicCoreJava\\src\\FileHandler\\AnuTestdata.xls";
		
		FileInputStream file=new FileInputStream(filepath);
		
		//workbook
		HSSFWorkbook wb =new HSSFWorkbook(file);
		
		//work sheet
	//	wb.getSheet("Sheet1");
		HSSFSheet sheet= wb.getSheet("Sheet1");
		
		//Rows
		HSSFRow row= sheet.getRow(11);
		
		//if row is not available in sheet
		if (row==null)
			row=sheet.createRow(11);
			
		//cell
		HSSFCell cell=row.getCell(2);
		if (cell==null)
			cell=row.createCell(2);
		
		
		
		cell.setCellValue("anu");//save temp
		
		FileOutputStream fileout= new FileOutputStream(filepath);//need to create obj
		
		wb.write(fileout);//write in excel
	

	}

}
