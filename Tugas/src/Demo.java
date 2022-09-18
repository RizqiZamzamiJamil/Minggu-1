public class Demo {
    public static void main(String[] args) {
        Motor mtr = new Motor();
        MotorKopling mtrK = new MotorKopling();
        MotorMatic mtrM = new MotorMatic();
        KipasAngin ka = new KipasAngin();
        Headset hd = new Headset();

        mtrK.setMerek("Vixion");
        mtrK.setWarna("Putih");
        mtrK.setTenaga("150 CC");
        mtrK.setMode("Sport");
        mtrK.setBensin(200);
        mtrK.tambahGear(6);
        mtrK.tambahKecepatan(110);
        mtrK.kurangiKecepatan(20);
        mtrK.print();

        System.out.println("");
        System.out.println("");

        mtrM.setMerek("Vario");
        mtrM.setWarna("ungu");
        mtrM.setTenaga("125 CC");
        mtrM.setBensin(100);
        mtrM.setMaxSpeed("100 KM/H");
        mtrM.tambahKecepatan(80);
        mtrM.kurangiKecepatan(30);
        mtrM.print();

        System.out.println("");
        System.out.println("");
        
        ka.setMerek("Okayama");
        ka.setWaktu(15);
        ka.setlevel(2);
        ka.tambahKecepatan(20);
        ka.kurangiKecepatan(5);
        ka.print();

        System.out.println("");
        System.out.println("");

        hd.setMerek("Rexus");
        hd.setjenis("Wired");
        hd.tambahVolume(50);
        hd.kurangiVolume(20);
        hd.print();
    }
}
