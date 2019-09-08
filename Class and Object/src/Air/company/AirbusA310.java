package Air.company;

 class AirbusA310 implements  Aircraft {
     public String toString() {
         return "AirbusA310";
     }
     @Override
     public void fly() {
         System.out.println("Fly Airbus-A310 ");
     }
 }

