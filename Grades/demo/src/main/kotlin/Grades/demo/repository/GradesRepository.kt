package Grades.demo.repository

import Grades.demo.model.Grades
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GradesRepository : JpaRepository<Grades, Long>
