package to.dev.petstoreapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"])

@Controller
@RequestMapping("\${openapi.swaggerPetstore.base-path:}")
class PetsApiController(
        @org.springframework.beans.factory.annotation.Autowired(required = false) delegate: PetsApiDelegate?
) : PetsApi {
    private val delegate: PetsApiDelegate

    init {
        this.delegate = Optional.ofNullable(delegate).orElse(object : PetsApiDelegate {})
    }

    override fun getDelegate(): PetsApiDelegate = delegate
}
