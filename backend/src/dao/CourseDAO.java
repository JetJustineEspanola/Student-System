package dao;

import java.sql.SQLException;
import java.util.List;
import model.Course;

/**
 * Course Data Access Object (DAO)
 *
 * Responsibility: Handle all SQL queries for the courses table
 * Rule: ONLY this class should write SQL for courses
 */
public class CourseDAO {

	/**
	 * Insert a new course into the database
	 *
	 * @param course the Course object to insert
	 * @throws SQLException if database operation fails
	 */
	public void insertCourse(Course course) throws Exception {
		// TODO: Implement SQL INSERT query
		// SQL: INSERT INTO courses (course_name, college, term, descriptive_title, course_year_section,
		//      units, days, time, room, school_year, instructor)
		//      VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
		// - Get connection from DBConnection.getConnection()
		// - Create prepared statement
		// - Set parameters
		// - Execute update
	}

	/**
	 * Retrieve a course by ID
	 *
	 * @param courseId the ID of the course to retrieve
	 * @return Course object or null if not found
	 * @throws SQLException if database operation fails
	 */
	public Course getCourseById(int courseId) throws Exception {
		// TODO: Implement SQL SELECT query
		// SQL: SELECT * FROM courses WHERE course_id = ?
		// - Get connection from DBConnection.getConnection()
		// - Create prepared statement
		// - Set parameters
		// - Execute query and map ResultSet to Course object
		return null;
	}

	/**
	 * Retrieve all courses
	 *
	 * @return List of all Course objects
	 * @throws SQLException if database operation fails
	 */
	public List<Course> getAllCourses() throws Exception {
		// TODO: Implement SQL SELECT query
		// SQL: SELECT course_id, course_name, descriptive_title FROM courses ORDER BY course_name ASC
		// - Get connection from DBConnection.getConnection()
		// - Create statement
		// - Execute query
		// - Map ResultSet to List of Course objects
		// - Return list
		return null;
	}
}
