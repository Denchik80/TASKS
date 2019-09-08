package Air.company;

public class AircraftMakerBoeing747 implements AircraftMaker {
    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
