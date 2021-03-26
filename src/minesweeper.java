public class minesweeper {

    public static void main(String[] args) {
        int totmin, TsqrX, TsqrY;

        totmin = 5; TsqrX = 15; TsqrY = 10;
       // int i
        SqurMin[] minnam = new SqurMin[totmin];
        for (int i=0; i<=totmin; i++) {
            //int num = 0;
            //String minnam = ("min" + num);
            minnam[i] = new SqurMin((int)(Math.random()*TsqrX),(int)(Math.random()*TsqrY));

        }
        SqurMin min1 = new SqurMin(30,20);
        SqurCoun coun1 = new SqurCoun(20,30,0);
    }
}
