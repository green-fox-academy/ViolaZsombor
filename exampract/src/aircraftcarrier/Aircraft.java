package aircraftcarrier;

public class Aircraft {
    private int maxAmmo;
    private int currentAmmo;
    private int baseDmg;
    private String type;

    public Aircraft(String type) {
        this.type = type;
        this.currentAmmo = 0;
    }

    public int fight() {
        int dealtDmg = currentAmmo * baseDmg;
        currentAmmo = 0;
        return dealtDmg;
    }

    public String getType() {
        return this.type;
    }

    public boolean isPriority() {
        if (type.equals("F35")) {
            return true;
        } else return false;
    }
}
