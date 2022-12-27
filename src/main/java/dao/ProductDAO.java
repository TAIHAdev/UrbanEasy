package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/UrbanEasy?allowPublicKeyRetrieval=true&useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "15012003";
    
    private static final String SELECT_PRODUCT = "SELECT p.propertyId, p.district, p.city, p.country, r.avg_rating FROM property p join"
    		+ "	(SELECT propertyId, AVG(stars) as avg_rating FROM reviews GROUP BY propertyId) r ON p.propertyId = r.propertyId; ";
   protected Connection getConnection() {
	   Connection connection = null; 
	   try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

	   } catch (SQLException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
	   return connection;
   }
   public List<Product> selectAllProducts() {
	   List<Product> products = new ArrayList<>();
	   try (Connection connection = getConnection();
			   PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT)) {
		   ResultSet rs = preparedStatement.executeQuery();
		   while(rs.next()) {
			   int id = rs.getInt("propertyId");
			   String district = rs.getString("district");
			   String city = rs.getString("city");
			   String country = rs.getString("country");
			   double avg_rating = (double) Math.round(rs.getDouble("avg_rating") * 10) / 10;
			   products.add(new Product(id, district, city, country, avg_rating)); 
		   }
		   
	   } catch(SQLException e) {
		   e.printStackTrace();
	   }
	   return products;
   }
   

}
;
