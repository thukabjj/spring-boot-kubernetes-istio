package br.com.address.rest;

import br.com.address.rest.response.AddressResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/addresses")
public class AddressController {

    @GetMapping("/{idPerson}")
    public ResponseEntity<List<AddressResponse>> getAddress(@PathVariable("idPerson") long idPerson) {
        final List<AddressResponse> addressResponses = List.of(new AddressResponse(idPerson,"Endereço 1", 1, "Teste", "Teste"),
                new AddressResponse(idPerson,"Endereço 2", 2, "Teste", "Teste"),
                new AddressResponse(idPerson,"Endereço 3", 3, "Teste", "Teste"),
                new AddressResponse(idPerson,"Endereço 4", 4, "Teste", "Teste"));

        return ResponseEntity.ok(addressResponses);
    }

}
