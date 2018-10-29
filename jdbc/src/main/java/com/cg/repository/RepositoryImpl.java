package com.cg.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;

public class RepositoryImpl implements  Repository {
	private Connection conn;


	private Connection connection;

	public RepositoryImpl(DataSource dataSource) throws SQLException {
		this.connection = dataSource.getConnection();
	}

	// pass connection string into this class constructor
	public RepositoryImpl(Connection connection) {
		this.connection = connection;
	}

	public RepositoryImpl() {

	}

	// findbymobile method to find the cus object by mobile number
	public Customer findbymobile(String mobile)
			throws AccountNotFoundException {	
		Customer c = new Customer();
		return c;
	}

	public void save (Wallet w, Customer c) throws InvalidInputException, 
	SQLException {
		// adding wallet object first
		if(w ==null) {
			throw new InvalidInputException("Input type is not correct");
		} else {
			String sql = "INSERT INTO wallet(amount) VALUES (?)";
			try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				ps.setDouble(1, w.getBalance());
				int numRowsAffected = ps.executeUpdate();
				try (ResultSet rs = ps.getGeneratedKeys()) {
					if (rs.next()) {
						w.setId(rs.getInt(1));
					}
				} catch (SQLException s) {
					s.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}


		}

		// adding customer object next
		if(c ==null) {
			throw new InvalidInputException("Input type is not correct");
		} else {
			String sql = "INSERT INTO customer(name,mobile,wallet_id) VALUES (?,?,?)";
			try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				ps.setString(1, c.getName());
				ps.setString(2, c.getMobile());
				ps.setInt(3, w.getId());
				int numRowsAffected = ps.executeUpdate();
				try (ResultSet rs = ps.getGeneratedKeys()) {
					if (rs.next()) {
						c.setId(rs.getInt(1));
					}
				} catch (SQLException s) {
					s.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}			

		}
	}
}
