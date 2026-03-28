package dao;

import java.util.List;
import model.Student;

/**
 * Student Data Access Object (DAO)
 *
 * Responsibility: Handle all SQL queries for the students table
 * Rule: ONLY this class should write SQL for students
 */
public class StudentDAO {

	/**
	 * Insert a new student into the database
	 *
	 * @param student the Student object to insert
	 * @throws SQLException if database operation fails
	 */
	public void insertStudent(Student student) throws Exception {
		// TODO: Implement SQL INSERT query
		// SQL: INSERT INTO students (full_name, full_address, birthdate, place_of_birth, degree, major)
		//      VALUES (?, ?, ?, ?, ?, ?)
		// - Get connection from DBConnection.getConnection()
		// - Create prepared statement
		// - Set parameters
		// - Execute update
	}

	/**
	 * Retrieve a student by ID
	 *
	 * @param studentId the ID of the student to retrieve
	 * @return Student object or null if not found
	 * @throws SQLException if database operation fails
	 */
	public Student getStudentById(int studentId) throws Exception {
		// TODO: Implement SQL SELECT query
		// SQL: SELECT * FROM students WHERE student_id = ?
		// - Get connection from DBConnection.getConnection()
		// - Create prepared statement
		// - Set parameters
		// - Execute query and map ResultSet to Student object
		return null;
	}

	/**
	 * Retrieve all students
	 *
	 * @return List of all Student objects
	 * @throws SQLException if database operation fails
	 */
	public List<Student> getAllStudents() throws Exception {
		// TODO: Implement SQL SELECT query
		// SQL: SELECT * FROM students ORDER BY full_name ASC
		// - Get connection from DBConnection.getConnection()
		// - Create statement
		// - Execute query
		// - Map ResultSet to List of Student objects
		// - Return list
		return null;
	}
}
