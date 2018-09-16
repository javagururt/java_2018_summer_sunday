package com.javaguru.lesson10.rooms;

import java.util.ArrayList;
import java.util.List;

class DreamHouse {

    private List<AbstractRoom> rooms;

    public DreamHouse() {
        rooms = new ArrayList<>();
    }

    public void addRoom(AbstractRoom room) {
        rooms.add(room);
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (AbstractRoom room : rooms) {
            totalArea += room.calculateArea();
        }
        return totalArea;
    }

    public void printAllRoomNames() {
        rooms.stream()
                .map(room -> room.getName())
                .filter(name -> !name.contains("Test"))
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}
