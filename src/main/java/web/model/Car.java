package web.model;

import java.time.LocalDate;


public class Car {
    private String model;
    private int maxSpeed;
    private String series;

    public Car() {
    }

    public Car(String model, int maxSpeed, String series) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", date=" + series +
                '}';
    }
}
