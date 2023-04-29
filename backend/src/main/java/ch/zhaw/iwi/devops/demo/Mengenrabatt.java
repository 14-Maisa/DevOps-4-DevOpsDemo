package ch.zhaw.iwi.devops.demo;

public class Mengenrabatt {
    public String convert(int i) {
        if (i < 5) {
            return "Mengenrabatt nicht erhalten";
        } else if (i >= 5 && i <= 100) {
            double rabatt = i / 5.0;
            String rabattString = String.format("%.1f", rabatt).replace(".0", "");
            return rabattString + " % Mengenrabatt erhalten";
        } else {
            return "Mehr als 100 Artikeln können nicht bestellt werden";
        }
    }
    
}
