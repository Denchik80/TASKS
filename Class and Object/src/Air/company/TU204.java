package Air.company;

 class TU204 implements Aircraft {
     public String toString() {
         return "TU204";
     }
    @Override
    public void fly() {
        System.out.println("Fly TU-204");
    }
}
