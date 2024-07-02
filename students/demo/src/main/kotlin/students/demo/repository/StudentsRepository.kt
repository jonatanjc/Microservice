package students.demo.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import students.demo.model.Students

@Repository
interface StudentsRepository : JpaRepository<Students, Long> {
    fun findById(id: Long?): Students?
}
