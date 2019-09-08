package air.company;

public class CivilAircraft implements AirInterface {

    private String AircraftName;
    private   double FlightRange;
    private   double Carring;
    private  double Capacity;

    public CivilAircraft(String AircraftName, double FlightRange , double Carring, double Capacity) {
        this.AircraftName=AircraftName;
        this. FlightRange= FlightRange;
        this.Capacity=Capacity;
        this.Carring=Carring;
    }

    public CivilAircraft(double FlightRange) {
        this. FlightRange= FlightRange;
    }

    @Override
    public String toString() {
        return "Aircraft name=" + AircraftName
                + ", FlightRange=" + getFlightRange()
                + ",Carring =" + getCarring()
                + ",Capacity =" + getCapacity() + "]";
    }
    public  double getCarring() {
        return Carring;
    }

    public void setCarring(double Carring ) {
        this.Carring = Carring;
    }

    public  double getCapacity() {
        return Capacity;
    }

    public void setCapacity(double Capacity ) {

        this.Capacity = Capacity;
    }

    public  double getFlightRange() {
        return FlightRange;
    }

    public void setFlightRange(double FlightRange ) {

        this.FlightRange = FlightRange;
    }
    public String getName() {
        return AircraftName;
    }

    public void setName(String namePlane ) {

        this.AircraftName = AircraftName;
    }


}
