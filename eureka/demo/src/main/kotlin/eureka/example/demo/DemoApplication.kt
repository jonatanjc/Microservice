package eureka.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer   //Add this line
@SpringBootApplication
class DemoeurekaApplication

fun main(args: Array<String>) {
	runApplication<DemoeurekaApplication>(*args)
}