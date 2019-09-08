package Air.company;

import java.util.Random;

public class AircraftWork {

    public static class Main {
        public static int SIZE = 4;
        public static Aircraft[] Array = new Aircraft[SIZE];

        public static void main(String[] args) {

            AircraftMaker maker1 = new AircraftMakerAirbusA310();
            AircraftMaker maker2 = new AircraftMakerBoeing747();
            AircraftMaker maker3 = new AircraftMakerTU204();
            Aircraft aircraft1 = maker1.createAircraft();
            Aircraft aircraft2 = maker2.createAircraft();
            Aircraft aircraft3 = maker3.createAircraft();
            aircraft1.fly();
            aircraft2.fly();
            aircraft3.fly();
            System.out.println("Output array without objects: ");
            for (int i = 1; i < Array.length; i++) {
                System.out.print(Array[i] + " ");
            }

            System.out.println();
            Array[1] = aircraft1;//copy the object into an array
            Array[2] = aircraft2;//copy the object into an array
            Array[3] = aircraft3;//copy the object into an array
            System.out.println("Output array with objects: ");
            for (int i = 1; i < Array.length; i++) {
                System.out.print(Array[i] + " ");
            }
            System.out.println();
            System.out.println(getRandomItem(Array));
        }

        private static Object getRandomItem(Aircraft[]Array) {

            int itemIndex = (int)(Math.random()*Array.length);
            return Array[itemIndex];
        }
    }



    }




