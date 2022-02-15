package com.example.foo.test.foo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Data
public class FooDTO {
    private Long id;

    @NotBlank(message = "Foo adı boş ola bilməz")
    private String name;
}
