package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileInputStream shili=new FileInputStream("shili.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(shili);
		XSSFSheet  sheet=wb.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		Map map=new HashMap<>();
		for (int i=1;i<rows;i++) {
			XSSFRow row=sheet.getRow(i);
			Iterator<Cell> celljihe_source=row.cellIterator();
			List list=new ArrayList<>();
			while (celljihe_source.hasNext()) {
				Cell cell_source=(Cell) celljihe_source.next();
				if(cell_source.getCellType()==CellType.STRING) {
				list.add(cell_source);
				}else if (cell_source.getCellType()==CellType.NUMERIC) {
					list.add(cell_source.getNumericCellValue());
			}
			}
			map.put(list.get(3), list);
		}
		//System.out.println(map);
		//读取目标文件并将数据写入目标文件
		FileInputStream shili1=new FileInputStream("18rj2.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(shili1);
		XSSFSheet sheet1=wb1.getSheet("sheet1");
		int rows1=sheet1.getLastRowNum();
		for (int i=1;i<=rows1; i++) {
			
			XSSFRow rowi=sheet1.getRow(i);
			//读取
			String xuehao=rowi.getCell(3).getStringCellValue();//n表
			//写入
			List list=(ArrayList)map.get(xuehao);
			System.out.println(list);
			if(list!=null) {
				
			rowi.createCell(15,CellType.STRING).setCellValue("4.7");
			rowi.createCell(16,CellType.STRING).setCellValue("4.7");
		}
			}
		FileOutputStream shili2=new FileOutputStream("18rj2.xlsx");
		wb.write(shili2);
		shili2.close();
	}
	
}
