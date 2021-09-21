package br.com.person.integration;

import br.com.person.rest.request.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "address", url = "${address.url}")
public interface AddressClient {

    @GetMapping("/v1/addresses/{idPerson}")
    ResponseEntity<List<AddressResponse>> getAddress(@PathVariable("idPerson") long idPerson);
}
