package coding;
import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/orders";
		String username = "root";
		String password = "neelima@1234";
		String query = "insert into orders values(006,'Earrings',150,6);";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.println(count+ "rows effected");
		/*while(rs.next()) {
		String name = rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getInt(3)+" : "+rs.getInt(4);
		System.out.println(name);
		}*/

		st.close();
		con.close();

	}

}
