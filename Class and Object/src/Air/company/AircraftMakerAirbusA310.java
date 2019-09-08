package Air.company;

 class AircraftMakerAirbusA310 implements AircraftMaker {
     @Override
     public Aircraft createAircraft() {
         return new AirbusA310();
     }
 }
