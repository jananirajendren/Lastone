package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	public String getExcelData(String sheetname, int rownum,int cellnum) throws Throwable {
		// Step1:-get the connection of physical file
					FileInputStream fis1 = new FileInputStream("D:\\selenium-learning\\Excel\\Book1.xlsx");

					// step2:- open workbook in read mode
					Workbook book = WorkbookFactory.create(fis1);

					// step3:-get control of the Sheet
					Sheet sheet = book.getSheet(sheetname);

					// step4:-get control of the row
					Row row = sheet.getRow(rownum);

					// step5:-get control of the cell
					Cell cel = row.getCell(cellnum);

					// //step6:-read cell value
					String exceldata = cel.getStringCellValue();
					System.out.println(exceldata);
					return exceldata;
	}
		
		public String getExcelDataUsingFormatter(String sheetname, int rownum,int cellnum) throws Throwable {
			// Step1:-get the connection of physical file
						FileInputStream fis1 = new FileInputStream("D:\\selenium-learning\\Excel\\Book1.xlsx");

						// step2:- open workbook in read mode
						Workbook book = WorkbookFactory.create(fis1);

						// step3:-get control of the Sheet
						Sheet sheet = book.getSheet(sheetname);

						// step4:-get control of the row
						Row row = sheet.getRow(rownum);

						// step5:-get control of the cell
						Cell cel = row.getCell(cellnum);

						// //step6:-read cell value
	DataFormatter format = new DataFormatter();
	String exceldata = format.formatCellValue(cel);
	System.out.println(exceldata);
						return exceldata;}
						
						
	public Object[][] getDataproviderData(String sheetname) throws Throwable {
		// Step1:-get the connection of physical file
		FileInputStream fis1 = new FileInputStream("D:\\selenium-learning\\Excel\\Book1.xlsx");

		// step2:- open workbook in read mode
		Workbook book = WorkbookFactory.create(fis1);

		// step3:-get control of the Sheet
		Sheet sheet = book.getSheet(sheetname);
		
		int Lastrow=sheet.getLastRowNum();
		int Lastcell=sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[Lastrow][Lastcell];	
		for(int i=0;i<Lastrow;i++)
		{
			for(int j=0;j<Lastcell;j++)
			{
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		
		}
		return obj;
	}
}
