package TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        List<TrafficLight> lamps = new ArrayList<>();
        for (String token : tokens) {
            TrafficLight trafficLight = new TrafficLight(Lights.valueOf(token));
            lamps.add(trafficLight);
        }
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (TrafficLight lamp : lamps) {
                sb.append(lamp.update()).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb.toString().trim());
    }
}