package com.example.test;

import java.time.LocalDate;
import java.time.LocalTime;

public class BuilderPattern {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues


        Event event = new Event.EventBuilder()
                .name("Dziala")
                .date(LocalDate.of(2023,1,8))
                .startTime(LocalTime.of(18,38))
                .endTime(LocalTime.of(20,38))
                .flag("Dziala flaga")
                .Notes("Dzialają Notatki").build();
        System.out.println(event.name());
        System.out.println(event.Notes());
    }
}
