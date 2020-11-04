package TrafficLights;

public class TrafficLight {
    private Lights light;

    public TrafficLight(Lights light) {
        this.light = light;
    }

    public Lights update() {
        switch (light) {
            case RED:
                this.light = Lights.GREEN;
                break;
            case GREEN:
                this.light = Lights.YELLOW;
                break;
            case YELLOW:
                this.light = Lights.RED;
                break;
        }
        return this.light;
    }
}
