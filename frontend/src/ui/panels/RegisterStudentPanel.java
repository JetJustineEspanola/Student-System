package ui.panels;

import javax.swing.JPanel;

/**
 * Register Student Panel
 *
 * Responsibility: Form UI for registering a new student
 * - Displays form fields for student data entry:
 *   * Full Name
 *   * Full Address
 *   * Birthdate
 *   * Place of Birth
 *   * Degree
 *   * Major
 * - Includes Submit button
 * - Calls StudentService.insertStudent() on submit
 * - Shows confirmation dialog on success
 */
public class RegisterStudentPanel extends JPanel {

	/**
	 * Constructor - Initialize the panel
	 */
	public RegisterStudentPanel() {
		// TODO: Implement form UI
		// - Create JLabel and JTextField for each student field
		// - Add date picker for birthdate field
		// - Add Submit button
		// - Set up form layout (GridLayout, BoxLayout, etc.)
		// - Attach action listener to Submit button
		// - On submit: validate input, call StudentService.insertStudent(), show result dialog
	}

	/**
	 * Validate and register a student
	 */
	private void registerStudent() {
		// TODO: Implement registration logic
		// - Get values from form fields
		// - Call Validator.validate() to check for empty fields, date format
		// - If valid: call StudentService.insertStudent()
		// - If invalid: show error message
		// - Show success dialog: "Student Registered Successfully"
		// - Clear form fields
	}
}
