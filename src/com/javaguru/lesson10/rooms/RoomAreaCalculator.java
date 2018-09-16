package com.javaguru.lesson10.rooms;

import java.util.List;

class RoomAreaCalculator {

    public double calculateTotalArea(List<Room> rooms) {
        double totalArea = 0;
        for(Room room : rooms) {
            totalArea += room.calculateArea();
        }
        return totalArea;
    }
}
