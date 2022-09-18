public class KipasAngin {
    private String merek;
    private int kecepatan;
    private int level;
    private int waktu;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setlevel(int newValue) {
        level = newValue;
    }

    public void setWaktu(int newValue) {
        waktu = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan += increment;
    }

    public void kurangiKecepatan(int increment) {
        kecepatan -= increment;
    }

    public void print() {
        System.out.println("Merek       : "+merek);
        System.out.println("Kecepatan   : "+kecepatan);
        System.out.println("Level       : "+level);
        System.out.println("waktu       : "+waktu);
    }


}
