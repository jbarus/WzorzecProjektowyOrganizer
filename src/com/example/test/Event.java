package com.example.test;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    private String name;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String flag;
    private String Notes;

    public String name() {return name;}

    public LocalDate date() {return date;}

    public LocalTime startTime() {return startTime;}

    public LocalTime endTime() {return endTime;}

    public String flag() {return flag;}

    public String Notes() {return Notes;}

    private Event(EventBuilder builder) {
        this.name = builder.name;
        this.date = builder.date;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.flag = builder.flag;
        this.Notes = builder.Notes;
    }

    public static class EventBuilder{
        private String name;
        private LocalDate date;
        private LocalTime startTime;
        private LocalTime endTime;
        private String flag;
        private String Notes;

        public EventBuilder name(String name){
            this.name = name;
            return this;
        }
        public EventBuilder date(LocalDate date){
            this.date = date;
            return this;
        }
        public EventBuilder startTime(LocalTime startTime){
            this.startTime = startTime;
            return this;
        }
        public EventBuilder endTime(LocalTime endTime){
            this.endTime = endTime;
            return this;
        }
        public EventBuilder flag(String flag){
            this.flag = flag;
            return this;
        }
        public EventBuilder Notes(String Notes){
            this.Notes = Notes;
            return this;
        }

        public Event build(){
            return new Event(this);
        }
    }
}
