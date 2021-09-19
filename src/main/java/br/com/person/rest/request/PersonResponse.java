package br.com.person.rest.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class PersonResponse {
    private String name;
    private String lastName;
    private int age;
}
