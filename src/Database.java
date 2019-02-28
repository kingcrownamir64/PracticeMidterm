import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306.amirdb";
        String user = "root";
                                                                                                                                                       String pass = "Youcantseeme1";

        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amirdb", "root", "Youcantseeme1");

            Statement myStmt = myConn.createStatement();

            //String sql = "update student set name = 'dgdfvb' where id = 3";
            String sql =  "INSERT INTO student "
                    + "(id, name, age)"
                    + "VALUES(786, 'Amir', 21)";

            myStmt.executeUpdate(sql);

            System.out.print("Insert Complete");

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void insertData(){
        try{
            //1. get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root", "root");

            //2. create statement
            Statement myStmt = myConn.createStatement();

            String sql = "INSERT INTO student "
                    + "(id, name, age)"
                    + "VALUES(786, 'Amir', 21)";

            myStmt.executeUpdate(sql);
            System.out.println("Insertion Complete");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}