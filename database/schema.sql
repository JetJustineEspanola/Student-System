-- ============================================================
-- Student Information System - Database Schema
-- PostgreSQL
-- ============================================================

-- TODO: Drop existing tables if they exist (for fresh database)
-- DROP TABLE IF EXISTS enrollments;
-- DROP TABLE IF EXISTS courses;
-- DROP TABLE IF EXISTS students;

-- ============================================================
-- Students Table
-- ============================================================
-- Stores student personal information

-- TODO: Implement CREATE TABLE statement
-- CREATE TABLE students (
--   student_id        SERIAL PRIMARY KEY,
--   full_name         VARCHAR(100),
--   full_address      VARCHAR(200),
--   birthdate         DATE,
--   place_of_birth    VARCHAR(100),
--   degree            VARCHAR(50),
--   major             VARCHAR(50)
-- );

-- ============================================================
-- Courses Table
-- ============================================================
-- Stores course information

-- TODO: Implement CREATE TABLE statement
-- CREATE TABLE courses (
--   course_id           SERIAL PRIMARY KEY,
--   course_name         VARCHAR(100),
--   college             VARCHAR(100),
--   term                VARCHAR(20),
--   descriptive_title   VARCHAR(200),
--   course_year_section VARCHAR(50),
--   units               INTEGER,
--   days                VARCHAR(20),
--   time                VARCHAR(20),
--   room                VARCHAR(20),
--   school_year         VARCHAR(20),
--   instructor          VARCHAR(100)
-- );

-- ============================================================
-- Enrollments Table
-- ============================================================
-- Stores student to course relationships and grades

-- TODO: Implement CREATE TABLE statement
-- CREATE TABLE enrollments (
--   enrollment_id          SERIAL PRIMARY KEY,
--   student_id             INTEGER REFERENCES students(student_id),
--   course_id              INTEGER REFERENCES courses(course_id),
--   grade                  NUMERIC(3,2),
--   date_conferred         DATE,
--   category               VARCHAR(50),
--   educational_attainment VARCHAR(50),
--   date_admitted          DATE
-- );

-- ============================================================
-- Indexes (optional but recommended for performance)
-- ============================================================
-- TODO: Create indexes on foreign keys and commonly searched fields
-- CREATE INDEX idx_enrollments_student_id ON enrollments(student_id);
-- CREATE INDEX idx_enrollments_course_id ON enrollments(course_id);
