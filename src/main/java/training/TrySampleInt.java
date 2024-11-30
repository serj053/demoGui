package training;

public class TrySampleInt implements SimpleInt{
    @Override
    public double getValue() {
        return 4343.43;
    }

    public static void main(String[] args) {
        TrySampleInt sampleInt = new TrySampleInt();
        double i =  sampleInt.getValue();
        System.out.println(i);
    }
}
