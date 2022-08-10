/**
 * Write a description of class Konek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.sql.*;

public class Konek  
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Konek
     */
    public  static String a = "";
    public Konek()
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/uas_dimas";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            String query = "SELECT * FROM `arah` WHERE `id` = 1";
            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet kunci = stmt.executeQuery(query); 
                
                while(kunci.next()){                   
                    a = kunci.getString("kunci");
                }  
                
            } catch (SQLException e) {
                a="gagal";
                System.out.println(e);
            }
            

        } catch (ClassNotFoundException e) {
            a="gagal";
            System.out.println(e);
        }//end try catch
    }

    /**

     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static String sampleMethod()
    {
        // put your code here
        
        return a;
    }
}
