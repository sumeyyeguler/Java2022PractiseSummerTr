package team10Projects.geometrikHesaplama;

public class Kare extends Dikdortgen {

    double cevre(double kisa,double uzun) {
        return kisa * 4;
    }

    @Override
    public double alan(double kisa, double uzun) {
        return kisa * uzun;
    }
}
