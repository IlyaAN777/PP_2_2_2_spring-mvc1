package web.models;

public class Car {
    private String mark;
    private String colour;
    private int yearOfProduction;

    public Car(String model, String colour, int yearOfProduction) {
        this.mark = model;
        this.colour = colour;
        this.yearOfProduction = yearOfProduction;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + mark + '\'' +
                ", colour='" + colour + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
