public class Umnozenie extends Operation{

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public double calculateResult() {
        return getA()*getB();
    }
}