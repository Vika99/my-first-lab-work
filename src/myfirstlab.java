public class myfirstlab {
    public static void main(String[] args) {
        double x = 2, a = 1, b = 4, u = 6;
        double result;
        if (x < a) {
            if (x >= 0) {
                double someVariable = 3 + (Math.pow(Math.sqrt(x + u), 2));
                result = someVariable;
            } else {
                System.out.println("x >= 0");
                return;
            }
        } else if (x >= a && x <= b) {
            result = Math.pow(x, 3) + Math.pow(x, 2) - 15;
        } else {
            result = Math.tan(Math.PI * (x + u));
        }
        System.out.println(result);
    }
}



