package br.com.person.rest.request;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class PersonResponse {
    private long id;
    private String name;
    private String lastName;
    private int age;
    List<AddressResponse> addresses;
}
