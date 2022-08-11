package team10Projects.geometrikHesaplama;

public class Cember extends Sekil {

    @Override
    double ccevre(double yCap) {
        return 2 * Math.PI * yCap;
    }

    @Override
    public double calan(double yCap) {
        return Math.PI * yCap * yCap;
    }
}
