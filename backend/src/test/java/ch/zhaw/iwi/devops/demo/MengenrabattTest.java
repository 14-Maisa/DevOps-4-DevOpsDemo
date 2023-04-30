package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MengenrabattTest {
    

    @Test 
    void MengenRabatt57(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("11.4 % Mengenrabatt erhalten", rabatt.convert(57));
    }

    @Test 
    void MengenRabatt22(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("4.4 % Mengenrabatt erhalten", rabatt.convert(22));
    }

    @Test 
    void MengenRabatt37(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("7.4 % Mengenrabatt erhalten", rabatt.convert(37));
    }

    @Test 
    void MengenRabatt28(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("6 % Mengenrabatt erhalten", rabatt.convert(28));
    }

    @Test 
    void MengenRabatt99(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("20 % Mengenrabatt erhalten", rabatt.convert(99));
    }

}
