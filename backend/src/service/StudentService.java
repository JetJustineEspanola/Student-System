package service;

import dao.StudentDAO;
import java.util.Date;
import java.util.List;
import model.Student;

/**
 * Student Service
 *
 * Responsibility: Wrap StudentDAO, handle business logic, called by frontend forms
 * Rule: ONLY Service calls DAO, never directly from UI
 */
public class StudentService {

	private StudentDAO studentDAO = new StudentDAO();

	/**
	 * Insert a new student (called by RegisterStudentPanel)
	 *
	 * @param fullName the student's full name
	 * @param address the student's address
	 * @param birthdate the student's birthdate
	 * @param placeOfBirth the student's place of birth
	 * @param degree the student's degree
	 * @param major the student's major
	 * @throws SQLException if insertion fails
	 */
	public void insertStudent(String fullName, String address, Date birthdate,
								String placeOfBirth, String degree,
								String major) throws Exception {
		// TODO: Implement business logic for inserting a student
		// - Validate input (can use Validator class)
		// - Create Student object with parameters
		// - Call studentDAO.insertStudent(student)
		// - Handle any exceptions
	}

	/**
	 * Get all students (called by dropdowns in EnrollStudentPanel, GradePanel, TranscriptPanel)
	 *
	 * @return List of all students
	 * @throws SQLException if query fails
	 */
	public List<Student> getAllStudents() throws Exception {
		// TODO: Implement retrieval of all students
		// - Call studentDAO.getAllStudents()
		// - Return the list
		return null;
	}

	/**
	 * Get a student by ID
	 *
	 * @param studentId the student ID
	 * @return Student object or null if not found
	 * @throws SQLException if query fails
	 */
	public Student getStudentById(int studentId) throws Exception {
		// TODO: Implement retrieval of student by ID
		// - Call studentDAO.getStudentById(studentId)
		// - Return the student
		return null;
	}
}
