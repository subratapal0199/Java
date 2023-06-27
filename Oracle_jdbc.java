import java.sql.*;

class Oracle_jdbc
{
    public static void main(String args[]) throws Exception
    {
        //register the driver
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        //Driver myDriver = new oracle.jdbc.driver.OracleDriver();
        //DriverManager.registerDriver( myDriver );

        //Establish the connection with the database
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");

        //create a sql statement
        Statement stmt=con.createStatement();

        //execute the statement
        ResultSet rs=stmt.executeQuery("select * from teacher");

        //All rows of student table in rs.Now retrive coloum data from rs and display
        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println("-----------------------------");
        }
        //close the connection
        con.close();

    }
}
