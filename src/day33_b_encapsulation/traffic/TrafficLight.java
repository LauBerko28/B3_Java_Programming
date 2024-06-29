package day33_b_encapsulation.traffic;

public class TrafficLight {

    // encapsulating the data
    private String color;

    public TrafficLight (String color) {
        setColor(color);
    }

    // GETTER --> ACCESSOR - read/see only method
    // SETTER --> MUTATOR - update/change only method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()){
            case "yellow":
            case "red":
            case "green":
                this.color = color;
        }
    }

}
