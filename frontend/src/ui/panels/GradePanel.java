package ui.panels;

import javax.swing.JPanel;

/**
 * Grade Panel
 *
 * Responsibility: Form UI for encoding and updating grades
 * - Displays form fields:
 *   * Student ID (dropdown - loads all students)
 *   * Course ID (dropdown - loads courses for selected student)
 *   * Grade (text field - accepts 1.0 to 5.0)
 * - Includes Submit button
 * - Validates grade range (1.0 to 5.0)
 * - Calls EnrollmentDAO.addGrade() on submit
 * - Shows confirmation dialog on success
 */
public class GradePanel extends JPanel {

	/**
	 * Constructor - Initialize the panel
	 */
	public GradePanel() {
		// TODO: Implement form UI
		// - Create JLabel and dropdown for Student ID
		// - Load students dropdown via StudentService.getAllStudents()
		// - Create JLabel and dropdown for Course ID
		// - Attach listener to Student dropdown to reload courses when student changes
		// - Create JLabel and JTextField for Grade input
		// - Add Submit button
		// - Set up form layout
		// - Attach action listener to Submit button
		// - On submit: validate input, call EnrollmentDAO.addGrade(), show result dialog
	}

	/**
	 * Load courses for selected student
	 */
	private void loadCoursesForStudent(int studentId) {
		// TODO: Implement course loading
		// - Get all enrollments for the student (need to query which courses student is enrolled in)
		// - Populate course dropdown with those courses
	}

	/**
	 * Validate and save grade
	 */
	private void saveGrade() {
		// TODO: Implement grade saving logic
		// - Get values from form fields
		// - Call Validator.validate() to check for empty fields
		// - Call Validator.validateGradeRange() to check grade is between 1.0 and 5.0
		// - If valid: call EnrollmentDAO.addGrade(studentId, courseId, grade)
		// - If invalid: show error message
		// - Show success dialog: "Grade Saved"
		// - Clear form fields
	}
}
