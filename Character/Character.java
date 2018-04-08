public abstract class Character {

  WeaponBehaviour weapon;

  public Character() {
  }

  public void fight() {
    weapon.useWeapon();
  }

  public void setWeapon(WeaponBehaviour w) {
    this.weapon = w;
  }
}
