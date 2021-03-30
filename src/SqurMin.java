public class SqurMin {
    public int minxcor;
    public int minycor;
    public boolean flagd;

    public SqurMin(int x, int y, boolean flag) {
        this.minxcor = x;
        this.minycor = y;
        this.flagd = flag;
    }

    @Override
    public String toString() {
        return "SqurMin{" +
                "mxc=" + minxcor +
                ", myc=" + minycor +
                '}';
    }
}
