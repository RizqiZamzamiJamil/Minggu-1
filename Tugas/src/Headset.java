public class Headset {
    private String merek;
    private String jenis;
    private int volume;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setjenis(String newValue) {
        jenis = newValue;
    }

    public void tambahVolume(int increment) {
        volume += increment;
    }

    public void kurangiVolume(int increment) {
        volume -= increment;
    }

    public void print() {
        System.out.println("Merek       : "+merek);
        System.out.println("Jenis       : "+jenis);
        System.out.println("Volume      : "+volume);
    }
}
