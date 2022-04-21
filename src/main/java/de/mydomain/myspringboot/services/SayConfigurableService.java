package de.mydomain.myspringboot.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sayConfigurableService")
public class SayConfigurableService implements SayService {

    private String toSay = "";

    @Override
    public String say() {
        return toSay;
    }

    public String getToSay() {
        return toSay;
    }

    public void setToSay(String toSay) {
        this.toSay = toSay;
    }
}
