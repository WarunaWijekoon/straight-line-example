import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;

void main() throws InterruptedException {
    returnLongestStraightLine(new int[]{-1, -1}, new int[]{-1, 2}, new int[]{3, 5}, new int[]{4, 4}, new int[]{6,6});

    System.out.println("==========================================================================================");

}

void returnLongestStraightLine(int[]... coordinatePairs) throws InterruptedException {
    int x1 = 0, y1 = 0;
    int x2 = 0, y2 = 0;
    int mx1 = 0, my1 = 0, mx2 = 0, my2 = 0;
    int[][] arr = new int[0][];
    int sum = 0;
    int line = 0;

    double equalGradient = 0;
    double allGradient = 0;
    double equalGradient1 = 0;
    double equalGradient2 = 0;
    System.out.println("================= MAXIMUM STRAIGHT LINE =================");
    System.out.println("=========================================================");
    System.out.println(String.format("\033[45m|  %1$5s   |%2$5s     | %3$5s| %4$10s   |\033[40m","point1","point2","length(sqr)","gradient"));
    System.out.println("---------------------------------------------------------");
    for (int i = 0; i < coordinatePairs.length; i++) {
        for (int j = i+1; j < coordinatePairs.length ; j++) {


            x1 = coordinatePairs[i][0];
            y1 = coordinatePairs[i][1];
            x2 = coordinatePairs[j][0];
            y2 = coordinatePairs[j][1];

            allGradient = gradient(x1, y1, x2, y2);
            line = lineLength(x1, y1, x2, y2);
            Thread.sleep(300);

           System.out.println(String.format("| (%1$3d,%2$3d) | (%3$3d,%4$3d) | %5$5d      | %6$10f |  ",x1,y1,x2,y2,line,allGradient));
            if (line > sum) {
                sum = line;
                mx1 = x1;
                my1 = y1;
                mx2 = x2;
                my2 = y2;
            } else {
                line = sum;
                x1 = mx1;
                y1 = my1;
                x2 = mx2;
                y2 = my2;
            }
            x1 = coordinatePairs[i][0];
            y1 = coordinatePairs[i][1];
            x2 = coordinatePairs[j][0];
            y2 = coordinatePairs[j][1];
            equalGradient1 = gradient(mx1, my1, x1, y1);

            equalGradient2 = gradient(mx1, my1, x2, y2);

        }

    }
    System.out.println("=======================================================");
    System.out.println();

    System.out.println(STR."(\{mx1},\{my1})(\{mx2},\{my2})  maximum length  : \033[44m\033[30m      \{sum}   \033[40m\033[32m");
    System.out.println();
    if (allGradient == equalGradient1 || allGradient == equalGradient2) {
       System.out.println(STR."points on maximum length line : \033[46m\033[30m(\{x1},\{y1}),(\{x2},\{y2})\033[40m");

    }
}
int lineLength(int x1,int y1,int x2,int y2){
    return ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
}
double gradient(int x1,int y1,int x2,int y2){

    int yPoints =(y2-y1);
    int xPoints=(x2-x1);
    double lineGradient=0;
    lineGradient= (double) yPoints /xPoints;
if(xPoints==0  ){lineGradient=1001;}
if (yPoints==0){lineGradient=0;}
else lineGradient = (double) yPoints /xPoints;
return  lineGradient;
}

