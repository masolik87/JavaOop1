public abstract class Archer extends Man{

    int shots, maxShots;
    float dist;
    String name;

    public Archer(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist) {
        super(hp, maxHp, damage, att, def);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    public float getDist() {return dist;}
}