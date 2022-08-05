package work;

public class C01_Encapsulation {
    /*
    projemizde farklı farklı classlarda çalışıyorsak
    variable ve methodlara obje üzerinden ulaşabiliyorduk

    private olan
     */
    private String isim;
    private String soyIsim;
    private int yas;
    protected int tel;
    protected String brans;

    @Override
    public String toString() {
        return "C01_Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }

    public C01_Encapsulation() {
    }

    public C01_Encapsulation(String isim, String soyIsim, int yas) {
        //this.isim = isim;
        setIsim(isim);
        this.soyIsim = soyIsim;
        //this.yas = yas;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim.substring(0,1).toUpperCase()+isim.substring(1);
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0 || yas>100){
            System.out.println("geçerli yaş girelim");
        }else {
            this.yas = yas;
        }
    }


}
