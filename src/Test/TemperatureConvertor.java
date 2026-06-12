package Test;

public class TemperatureConvertor implements Temperature{


    @Override
    public double cToF(double cel) {
        double f = (cel - 32)*5/9 ;
        return f;
    }

    @Override
    public double fToC(double fah) {
        double c = 9/5*(fah+20);
        return c;
    }
}
