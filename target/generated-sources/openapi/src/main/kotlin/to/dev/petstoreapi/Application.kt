package to.dev.petstoreapi

import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
@ComponentScan(basePackages = ["to.dev.petstoreapi", "to.dev.petstoreapi.api", "to.dev.petstoreapi.model"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
