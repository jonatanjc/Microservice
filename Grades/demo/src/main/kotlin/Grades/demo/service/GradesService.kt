package Grades.demo.service

import Grades.demo.model.Grades
import Grades.demo.repository.GradesRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Service
class GradesService {
    @Autowired
    lateinit var gradesRepository: GradesRepository

    fun list(): List<Grades> {
        return gradesRepository.findAll()
    }

    fun listOne(id: Long): Optional<Grades> {
        return gradesRepository.findById(id)
    }

    fun save(grades: Grades): Grades {
        return try {
            gradesRepository.save(grades)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, ex.message)
        }
    }

    fun update(grades: Grades): Grades {
        return try {
            gradesRepository.findById(grades.id!!)
                .orElseThrow { Exception("ID no existe") }
            gradesRepository.save(grades)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, ex.message)
        }
    }

    fun delete(id: Long?): Boolean? {
        return try {
            gradesRepository.findById(id!!)
                .orElseThrow { Exception("ID no existe") }
            gradesRepository.deleteById(id)
            true
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, ex.message)
        }
    }
}
