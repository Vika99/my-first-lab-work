package lab3.Clothes;

public class JeansMakerConsist implements Makerconsist {
    public Consist createConsist(){
        return new Consistjeans();


    }
}

