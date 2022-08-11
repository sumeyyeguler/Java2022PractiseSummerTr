package team10Projects.geometrikHesaplama;

public class Dikdortgen extends Sekil {

    @Override
    double cevre(double kisa, double uzun) {
        return (uzun + kisa) * 2;
    }

    @Override
    public double alan(double kisa, double uzun) {
        return uzun*kisa;
    }


}
