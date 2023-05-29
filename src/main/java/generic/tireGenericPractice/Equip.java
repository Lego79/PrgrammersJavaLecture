package generic.tireGenericPractice;

public class Equip<T> {

    public T weapon;

    public Equip(T weapon) {
        this.weapon = weapon;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
