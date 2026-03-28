package utils;

/**
 * Validator
 *
 * Responsibility: Input validation for forms
 * - Validates empty fields
 * - Validates date formats
 * - Validates grade range (1.0 to 5.0)
 * - Provides static validation methods called by UI panels
 */
public class Validator {

	/**
	 * Validate that a string is not empty
	 *
	 * @param value the string to validate
	 * @return true if not empty, false otherwise
	 */
	public static boolean isNotEmpty(String value) {
		// TODO: Implement empty check
		// - Return true if value != null && !value.trim().isEmpty()
		return false;
	}

	/**
	 * Validate that a date is in valid format
	 *
	 * @param dateString the date string to validate (format: yyyy-MM-dd)
	 * @return true if valid format, false otherwise
	 */
	public static boolean isValidDateFormat(String dateString) {
		// TODO: Implement date format validation
		// - Check if dateString matches yyyy-MM-dd format
		// - Try to parse and catch DateParseException
		// - Return true if valid, false otherwise
		return false;
	}

	/**
	 * Validate that a grade is in valid range (1.0 to 5.0)
	 *
	 * @param grade the grade to validate
	 * @return true if 1.0 <= grade <= 5.0, false otherwise
	 */
	public static boolean isValidGrade(double grade) {
		// TODO: Implement grade range validation
		// - Return true if grade >= 1.0 && grade <= 5.0
		return false;
	}

	/**
	 * Validate all required student registration fields
	 *
	 * @param fullName the student's full name
	 * @param address the student's address
	 * @param birthdate birthdate string (yyyy-MM-dd format)
	 * @param placeOfBirth the place of birth
	 * @param degree the degree
	 * @param major the major
	 * @return true if all fields valid, false otherwise
	 */
	public static boolean validateStudentRegistration(String fullName, String address,
													   String birthdate, String placeOfBirth,
													   String degree, String major) {
		// TODO: Implement student validation
		// - Check all fields are not empty using isNotEmpty()
		// - Check birthdate is valid format using isValidDateFormat()
		// - Return true if all valid, false otherwise
		return false;
	}

	// TODO: Add other validation methods as needed (e.g., validateEnrollment, validateGrade, etc.)
}
