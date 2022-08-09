package team10Projects.team10airlinesNQ;

import java.util.Arrays;
import java.util.List;

public class PassengerTransaction {
    public static void main(String[] args) {

        Passenger pass = new Passenger("sumeyye", 11, "D", "G");
        hesap(pass.getAge(), pass.getCity(), pass.getTicketType());
        System.out.println(pass);
        System.out.println("****team10_airlines****");
    }

    public static void hesap(int age, String city, String ticketType) {
        List<String> destination = Arrays.asList("B", "C", "D");
        int[] fiyatlar = {50, 60, 70};
        double price = 0;

        for (int i = 0; i < destination.size(); i++) {
            for (int j = i; j < i + 1; j++) {
                if (city.equals(destination.get(i))) {
                    if (age < 12) {
                        price = fiyatlar[j] * 0.5;
                        System.out.println("yaş indirimi yapılmştır");
                    } else if (age >= 12 && age <= 24) {
                        price = fiyatlar[j] * 0.8;
                        System.out.println("yaş indirimi yapılmştır");
                    } else if (age >= 65) {
                        price = fiyatlar[j] * 0.7;
                        System.out.println("yaş indirimi yapılmştır");
                    } else {
                        price = fiyatlar[j];
                    }
                }
            }
        }
        if (ticketType.equalsIgnoreCase("GD")) {
            price = price * 2 * 0.8;
            System.out.println("gidiş dönüş indirimi yapılmıştır");
        } else if (age > 24 && age < 65) {
            System.out.println("indirimsiz yolcu");
        }
        System.out.println("airfare :" + price);

    }
}