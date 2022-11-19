package service;

import bean.Student;
import jxl.read.biff.BiffException;
import utils.ExcelToSql;
import utils.GetExcel;

import java.io.IOException;
import java.util.List;

/**
 * @author Green写代码
 * @date 2022-11-19 11:50
 */
public class Service {
    public static void main(String[] args) {
        try {
            ExcelToSql excelToSql = new ExcelToSql();
            excelToSql.toSql("E:\\ttt.xls");
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
