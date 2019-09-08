package Air.company;

 class Boeing747 implements Aircraft {
     public String toString() {
         return "Boeing747";
     }
    @Override
    public void fly() {
        System.out.println("Fly Boeing-747");
    }
}
