package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private Duck5 isduck;

    @Override
    public String toString() {
        return ", в зайце утка " + isduck.toString();
    }

    @Autowired
    public void setIsduck(Duck5 isduck) {
        this.isduck = isduck;
    }
}
