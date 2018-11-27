/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package industrymanagement;

import com.mbr.industrymanagement.db.Movimentation;
import com.mbr.industrymanagement.db.User;
import industrymanagement.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nsousa
 */
public class DataBaseFunctions {
    
   public static ResultSet searchForUser(User user) throws SQLException
   {   String query = "SELECT password FROM User WHERE id = '" + user.getId()+"'";
       Connection connection = DataBaseConnection.createConnection();
       PreparedStatement stmt = connection.prepareStatement(query);
       ResultSet resultSet = stmt.executeQuery();
       String password = resultSet.getString("password");
       if(password.equals(user.getPassword()))
       {
           return resultSet;
       }
       
       return null;
   }
   
   public static void insertMovimentation(Movimentation movimentation) throws SQLException
   {   String query = "INSERT INTO Movimentation (id, idProduct, nameProduct, productQuantity, discount, discountValue,"
                        +"totalAmount, prQuantUnitMeasure) VALUES " 
                        + "('" + movimentation.getId() + "','"
                        + movimentation.getProduct().getId() + "','"
                        + movimentation.getProduct().getName() + "','"
                        + movimentation.getQuantity() + "','"
                        + movimentation.isDiscount() + "','"
                        + movimentation.getDiscountValue() + "','"
                        + movimentation.getAmountValue() + "','"
                        + movimentation.getUnitOfMeasure()
                        +"');";
       
       Connection connection = DataBaseConnection.createConnection();
       PreparedStatement stmt = connection.prepareStatement(query);
       stmt.executeUpdate();
   }
    
}
