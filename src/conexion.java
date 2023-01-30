import java.sql.*;

public class conexion {
    public conexion()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion= DriverManager.getConnection(
                    "jdbc:mysql://localhost/datos","root","Luchito2724");
            Statement s=conexion.createStatement();
            ResultSet rs=s.executeQuery("select * from prueba_java");
            while (rs.next())

            {
                System.out.println(rs.getInt("ID")+" "+ rs.getString("NOMBRE")+" "+rs.getString("APELLIDO"));
            }
            conexion.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
