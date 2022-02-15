package com.example.foo.test.api.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/adminhr/foos")
public class FooApiController implements FooApi {
    private final FooApiDelegate delegate;

    public FooApiController(@Autowired(required = false) FooApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new FooApiDelegate() {});
    }

    @Override
    public FooApiDelegate getDelegate() {
        return delegate;
    }
}