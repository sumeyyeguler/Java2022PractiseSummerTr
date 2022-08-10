package team10Projects.team10airlinesNQ;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Passenger {
    private String nameSurname;
    private int age = 0;
    private String city;
    private String flightNo;
    private String gateHno;
    private String ticketType;

    public Passenger(String nameSurname, int age, String city, String ticketType) {
        this.nameSurname = nameSurname;
        this.age = age;
        this.city = city;
        this.ticketType = ticketType;
        setFlightNo();
        setGateHno(city);
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setFlightNo() {
        this.flightNo = "" + LocalDate.now().getYear() + LocalTime.now().getHour();
    }

    public void setGateHno(String city) {
        Random r = new Random();
        this.gateHno = "" + city + r.nextInt(10);
    }

    public String getTicketType() {
        return ticketType;
    }

    @Override
    public String toString() {
        return "Passenger:" +
                "\n Name Surname:" + nameSurname +
                "\n Age         :" + age +
                "\n Destination :" + city +
                "\n Flight No   :" + flightNo +
                "\n Gate   No   :" + gateHno +
                "\n Ticket Type :" + ticketType;
    }
}