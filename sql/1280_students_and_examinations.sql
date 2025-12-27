/*
Problem: Students and Examinations
Problem No: 1280
Platform: LeetCode
Section: SQL

----------------------------------
Problem Statement:
----------------------------------
Given three tables:
1. Students(student_id, student_name)
2. Subjects(subject_name)
3. Examinations(student_id, subject_name)

Each student takes every subject.
The task is to find how many times each student attended each subject exam.

The result should include all students and all subjects,
even if a student did not attend any exam.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use CROSS JOIN between Students and Subjects
   to generate all possible student-subject combinations.
2. LEFT JOIN Examinations table to count attended exams.
3. COUNT() is used on subject_name from Examinations table.
4. GROUP BY student_id, student_name, subject_name.
5. Order the result by student_id and subject_name.

----------------------------------
Tech Used:
----------------------------------
- SQL
- JOINs (CROSS JOIN, LEFT JOIN)
- GROUP BY
- COUNT()

----------------------------------
Solution:
----------------------------------
*/

SELECT 
    s.student_id,
    s.student_name,
    sub.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
    ON s.student_id = e.student_id
    AND sub.subject_name = e.subject_name
GROUP BY 
    s.student_id,
    s.student_name,
    sub.subject_name
ORDER BY 
    s.student_id,
    sub.subject_name;
