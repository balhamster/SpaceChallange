/**
 * @author Balazs_Hamori
 */
public class Rocket implements SpaceShip{

    private int cost;
    private int weight;
    private int maxWeight;
    private int chanceOfLaunchExplosion;
    private int chanceOfLandingCrash;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return (maxWeight - weight - item.getWeight()) >= 0;
    }

    @Override
    public void carry(Item item) {
        if (canCarry(item)) {
            this.weight += item.getWeight();
        }
        else{
            System.out.println("Cannot carry item!");
        }
    }
}
