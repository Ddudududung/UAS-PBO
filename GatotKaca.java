package ProjectD;

public class GatotKaca extends SuperHero {
    public GatotKaca(String name, String gender, String senjata, int tenaga) {
        super(name, gender, senjata, tenaga);
    }

    public void status() {
        if (tenaga > 40)
            System.out.println("Menyerang");
        else
            System.out.println("Bertahan");
    }

    public void type() {
        System.out.println("Super Hero Laki-Laki");
    }

    public void superPower() {
        System.out.println("Satria Dewa");
    }
}

