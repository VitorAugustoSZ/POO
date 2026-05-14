package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {

        Draw draw = new Draw();
        ;
        /*
        draw.circle(400,400,100);
        draw.setPenColor(Color.RED);
        draw.filledCircle(400, 400, 50);
          */

        draw.setCanvasSize(1000,1000);
        draw.setXscale(0,1000);
        draw.setYscale(0,1000);
        draw.enableDoubleBuffering();
        /*
        for (int i = 0; i < 10; i++) {
            draw.text(500,500,"" + i);
            draw.show();
            TimeUnit.SECONDS.sleep(1);
            draw.clear();
        }

         */



        draw.line(147, 696, 243, 805);
        draw.line(791, 696, 690, 805);
        draw.line(121, 248, 791, 695);

        /*
        double[] x = {150,250,300,100};
        double[] y = {150,150,100,100};
        draw.polygon(x,y);
*/
        draw.show();



    }
}
