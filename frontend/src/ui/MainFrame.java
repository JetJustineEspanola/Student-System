package ui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main Frame
 *
 * Responsibility: Main JFrame window, CardLayout panel switcher, navigation sidebar
 * - Contains CardLayout to switch between 5 main panels
 * - Provides navigation sidebar with buttons to switch panels
 */
public class MainFrame extends JFrame {

	private CardLayout cardLayout;
	private JPanel cardPanel;

	/**
	 * Constructor - Initialize the MainFrame
	 */
	public MainFrame() {
		// TODO: Implement main frame setup
		// - Set title: "Student Information System"
		// - Set default close operation: EXIT_ON_CLOSE
		// - Set size and center on screen
		// - Create CardLayout and main panel
		// - Add sidebar navigation with buttons:
		//   * Register Student
		//   * Enroll Student
		//   * Encode Grades
		//   * View TOR (Transcript of Records)
		//   * View Class List
		// - Add 5 card panels (one for each feature)
		// - Set visible
	}

	/**
	 * Switch to a specific panel
	 *
	 * @param panelName the name of the panel to show
	 */
	public void showPanel(String panelName) {
		// TODO: Implement panel switching
		// - Use cardLayout.show(cardPanel, panelName) to switch panels
	}
}
