package br.com.person.rest;

import br.com.person.rest.request.PersonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/persons")
public class PersonController {

    @GetMapping
    public ResponseEntity<List<PersonResponse>> getPersons() {
        var data = List.of(new PersonResponse("Arthur","Alves",18),
                new PersonResponse("Rafael","Alves",18),
                new PersonResponse("Diego","Alves",18));
        return ResponseEntity.ok(data);
    }
}
