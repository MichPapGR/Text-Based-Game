package textbasedgame;

/**
 *
 * @author Μιχαηλ
 */
public class Weapon extends Item {
    private int dmg;
    
    public Weapon(String name, String description,int dmg) {
        super(name, description);
        this.dmg=dmg;
    }

    public int getDmg() {
        return dmg;
    } 
}
