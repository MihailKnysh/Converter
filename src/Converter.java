public class Converter {
    private double usdRate;
    private double eurRate;
    private double rubRate;

    public Converter(double usdRate, double eurRate, double rubRate) {
        this.usdRate = usdRate;
        this.eurRate = eurRate;
        this.rubRate = rubRate;
    }

    public double getUsdRate() {
        return usdRate;
    }

    public double getEurRate() {
        return eurRate;
    }

    public double getRubRate() {
        return rubRate;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "usd=" + usdRate +
                ", eur=" + eurRate +
                ", rub=" + rubRate +
                '}';
    }
}
