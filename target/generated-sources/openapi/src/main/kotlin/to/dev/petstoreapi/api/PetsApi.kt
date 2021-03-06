/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package to.dev.petstoreapi.api

import to.dev.petstoreapi.model.ErrorDto
import to.dev.petstoreapi.model.PetDto
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:}")
interface PetsApi {

    fun getDelegate(): PetsApiDelegate = object: PetsApiDelegate {}


    @PostMapping(
            value = ["/pets"],
            produces = ["application/json"]
    )
    fun createPets(): ResponseEntity<Unit> {
        return getDelegate().createPets();
    }


    @GetMapping(
            value = ["/pets"],
            produces = ["application/json"]
    )
    fun listPets( @RequestParam(value = "limit", required = false) limit: kotlin.Int?
): ResponseEntity<List<PetDto>> {
        return getDelegate().listPets(limit);
    }


    @GetMapping(
            value = ["/pets/{petId}"],
            produces = ["application/json"]
    )
    fun showPetById( @PathVariable("petId") petId: kotlin.String
): ResponseEntity<PetDto> {
        return getDelegate().showPetById(petId);
    }
}
