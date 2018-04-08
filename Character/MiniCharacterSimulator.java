public class MiniCharacterSimulator {
  public static void main(String[] args) {
    Character queen = new Queen();
    queen.fight();
    queen.setWeapon(new SwordBehaviour());
    queen.fight();
  }
}
