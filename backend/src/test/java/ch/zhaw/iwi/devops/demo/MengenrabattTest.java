package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MengenrabattTest {
    
    @Test 
    public void MengenRabatt1(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("Mengenrabatt nicht erhalten", rabatt.convert(1));
    }

    @Test 
    public void MengenRabatt18(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("3.6 % Mengenrabatt erhalten", rabatt.convert(18));
    }

    @Test 
    public void MengenRabatt57(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("11.4 % Mengenrabatt erhalten", rabatt.convert(57));
    }

    @Test 
    public void MengenRabatt103(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("Mehr als 100 Artikeln können nicht bestellt werden", rabatt.convert(103));
    }

    @Test 
    public void MengenRabatt22(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("4.4 % Mengenrabatt erhalten", rabatt.convert(22));
    }

    @Test 
    public void MengenRabatt37(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("7.4 % Mengenrabatt erhalten", rabatt.convert(37));
    }

    @Test 
    public void MengenRabatt28(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("5.6 % Mengenrabatt erhalten", rabatt.convert(28));
    }

    @Test 
    public void MengenRabatt99(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("19.8 % Mengenrabatt erhalten", rabatt.convert(99));
    }

    @Test 
    public void MengenRabatt5(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("1 % Mengenrabatt erhalten", rabatt.convert(5));
    }

    @Test 
    public void MengenRabatt75(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("15 % Mengenrabatt erhalten", rabatt.convert(75));
    }

    @Test 
    public void MengenRabatt0(){
        Mengenrabatt rabatt = new Mengenrabatt();
        Assertions.assertEquals("Mengenrabatt nicht erhalten", rabatt.convert(0));
    }


}
