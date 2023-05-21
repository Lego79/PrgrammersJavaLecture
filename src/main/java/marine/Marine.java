package marine;

public class Marine {

    private String name;
    private int hp;
    private int damage;
    private int maxDamage;
    private int damageUpgrade;
    private int armorUpgrade;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getDamageUpgrade() {
        return damageUpgrade;
    }

    public void setDamageUpgrade(int damageUpgrade) {
        this.damageUpgrade = damageUpgrade;
    }

    public int getArmorUpgrade() {
        return armorUpgrade;
    }

    public void setArmorUpgrade(int armorUpgrade) {
        this.armorUpgrade = armorUpgrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marine(String name, int damageUpgrade, int armorUpgrade) {
        this.name = name;
        this.hp = 40;
        this.damage = 6;
        this.maxDamage = 9;
        this.damageUpgrade = 1;
        this.armorUpgrade = armorUpgrade;
    }

    public void damageUp () {



        if(damage < maxDamage); {
            damage = damage + damageUpgrade;
            if(damage > maxDamage) {
                damage = maxDamage;

                System.out.println("damage= " + damage   + "cannot upgrade anymore");
            } else {
                System.out.println("damage= " + damage);
            }

        }



    }


}
