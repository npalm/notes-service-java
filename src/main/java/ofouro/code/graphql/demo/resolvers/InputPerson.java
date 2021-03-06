package ofouro.code.graphql.demo.resolvers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ofouro.code.graphql.demo.model.Person;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InputPerson {

    private String name;
    private String email;

    static Person convert(InputPerson person) {
        return person != null ? new Person(person.name, person.email) : null;
    }
}
