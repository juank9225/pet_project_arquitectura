package co.com.sofka.config;

import co.com.sofka.model.person.gateways.PersonRepository;
import co.com.sofka.usecase.createperson.CreatePersonUseCase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.sofka.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {
        public CreatePersonUseCase crear(PersonRepository personRepository){
                return new CreatePersonUseCase(personRepository);
        }
}
