import libraries.utility.DBConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by User on 5/24/2016.
 */

public class ConnectDB {
    public static void main(String[] args) throws SQLException,
                                            ClassNotFoundException {
        testMysql();
        testSQL_JDTS();
        testSQL_JDBC();
        testOracle();

    }

    public static void testMysql() throws SQLException,
                                          ClassNotFoundException {
        Connection conn = null;
        // 1. Connect MySQL
        conn = DBConnect.getMyConnection_MySQL();

        // 2. Query data
        String query = "SELECT * FROM danhsach";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        int id;
        String phone = null;
        String name = null;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
            name = resultSet.getString(2);
            phone = resultSet.getString("Phone");

            System.out.println("--------------------");
            System.out.println("STT:" + id);
            System.out.println("Name:" + name);
            System.out.println("Phone:" + phone);
        }
    }

    public static void testSQL_JDTS() throws SQLException,
                                             ClassNotFoundException {
        Connection conn = null;
        conn = DBConnect.getMyConnection_SQLServer_JTDS();
        String query = "SELECT * FROM DanhsachHS";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        int id;
        String phone = null;
        String name = null;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
            name = resultSet.getString(2);
            phone = resultSet.getString("Phone");

            System.out.println("--------------------");
            System.out.println("STT:" + id);
            System.out.println("Name:" + name);
            System.out.println("Phone:" + phone);
        }
    }

    public static void testSQL_JDBC() throws SQLException,
                                             ClassNotFoundException {
        Connection conn = null;
        conn = DBConnect.getMyConnection_SQLServer_JDBC();
        String query = "SELECT * FROM DanhsachHS";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        int id;
        String phone = null;
        String name = null;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
            name = resultSet.getString(2);
            phone = resultSet.getString("Phone");

            System.out.println("--------------------");
            System.out.println("STT:" + id);
            System.out.println("Name:" + name);
            System.out.println("Phone:" + phone);
        }
    }

    public static void testOracle() throws SQLException,
                                           ClassNotFoundException {
        Connection conn = null;
        conn = DBConnect.getMyConnection_OracleXE();
        String query = "SELECT * FROM emp";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        int id;
        String cot_3 = null;
        String cot_2 = null;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
            cot_2 = resultSet.getString(2);
            cot_3 = resultSet.getString(3);

            System.out.println("--------------------");
            System.out.println("STT:" + id);
            System.out.println("Name:" + cot_2);
            System.out.println("Phone:" + cot_3);
        }
    }

}
