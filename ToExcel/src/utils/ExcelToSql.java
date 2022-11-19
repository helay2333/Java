package utils;

import bean.Student;
import dao.SqlDao;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.List;

/**
 * @author Green写代码
 * @date 2022-11-19 12:07
 */
public class ExcelToSql {
    public void toSql(String file) throws BiffException, IOException {
        List<Student> list = GetExcel.getExcelByName(file);
        SqlDao sqlDao = new SqlDao();
        sqlDao.Add(list);
    }
}
