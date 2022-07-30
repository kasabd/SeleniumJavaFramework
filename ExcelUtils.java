package Utills;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String datapath;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	
	public static void main(String[] args) {
		//getRowcount();
		getCellDataString(0,0);
		getCellDataNumeric(1,1);
	}
	public static void getRowcount() {
		try {
			datapath= System.getProperty("user.dir");
			workbook = new XSSFWorkbook(datapath + "/Execl/data.xlsx");
			sheet = workbook.getSheet("sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("The number of rows in excel data sheet1 is  " + rowcount);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(	ex.getCause());
			ex.printStackTrace();
		}
	}
	
	public static void getColcount() {
		try {
			datapath= System.getProperty("user.dir");
			workbook = new XSSFWorkbook(datapath + "/Execl/data.xlsx");
			sheet = workbook.getSheet("sheet1");
			int Colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("The number of rows in excel data sheet1 is  " + Colcount);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(	ex.getCause());
			ex.printStackTrace();
		}
	}

	public static void getCellDataString(int colnum1, int Rownum2) {
		try {
			datapath= System.getProperty("user.dir");
			workbook = new XSSFWorkbook(datapath + "/Execl/data.xlsx");
			sheet = workbook.getSheet("sheet1");
			String celldata= sheet.getRow(colnum1).getCell(Rownum2).getStringCellValue();
			System.out.println(celldata);
		
		}catch (Exception ex) {
			System.out.println(	ex.getCause());
			ex.printStackTrace();
		}
		
	}
	public static void getCellDataNumeric(int colnum1, int Rownum2) {
		try {
			datapath= System.getProperty("user.dir");
			workbook = new XSSFWorkbook(datapath + "/Execl/data.xlsx");
			sheet = workbook.getSheet("sheet1");
			double  celldata= sheet.getRow(colnum1).getCell(Rownum2).getNumericCellValue();
			System.out.println(celldata);
		
		}catch (Exception ex) {
			System.out.println(	ex.getCause());
			ex.printStackTrace();
		}
		
	}
}
