import javax.swing.plaf.metal.MetalIconFactory;

public class MotorMatic extends Motor{
    private String alarm;
    private String maxSpeed;

    public void setAlarm(String newValue) {
        alarm = newValue;
        if(newValue=="Aktif"){
            System.out.println("Alarm menyala!!!");
        }else if(newValue=="Mati"){
            System.out.println("Alarm sedang mati!!!");
        }else{
            System.out.println("Salah memasukkan perintah");
        }
    }

    public void setMaxSpeed(String newValue) {
        maxSpeed = newValue;
    }


    public void print() {
        super.print();
        System.out.println("Kecepatan maksimal   : "+maxSpeed);
    }
}