package dao;

import java.sql.SQLException;
import java.util.Date;

/**
 * Enrollment Data Access Object (DAO)
 *
 * Responsibility: Handle all SQL queries for the enrollments table
 * Rule: ONLY this class should write SQL for enrollments
 */
public class EnrollmentDAO {

	/**
	 * Enroll a student in a course
	 *
	 * @param studentId the student ID
	 * @param courseId the course ID
	 * @param term the term
	 * @param schoolYear the school year
	 * @param category the category
	 * @param dateAdmitted the date student was admitted
	 * @throws SQLException if database operation fails
	 */
	public void enrollStudent(int studentId, int courseId, String term,
								String schoolYear, String category,
								Date dateAdmitted) throws Exception {
		// TODO: Implement SQL INSERT query
		// SQL: INSERT INTO enrollments (student_id, course_id, term, school_year, category, date_admitted)
		//      VALUES (?, ?, ?, ?, ?, ?)
		// - Get connection from DBConnection.getConnection()
		// - Create prepared statement
		// - Set parameters
		// - Execute update
	}

	/**
	 * Add/update grade for an enrollment
	 *
	 * @param studentId the student ID
	 * @param courseId the course ID
	 * @param grade the grade (1.0 to 5.0)
	 * @throws SQLException if database operation fails
	 */
	public void addGrade(int studentId, int courseId, double grade) throws Exception {
		// TODO: Implement SQL UPDATE query
		// SQL: UPDATE enrollments SET grade = ? WHERE student_id = ? AND course_id = ?
		// - Get connection from DBConnection.getConnection()
		// - Create prepared statement
		// - Set parameters
		// - Execute update
	}
}
