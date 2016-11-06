package co.uk.autotrader.utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.excelant.util.ExcelAntWorkbookUtil;
import org.apache.poi.ss.excelant.util.ExcelAntWorkbookUtilFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 

{
	private static XSSFWorkbook ExcelWorkBook;
	private static XSSFSheet ExcelWorkSheet;
	private static XSSFCell Cell;
	private static FileInputStream ExcelFile;
	
	
	public static void SetExcelFilePath(String path) throws Exception
	{
		try
		{
			ExcelFile =  new FileInputStream(path);
			ExcelWorkBook = new XSSFWorkbook(ExcelFile);
			ExcelWorkSheet = ExcelWorkBook.getSheetAt(0);
			
		}
		
		catch (Exception e)
		
		{
		throw e;	
		}
	}
	public static Integer LastRowNum(String path) throws Exception
	{
		try
		{
			ExcelFile =  new FileInputStream(path);
			ExcelWorkBook = new XSSFWorkbook(ExcelFile);
			ExcelWorkSheet = ExcelWorkBook.getSheetAt(0);
			
			return ExcelWorkSheet.getLastRowNum();
		}
		 
		
		catch (Exception e)
		{
			throw e;
		}
	}
	
	public static String GetCellData (int RowNumber, int ColNumber) throws Exception
	{
		try
		{
			Cell=  ExcelWorkSheet.getRow(RowNumber).getCell(ColNumber);
			return Cell.getStringCellValue();
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	public static void closeWorkbook() throws Exception
	{
		ExcelWorkBook.close();
		ExcelFile.close();
	}
	
	}
	

