public class MotorKopling extends Motor{
    private String mode;
    private int gear;

    public void tambahGear(int increment) {
        gear += increment;
    }

    public void kurangiGear(int increment) {
        gear -= increment;
    }

    public void setMode(String newValue) {
        mode = newValue;
    }

    public void print() {
        super.print();
        System.out.println("Gear        : "+gear);
        System.out.println("Mode        : "+mode);
    }
}