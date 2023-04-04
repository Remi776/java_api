package seminar3.task;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mercury");
        ArrayList<Integer> countPlanets = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        for (String planet : planets) {
            int positiion = resultList.indexOf(planet);
            if (positiion >= 0) {
                countPlanets.set(positiion, countPlanets.get(positiion) + 1);
            } else {
                resultList.add(planet);
                countPlanets.add(1);
            }

        }
        printPlanetCount(resultList, countPlanets);
    }

    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }


}
