package co.com.sofka.model.person;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

}
