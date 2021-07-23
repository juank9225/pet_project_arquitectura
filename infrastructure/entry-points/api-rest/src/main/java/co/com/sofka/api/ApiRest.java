package co.com.sofka.api;
import co.com.sofka.model.person.Person;
import co.com.sofka.usecase.createperson.CreatePersonUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final CreatePersonUseCase createPersonUseCase;


    @PostMapping(path = "/createperson")
    public Person crearpersona(@RequestBody Person person) {
        return createPersonUseCase.createPersona(person);
    }
}
