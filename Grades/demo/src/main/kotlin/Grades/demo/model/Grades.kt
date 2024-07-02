package Grades.demo.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "grades")
class Grades {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Long? = null

    @Column(name = "course")
    var course: String? = null

    var grade: BigDecimal? = null
}
