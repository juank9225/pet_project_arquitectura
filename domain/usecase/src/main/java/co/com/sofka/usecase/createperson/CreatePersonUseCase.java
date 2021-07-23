package co.com.sofka.usecase.createperson;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CreatePersonUseCase {

    private final PersonRepository personRepository;

    public Person createPersona(Person person){
        return personRepository.createPersona(person);
    }
}
