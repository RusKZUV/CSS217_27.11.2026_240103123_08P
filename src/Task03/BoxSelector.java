package Task03;

public class BoxSelector {
    public String selectBox(double weight) {
        if (weight <= 2.0) return "Small Box (A)";
        else if (weight <= 10.0) return "Medium Box (B)";
        else return "Large Box (C)";
    }
}