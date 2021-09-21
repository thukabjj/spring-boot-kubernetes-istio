package br.com.person.service;

import br.com.person.integration.AddressClient;
import br.com.person.rest.request.AddressResponse;
import br.com.person.rest.request.PersonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final AddressClient addressClient;

    public List<PersonResponse> getPersons() {
        var data = List.of(new PersonResponse(1,"Arthur","Alves",18,null),
                new PersonResponse(2,"Rafael","Alves",18,null),
                new PersonResponse(3,"Diego","Alves",18,null));

        data.forEach(p ->{
            final List<AddressResponse> addresses = addressClient.getAddress(p.getId()).getBody();
            p.setAddresses(addresses);
        });

        return data;
    }
}
