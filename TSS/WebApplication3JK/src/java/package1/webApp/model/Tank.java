/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1.webApp.model;

/**
 *
 * @author Jakub
 */
public class Tank {
    private String name;
    private int armorAmount;
    private int gunCaliber;
    
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
