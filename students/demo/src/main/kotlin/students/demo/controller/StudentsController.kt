package students.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import students.demo.model.Students
import students.demo.service.StudentsService
import java.util.*

@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
@RestController
@RequestMapping("/students")
class StudentsController {
    @Autowired
    lateinit var studentsService: StudentsService

    @GetMapping
    fun list(): List<Students> {
        return studentsService.list()
    }

    @GetMapping("/{id}")
    fun listOne(@PathVariable id: Long): Optional<Students> {
        return studentsService.listOne(id)
    }

    @PostMapping
    fun save(@RequestBody students: Students): ResponseEntity<Students> {
        return ResponseEntity(studentsService.save(students), HttpStatus.OK)
    }

    @PutMapping
    fun update(@RequestBody students: Students): ResponseEntity<Students> {
        return ResponseEntity(studentsService.update(students), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName(@RequestBody students: Students): ResponseEntity<Students> {
        return ResponseEntity(studentsService.update(students), HttpStatus.OK)
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Long): Boolean? {
        return studentsService.delete(id)
    }
}
