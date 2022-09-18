// Rizqi Zamzami Jamil 21417162089 SIB-2E 20
public class SepedaGunung extends Sepeda{
    private String tipeSuspensi;

    public void setTipeSuspensi (String newValue){
        tipeSuspensi = newValue;
    }

    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi: "+ tipeSuspensi);
    }
}
