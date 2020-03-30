package lab3.Clothes;

public class BlouseMakerConsist implements  Makerconsist{
    public Consist createConsist(){
        return new Consistblouse();


    }
}

