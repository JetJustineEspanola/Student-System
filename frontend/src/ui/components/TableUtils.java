package ui.components;

import javax.swing.JTable;

/**
 * Table Utilities
 *
 * Responsibility: Reusable JTable setup, column sizing, formatting
 * - Provides static methods to create and configure JTable instances
 * - Handles column sizing and formatting
 * - Provides helper methods for common table operations
 */
public class TableUtils {

	/**
	 * Create a formatted JTable with specified columns
	 *
	 * @param columnNames array of column names
	 * @param data 2D array of data
	 * @return configured JTable
	 */
	public static JTable createTable(String[] columnNames, Object[][] data) {
		// TODO: Implement table creation
		// - Create DefaultTableModel with columnNames and data
		// - Create JTable from model
		// - Set column widths appropriately
		// - Make table read-only (disable editing)
		// - Center align numeric columns
		// - Return configured JTable
		return null;
	}

	/**
	 * Auto-size all columns in a table
	 *
	 * @param table the JTable to size
	 */
	public static void autoSizeColumns(JTable table) {
		// TODO: Implement column auto-sizing
		// - Iterate through all columns
		// - Calculate optimal width based on content
		// - Set column preferred widths
	}

	// TODO: Add other helpful methods as needed (e.g., formatNumberColumn, formatDateColumn, etc.)
}
