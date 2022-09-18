public class Motor {
    private String merek;
    private String warna;
    private String tenaga;
    private int kecepatan;
    private int bensin;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setTenaga(String newValue) {
        tenaga = newValue;
    }

    public void setBensin(int newValue) {
        bensin = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }

    public void kurangiKecepatan(int increment) {
        kecepatan -= increment;
    }

    public void print() {
        System.out.println("Merek       : "+merek);
        System.out.println("Warna       : "+warna);
        System.out.println("Kecepatan   : "+kecepatan);
        System.out.println("Tenaga      : "+tenaga);
        System.out.println("Bensin      : "+bensin);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
