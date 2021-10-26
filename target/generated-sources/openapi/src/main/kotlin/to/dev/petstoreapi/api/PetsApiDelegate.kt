package to.dev.petstoreapi.api

import to.dev.petstoreapi.model.ErrorDto
import to.dev.petstoreapi.model.PetDto
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.core.io.Resource

import java.util.Optional

/**
 * A delegate to be called by the {@link PetsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"])
interface PetsApiDelegate {

    fun getRequest(): Optional<NativeWebRequest> = Optional.empty()

    /**
     * @see PetsApi#createPets
     */
    fun createPets(): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

    }


    /**
     * @see PetsApi#listPets
     */
    fun listPets(limit: kotlin.Int?): ResponseEntity<List<PetDto>> {
        getRequest().ifPresent { request ->
            for (mediaType in MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"name\",  \"id\" : 0,  \"tag\" : \"tag\"}")
                    break
                }
            }
        }
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

    }


    /**
     * @see PetsApi#showPetById
     */
    fun showPetById(petId: kotlin.String): ResponseEntity<PetDto> {
        getRequest().ifPresent { request ->
            for (mediaType in MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"name\",  \"id\" : 0,  \"tag\" : \"tag\"}")
                    break
                }
            }
        }
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

    }

}
