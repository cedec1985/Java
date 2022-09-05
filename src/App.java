

class Vehicle {
    public int maxSpeed[] ={200,300};
    int wheels;
    double fuelcapacity;
    public String model1 = "mercedes";
    public String model2 = "porsche";
    public String model3 = "cayenne";

    void Setmodel(String v1, String v2, String v3) {
        this.model1 = v1;
        this.model2 = v2;
        this.model3 = v3;
      
    }

    String Getmodel(String a, String b) {
        if (a == "mercedes") {
            return model1;
        } else {
            return model2;
        }
    }
    public Vehicle(){}
    
        void drive (){
            System.out.println("ce véhicule fait " + this.maxSpeed[0] + " à l'heure.");
              
}
        void storm(){
            this.fuelcapacity = 100;
            System.out.println("la porsche a une capacité de " + fuelcapacity + " litres.");

        }
}

    class program {

    public static void main(String[] args) {

        Vehicle c = new Vehicle();
        c.Setmodel("mercedes", "porsche","cayenne");
        c.Getmodel(c.model1, c.model2);
        System.out.println("ma " + c.model1 + " a une vitesse de 200 miles per hour.");
        System.out.println("ma " + c.model2 + " a une vitesse de 300 miles per hour.");
        System.out.println("la mercedes fait beep !");
        System.out.println("la mercedes fait " +c.maxSpeed[0]+ " km/h.");
        c.drive();
        Vehicle d =new Vehicle();
        d.storm();

    }

}
class SUV extends Vehicle{
    SUV(String car){
        car=this.model3;
    }
        public void carcasse(){
            this.wheels = 4;
        }     

       }

class program1{
    public static void main(String[] args) {
        SUV cayenne =new SUV("cayenne");
        cayenne.Setmodel("mercedes", "porsche","cayenne");
        cayenne.Getmodel(cayenne.model2,cayenne.model3);
        cayenne.carcasse();
        System.out.println("la cayenne a " + cayenne.wheels + " roues motrices");
        cayenne.storm();
        System.out.println("le " + cayenne.model3 + " a une capacité de " + cayenne.fuelcapacity + "litres");
        cayenne.drive();
        System.out.println("le " + cayenne.model3 + " roule à 200 km/h.");
    }
} 



