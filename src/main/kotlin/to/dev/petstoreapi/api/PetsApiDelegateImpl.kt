package to.dev.petstoreapi.api

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import to.dev.petstoreapi.model.PetDto

@Component
class PetsApiDelegateImpl : PetsApiDelegate {
    override fun listPets(limit: Int?): ResponseEntity<List<PetDto>> {
        return ResponseEntity(
            listOf(
                PetDto(1L, "Charlie"),
                PetDto(2L, "Obi"),
                PetDto(3L, "Loki"),
            ),
            HttpStatus.OK
        )
    }
}