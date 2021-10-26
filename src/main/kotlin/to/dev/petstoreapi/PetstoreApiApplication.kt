package to.dev.petstoreapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetstoreApiApplication

fun main(args: Array<String>) {
	runApplication<PetstoreApiApplication>(*args)
}
