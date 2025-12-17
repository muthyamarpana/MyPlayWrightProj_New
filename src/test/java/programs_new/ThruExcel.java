package programs_new;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ThruExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String src="C:\\PlayWright_Automation\\testdata.xlsx";
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum(); //4
		int colCount=sheet.getRow(0).getLastCellNum(); //2
		System.out.println("Row Count="+rowCount+"\t"+"Column Count="+colCount);
		for(int i=1;i<rowCount;i++) //focus Row  1
		{
			for(int j=0;j<colCount;j++) //Focus Column 0 1
			{
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		wb.close();
		
	}

}
