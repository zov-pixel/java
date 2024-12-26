package ru.lessons.lesson3.task3;


public class SwimmingPool {
 int fillingTime = 0;
 int getFilling = 0;

    public int getPoolFillingTime(int volume, int fillingSpeed, int devastationSpeed) {
        //TODO: тут реализуйте функционал наполнения бассейна
        while (getFilling < volume){
        fillingTime = fillingTime+1;
        getFilling+=(fillingSpeed-devastationSpeed);
    }
    return fillingTime;}
}