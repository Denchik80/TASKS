package Air.company;

public class AircraftMakerTU204 implements AircraftMaker {
    @Override
    public Aircraft createAircraft() {
        return new TU204();
    }
}
