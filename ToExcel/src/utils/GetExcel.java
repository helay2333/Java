package utils;

import bean.Student;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Green写代码
 * @date 2022-11-19 11:40
 */
//获取数据表list
public class GetExcel {
    public static List<Student> getExcelByName(String file) throws BiffException, IOException {
        List<Student>list = new ArrayList<>();
        //处理文件名称
        file = doFileName(file);
        //获取一个工作薄对象
        Workbook workbook = Workbook.getWorkbook(new File(file));
        //获取工作薄中的工作表，这里我门就是第一个sheet
        Sheet sheet = workbook.getSheet(0);
        int col = sheet.getColumns();
        int row = sheet.getRows();
        //遍历，并添加到list
        for(int i = 1; i < row; i++) {
            int j = 0;
            String classes = sheet.getCell(j++, i).getContents();
            String card = sheet.getCell(j++, i).getContents();
            String name = sheet.getCell(j++, i).getContents();
            String gender = sheet.getCell(j++, i).getContents();
            Integer score = Integer.valueOf(sheet.getCell(j++, i).getContents());
            Student stu = new Student(classes,card,name,gender,score);
            System.out.println(stu);
            list.add(stu);
        }
        return list;
    }
    public static String doFileName(String file){
        int idx = file.lastIndexOf(".");
        String preName = file.substring(0, idx );
        String xlsx = file.substring(idx);
        System.out.println(preName);
        System.out.println(xlsx);
        if(xlsx.equals(".xlsx")){
            xlsx = ".xls";
        }

        return preName+xlsx;
    }
}
