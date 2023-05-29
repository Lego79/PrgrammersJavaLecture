package generic.tireGenericPractice;

public class Box<T> {

    public T weapon;

    public Box(T weapon) {
        this.weapon = weapon;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
