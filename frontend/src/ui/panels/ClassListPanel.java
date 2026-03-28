package ui.panels;

import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * Class List Panel
 *
 * Responsibility: Display Class List and summary for a course
 * - Displays form fields:
 *   * Course ID (dropdown - loads all courses)
 *   * View button
 * - When course is selected and View clicked:
 *   * Header section: JLabel fields displaying course info
 *     - Institution, College, Subject Code, Descriptive Title, Units,
 *       Course/Year/Section, Term/School Year, Days, Schedule, Room, Instructor
 *   * Table section: JTable with students enrolled in course
 *     - Columns: No. | Student ID | Student Name | Grade | Units | Degree
 *   * Footer section: Summary counts
 *     - Total Enrolled, Passed, Failed, Incomplete, Dropped
 *   * Signature lines (Instructor, Department Head, Dean of College)
 */
public class ClassListPanel extends JPanel {

	private JTable studentTable;

	/**
	 * Constructor - Initialize the panel
	 */
	public ClassListPanel() {
		// TODO: Implement class list display UI
		// - Create JLabel and dropdown for Course ID
		// - Load courses dropdown via CourseDAO.getAllCourses()
		// - Add View button
		// - Create labels for course header info (initially empty)
		// - Create JTable for student records using TableUtils
		// - Create labels for summary counts (Total, Passed, Failed, Incomplete, Dropped)
		// - Create signature lines placeholder
		// - Set up panel layout
		// - Attach action listener to View button
		// - On View: call ClassListService.getClassList(courseId), populate display
	}

	/**
	 * Load and display class list for a course
	 */
	private void displayClassList(int courseId) {
		// TODO: Implement class list display logic
		// - Call ClassListService.getClassList(courseId)
		// - Populate course header info labels with data
		// - Populate JTable with student records using TableUtils
		// - Update summary count labels (total, passed, failed, incomplete, dropped)
	}
}
