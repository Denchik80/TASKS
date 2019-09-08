package air.company;

import java.util.*;
import java.util.stream.Stream;

public class AircraftWork {


    public static void main(String[] args) {

        try {

            ArrayList<PassengerAircraft> passengerAircraft = new ArrayList<>();
            passengerAircraft.add(new PassengerAircraft("Airbus-A310", 500.6, 550.3, 670.7));
            passengerAircraft.add(new PassengerAircraft("Airbus-A319", 600.58, 860.5, 580.8));
            passengerAircraft.add(new PassengerAircraft("AirbusA320", 800.73, 430.3, 670.44));
            passengerAircraft.add(new PassengerAircraft("Boeing-747", 900.5, 550.8, 399.77));
            passengerAircraft.add(new PassengerAircraft("Boeing-757", 1000.9, 568.1, 247.3));
            passengerAircraft.add(new PassengerAircraft(" Boeing-777", 1200.2, 432.2, 519.32));
            passengerAircraft.add(new PassengerAircraft("TU-204", 300.4, 557.1, 270.8));
            passengerAircraft.add(new PassengerAircraft("IL-62", 450.2, 339.5, 417.6));
            PassengerAircraft pass = passengerAircraft.get(0); // Get single element
            double carring = pass.getCarring();
            double flightPassengersRange = pass.getFlightRange();
            double capacity = pass.getCapacity();
            String AircraftName = pass.getName();
            System.out.printf("PassengerAircraft Name=%s;\nPassengerAircraft Carrying=%f;\nPassengerAircraft Capacity=%f;\nPassengerAircraft FlightRange=%f",AircraftName ,carring,capacity,flightPassengersRange);
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println();

        try {

            ArrayList<TransportAircraft> transportAircrafts = new ArrayList<>();
            transportAircrafts.add(new TransportAircraft("Il-112V", 4400.6, 170.4, 360.77));
            transportAircrafts.add(new TransportAircraft("MTA", 6300.58, 680.21, 850.45));
            transportAircrafts.add(new TransportAircraft("IL-76MD-90A", 2800.73, 440.31, 660.87));
            transportAircrafts.add(new TransportAircraft("Antonov An-124", 1900.5, 950.55, 939.3));
            transportAircrafts.add(new TransportAircraft(" Lockheed Martin C-5M Super Galaxy", 1000.9, 458.65, 27.98));
            transportAircrafts.add(new TransportAircraft(" Antonov An-22 ", 8240.2, 342.33, 359));
            transportAircrafts.add(new TransportAircraft(" Boeing C-17 Globemaster III", 3066.4, 557.7, 720.6));
            transportAircrafts.add(new TransportAircraft(" Xian Y-20", 4560.2, 639.12, 647.2));
            TransportAircraft trans = transportAircrafts.get(0); // Get single element
            double carring = trans.getCarring();
            double flightPassengersRange = trans.getFlightRange();
            double capacity = trans.getCapacity();
            String namePlane = trans.getName();
            System.out.printf("TransportAircraft Name=%s;\nTransportAircraft Carrying=%f;\nTransportAircraft Capacity=%f;\nTransportAircraft FlightRange=%f",namePlane ,carring,capacity,flightPassengersRange);
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println();
        try {

            ArrayList<SportAircraft> sportAircrafts = new ArrayList<>();
            sportAircrafts.add(new SportAircraft(" SU-26М.", 660.6, 510.4, 367.77));
            sportAircrafts.add(new SportAircraft(" Pitts S1T", 500.58, 580.6, 85.45));
            sportAircrafts.add(new SportAircraft(" CAP-20LS", 328.73, 540.8, 664.87));
            sportAircrafts.add(new SportAircraft(" Extra-230", 319.5, 590.55, 939.3));
            sportAircrafts.add(new SportAircraft("BRM NG-5", 510.9, 648.65, 273.98));
            sportAircrafts.add(new SportAircraft("Christen Eagle II", 540.2, 842.33, 759));
            sportAircrafts.add(new SportAircraft("De Havilland DH.88", 536.4, 554.7, 720.6));
            sportAircrafts.add(new SportAircraft("Klemm Kl 25", 54560.2, 79.52, 877.2));
            SportAircraft sport = sportAircrafts.get(0); // Get single element
            double carring = sport.getCarring();
            double flightPassengersRange = sport.getFlightRange();
            double capacity = sport.getCapacity();
            String namePlane = sport.getName();
            System.out.printf("SportAircraft Name=%s;\nSportAircraft Carrying=%f;\nSportAircraft Capacity=%f;\nSportAircraft FlightRange=%f",namePlane ,carring,capacity,flightPassengersRange);
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println();
        try {

            ArrayList<SpecialPlane> specialPlanes = new ArrayList<>();
            specialPlanes.add(new SpecialPlane("CV-22 Osprey", 8754.6, 563.4, 360.77));
            specialPlanes.add(new SpecialPlane("AC-130H/U Gunship", 4550.58, 538.42, 850.45));
            specialPlanes.add(new SpecialPlane("MC-130E/H Combat Talon I/II", 2354.73, 359.89, 660.87));
            specialPlanes.add(new SpecialPlane("MC-130P Combat Shadow", 5445.5, 459.55, 939.3));
            specialPlanes.add(new SpecialPlane("U-28A", 1032.9, 358.65, 27.98));
            specialPlanes.add(new SpecialPlane("MC-12W Liberty ", 5780.2, 342.33, 359));
            specialPlanes.add(new SpecialPlane("M-28 / C145A Skytruck", 1245.4, 523.7, 710.6));
            specialPlanes.add(new SpecialPlane("C-146A Wolfhound", 4385.2, 129.12, 647.2));
            SpecialPlane plane = specialPlanes.get(0); // Get single element
            double carring = plane.getCarring();
            double flightPassengersRange = plane.getFlightRange();
            double capacity = plane.getCapacity();
            String namePlane = plane.getName();
            System.out.printf("SpecialPlane Name=%s;\nSpecialPlane Carrying=%f;\nSpecialPlane Capacity=%f;\nSpecialPlane FlightRange=%f",namePlane ,carring,capacity,flightPassengersRange);
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }













    }
}
































