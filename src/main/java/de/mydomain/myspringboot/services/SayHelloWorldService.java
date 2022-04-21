package de.mydomain.myspringboot.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sayHelloWorldService")
public class SayHelloWorldService implements SayService {
    @Override
    public String say() {
        return "Hello World...";
    }
}
