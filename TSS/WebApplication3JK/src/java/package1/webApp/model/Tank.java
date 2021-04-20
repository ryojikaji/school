package package1.webApp.model;

public class Tank {
    private int tankId;
    private String name;
    private int armorAmount;
    private int gunCaliber;

    public int getTankId() {
        return tankId;
    }
    
    public Tank(int tankId, String name, int armorAmount, int gunCaliber){
        this.tankId = tankId;
        setName(name);
        this.armorAmount = armorAmount;
        this.gunCaliber = gunCaliber;
    }
    
    public Tank(String name, int armorAmount, int gunCaliber){
        setName(name);
        this.armorAmount = armorAmount;
        this.gunCaliber = gunCaliber;
    }

    public Tank() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setName(String name){
        if (!name.isEmpty())
            this.name = name;
    }
    public void setArmorAmount(int armorAmount){
        this.armorAmount = armorAmount;
    }
    public void setGunCaliber(int gunCaliber){
        this.gunCaliber = gunCaliber;
    }

    public String getName(){
        return name;
    }
    public int getArmorAmount(){
        return armorAmount;
    }
    public int getGunCaliber(){
        return gunCaliber;
    }
}
