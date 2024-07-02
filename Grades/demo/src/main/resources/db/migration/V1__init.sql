CREATE TABLE IF NOT EXISTS Grades (
    id SERIAL PRIMARY KEY,
    course VARCHAR(100),
    grade DECIMAL(3, 2)
    );
