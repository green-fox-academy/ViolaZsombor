package aircraftcarrier;

public class F16 {

    private int maxAmmo = 8;
    private int baseDmg = 30;
    private int ammoStorage = 0;

    public void fight () {

    }

    public String getType() {
        return "F16";
    }

    public boolean isPriority () {
        return false;
    }

    public String getStatus () {
        return "Type"+getType()+" Ammo:"+maxAmmo+" Base Damage: "+ baseDmg + "All Damage: " +baseDmg*maxAmmo;
    }



}
