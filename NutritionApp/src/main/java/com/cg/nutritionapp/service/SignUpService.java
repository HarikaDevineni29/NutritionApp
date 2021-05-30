package com.cg.nutritionapp.service;

import java.io.IOException;
import java.sql.SQLException;

public interface SignUpService {
	/**
	 * This method is used for adding users
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void addUser() throws NumberFormatException, IOException;
	/**
	 * used for updating users
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void updateUser() throws NumberFormatException, IOException;

	/**
	 * Used for deleting a entry in users table
	 * @throws IOException
	 * @throws SQLException 
	 */
	public void deleteUser() throws IOException, SQLException;
}