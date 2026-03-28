package ui.panels;

import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * Transcript Panel
 *
 * Responsibility: Display Transcript of Records (TOR) for a student
 * - Displays form fields:
 *   * Student ID (dropdown - loads all students)
 *   * View button
 * - When student is selected and View clicked:
 *   * Top section: JLabel fields displaying student personal info
 *     - Name, Address, Date of Birth, Place of Birth, Degree, Major
 *     - Date Conferred, Category, Educational Attainment, Date Admitted
 *   * Table section: JTable with student's course enrollments
 *     - Columns: Term | Course Name | Descriptive Title | Final Grade | Units
 */
public class TranscriptPanel extends JPanel {

	private JTable enrollmentTable;

	/**
	 * Constructor - Initialize the panel
	 */
	public TranscriptPanel() {
		// TODO: Implement TOR display UI
		// - Create JLabel and dropdown for Student ID
		// - Load students dropdown via StudentService.getAllStudents()
		// - Add View button
		// - Create labels for student personal info (initially empty)
		// - Create JTable for enrollment records using TableUtils
		// - Set up panel layout
		// - Attach action listener to View button
		// - On View: call TranscriptService.getTranscript(studentId), populate display
	}

	/**
	 * Load and display transcript for a student
	 */
	private void displayTranscript(int studentId) {
		// TODO: Implement transcript display logic
		// - Call TranscriptService.getTranscript(studentId)
		// - Populate student personal info labels with data
		// - Populate JTable with enrollment records using TableUtils
	}
}
