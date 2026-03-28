package service;

/**
 * Class List Service
 *
 * Responsibility: Build and return Class List data for a course
 * - Executes JOIN query across enrollments, students, courses tables
 * - Computes summary counts (passed, failed, incomplete, etc.)
 * - Returns course info + student enrollment records + summary
 */
public class ClassListService {

	/**
	 * Get class list for a course (called by ClassListPanel)
	 *
	 * Query (JOIN):
	 *   SELECT s.student_id, s.full_name, e.grade, c.units, s.degree
	 *   FROM enrollments e
	 *   JOIN students s ON e.student_id = s.student_id
	 *   JOIN courses c ON e.course_id = c.course_id
	 *   WHERE e.course_id = ?
	 *   ORDER BY s.full_name ASC
	 *
	 * Summary Calculation:
	 *   total = list.size()
	 *   passed = count where grade != null && grade <= 3.0
	 *   failed = count where grade != null && grade > 3.0
	 *   incomplete = count where grade == null
	 *
	 * @param courseId the course ID
	 * @return ClassListResult containing course info + List of student records + summary counts
	 * @throws SQLException if query fails
	 */
	public Object getClassList(int courseId) throws Exception {
		// TODO: Implement class list retrieval
		// - Get connection
		// - Execute JOIN query with courseId parameter
		// - Map course info (course_name, college, descriptive_title, units, term, school_year, etc.)
		// - Map student records (student_id, full_name, grade, units)
		// - Calculate summary counts (total, passed, failed, incomplete, dropped)
		// - Return ClassListResult object containing course info + List<StudentRecord> + summary
		return null;
	}

	// TODO: Create inner classes or result DTOs:
	// - ClassListResult: holds courseInfo + List<StudentRecord> + summary counts
	// - StudentRecord: holds studentId, studentName, grade, units, degree
	// - SummaryCounts: holds total, passed, failed, incomplete, dropped
}
