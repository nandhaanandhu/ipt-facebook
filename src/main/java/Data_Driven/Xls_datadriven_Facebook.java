package Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_datadriven_Facebook {
	static String value;

	public static String shakthi(int row, int cell) throws Throwable {

		File f = new File("C:\\Users\\shakt\\eclipse-workspace\\ipt_Facebook\\datadriven\\facebook.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("facebook");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		CellType ce = c.getCellType();
		if (ce.equals(CellType.STRING)) {
			value = c.getStringCellValue();

		} else if (ce.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int n = (int) d;

		}

		return value;

	}

	
	}
	

