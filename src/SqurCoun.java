public class SqurCoun {
    public int squrX;
    public int squrY;
    public int adjasmins;
    public boolean revild;

    public SqurCoun(int x, int y, int am, boolean rev) {
        this.squrX = x;
        this.squrY = y;
        this.adjasmins = am;
        this.revild = rev;
    }

    @Override
    public String toString() {
        return "SqurCoun{" +
                "X=" + squrX +
                ", Y=" + squrY +
                ", am=" + adjasmins +
                '}';
    }
}
