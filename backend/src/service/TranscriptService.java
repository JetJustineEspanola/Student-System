package service;

/**
 * Transcript Service
 *
 * Responsibility: Build and return Transcript of Records (TOR) data for a student
 * - Executes JOIN query across students, enrollments, courses tables
 * - Computes any necessary summary data
 * - Returns complete student info + course enrollment records
 */
public class TranscriptService {

	/**
	 * Get transcript for a student (called by TranscriptPanel)
	 *
	 * Query (JOIN):
	 *   SELECT s.full_name, s.full_address, s.birthdate, s.place_of_birth,
	 *          s.degree, s.major, e.date_conferred, e.category,
	 *          e.educational_attainment, e.date_admitted,
	 *          c.term, c.course_name, c.descriptive_title, e.grade, c.units,
	 *          c.school_year
	 *   FROM enrollments e
	 *   JOIN students s ON e.student_id = s.student_id
	 *   JOIN courses c ON e.course_id = c.course_id
	 *   WHERE s.student_id = ?
	 *
	 * @param studentId the student ID
	 * @return TranscriptResult containing student info + List of enrollment records
	 * @throws SQLException if query fails
	 */
	public Object getTranscript(int studentId) throws Exception {
		// TODO: Implement transcript retrieval
		// - Get connection
		// - Execute JOIN query with studentId parameter
		// - Map student personal info (name, address, birthdate, place_of_birth, degree, major)
		// - Map enrollment records (term, course_name, descriptive_title, grade, units)
		// - Return TranscriptResult object containing student info + List<EnrollmentRecord>
		return null;
	}

	// TODO: Create inner classes or result DTOs:
	// - TranscriptResult: holds student info + List<EnrollmentRecord>
	// - EnrollmentRecord: holds term, courseName, descriptiveTitle, grade, units, schoolYear
}
