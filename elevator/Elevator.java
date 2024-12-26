package ru.lessons.lesson5.task1;

import java.util.Scanner;

public class Elevator {

    private int currentFloor = 1;
    public int minFloor;
    public int maxFloor;
    public int floor;



    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void move(int floor) {
        this.floor = floor;
        boolean error = false;
        if (floor < minFloor || floor > maxFloor) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        if (floor == currentFloor) {

        }
        if (currentFloor < floor){
            while(currentFloor < floor){
                moveUp();
                System.out.println(currentFloor);
            }
        } else{
            while(currentFloor > floor){
                moveDown();
                System.out.println(currentFloor);}
        }
    }
    private void moveUp() {
        currentFloor = currentFloor+1;
    }
    private void moveDown() {
        currentFloor = currentFloor-1;
    }

    public int getCurrentFloor() {return currentFloor;}
}
