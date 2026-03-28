package config;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Database Connection Manager
 *
 * Responsibility: Return a live JDBC Connection to PostgreSQL
 */
public class DBConnection {

	// TODO: Configure these database connection parameters
	private static final String URL = "jdbc:postgresql://localhost:5432/student_system";
	private static final String USER = "postgres";
	private static final String PASSWORD = "password";
	private static final String DRIVER = "org.postgresql.Driver";

	/**
	 * Get a connection to the database
	 *
	 * @return a live JDBC Connection to PostgreSQL
	 * @throws SQLException if connection fails
	 */
	public static Connection getConnection() throws SQLException {
		// TODO: Implement database connection logic
		// - Load PostgreSQL driver
		// - Create and return connection using DriverManager
		return null;
	}
}
