package ui.panels;

import javax.swing.JPanel;

/**
 * Enroll Student Panel
 *
 * Responsibility: Form UI for enrolling a student into a course
 * - Displays form fields:
 *   * Student ID (dropdown - loads all students)
 *   * Course ID (dropdown - loads all courses)
 *   * Term
 *   * School Year
 *   * Category
 *   * Date Admitted (date picker)
 * - Includes Submit button
 * - Calls EnrollmentDAO.enrollStudent() on submit
 * - Shows confirmation dialog on success
 */
public class EnrollStudentPanel extends JPanel {

	/**
	 * Constructor - Initialize the panel
	 */
	public EnrollStudentPanel() {
		// TODO: Implement form UI
		// - Create JLabel and dropdown/field for each enrollment field
		// - Load students dropdown via StudentService.getAllStudents()
		// - Load courses dropdown via CourseDAO.getAllCourses()
		// - Add date picker for date_admitted field
		// - Add Submit button
		// - Set up form layout
		// - Attach action listener to Submit button
		// - On submit: validate input, call EnrollmentDAO.enrollStudent(), show result dialog
	}

	/**
	 * Validate and enroll a student
	 */
	private void enrollStudent() {
		// TODO: Implement enrollment logic
		// - Get values from form fields
		// - Call Validator.validate() to check for empty fields
		// - If valid: call EnrollmentDAO.enrollStudent(studentId, courseId, term, schoolYear, category, dateAdmitted)
		// - If invalid: show error message
		// - Show success dialog: "Student Enrolled Successfully"
		// - Clear form fields
	}
}
