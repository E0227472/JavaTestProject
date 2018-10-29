package sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.exceptions.InvalidInputException;
import com.cg.repository.Repository;
import com.cg.repository.RepositoryImpl;
import com.cg.service.Service;
import com.cg.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvalidInputException,
    SQLException
    {
    	String dbURL = "jdbc:mysql://localhost:3306/wallet";
    	String username = "root";
    	String password = "password";

    	Wallet w = new Wallet(234.00);
    	Customer c = new Customer("testname", "12345678");	
        Connection conn;
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			Repository r = new RepositoryImpl(conn);
			Service s = new ServiceImpl(r);
			s.create(w, c);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
