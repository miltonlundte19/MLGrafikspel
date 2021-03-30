import java.util.Arrays;

public class minesweeper {

    public static void main(String[] args) {
        int totmin, TsqrX, TsqrY;

        totmin = 5; TsqrX = 15; TsqrY = 10;
        SqurMin[] minnam = new SqurMin[totmin];
        for (int i=0; i<totmin; i++) {
            minnam[i] = new SqurMin((int)(Math.random()*TsqrX),(int)(Math.random()*TsqrY),false);
        }

        Object[] rutor = new Object[(TsqrX*TsqrY)];
        System.out.println("t");
        int l,k;
        int o = 0;
        System.out.print(o);
        for (l=0; l<TsqrY; l++) {
            System.out.print(o);
            for (k=0;k<TsqrX;k++) {
                System.out.print(o);
                int z = (l*TsqrY)+k;
                o = 0;
                System.out.println(o);
                for (o=0; o<totmin; o = o + 1); {
                    System.out.print(totmin);
                    System.out.print(o);
                    if (minnam[o-5].minycor==l && minnam[o-5].minxcor==k){
                        rutor[z] = new SqurMin(minnam[o-5].minxcor,minnam[o-5].minycor,false);
                        System.out.print(o);
                    }
                    System.out.print(o);
                }
                System.out.print(o);
                if (rutor[z]==null){
                    rutor[z] = new SqurCoun(k,l,0,false);
                }
            }
        }

        Arrays.toString(rutor);

        SqurMin min1 = new SqurMin(30,20,false);
        SqurCoun coun1 = new SqurCoun(20,30,0, false);
    }
}
