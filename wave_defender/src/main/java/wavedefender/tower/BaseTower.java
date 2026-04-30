package wavedefender.tower;

public abstract class BaseTower {


    // set values
    private final int towerBuyPrice;
    private int damage;
    private double fireRate; // Shots per Minute
    private boolean blastPenetraion;


    // Update Values
    private int enemiesKilled;
    private int towerCurrentPrice;


    // Base Tower branch, every Specialised or common Defensetower's Dad
    public BaseTower(int towerBuyPrice, int damage, double fireRate){
        this.towerBuyPrice = towerBuyPrice;
        this.damage = damage;
        this.fireRate = fireRate;
        this.towerCurrentPrice = towerBuyPrice;
        this.blastPenetraion = false;
    }

    // Method to keep track on enemies killed
    public void killIncrementation(){
        this.enemiesKilled = this.enemiesKilled +1;
    }

    // Method to sell Tower
    public void sellTower(){
        //Need a Player Object so i can sell (WIP!!!)
    }

    //Method to switch targets
    public void switchTargets(){
        //Also WIP!!!
    }

    //Getters 
    public int getDamage(){
        return this.damage;
    }

    public int displayKillCount(){
        return this.enemiesKilled;
    }

    public boolean getBlastPenetraion(){
        return this.blastPenetraion;
    }
    
    // Method to Update Towers Current price based on Upgrade Price
    // towerBuyPrice is always less or equal than towerCurrentPrcie
    public void updateTowerCurrentPrice(int value){
        this.towerCurrentPrice = this.towerCurrentPrice + value;
        if (towerCurrentPrice < towerBuyPrice){
            System.out.println("Error: T001");
        }

    }

    // set Blast Protection 

    protected void setBlastProtection(boolean x){
        if (x==true){
            this.blastPenetraion = true;
        } else {
            this.blastPenetraion = false;
        }
    }
    




}
