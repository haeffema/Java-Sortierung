package src;

import java.text.NumberFormat;

public class TimeEnd {
    public static void timeEnd(double dauermsec) {
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);
        double dauersec = dauermsec / 1000;
        double dauermin = dauersec / 60;
        if (dauersec >= 60) {
            System.out.print("Dauer: " + n.format(dauermin));
            System.out.println("min");
            System.out.print("Dauer: " + n.format(dauersec));
            System.out.println("s");
            System.out.print("Dauer: " + dauermsec);
            System.out.println("ms");
        } else if (dauermsec >= 1000) {
            System.out.print("Dauer: " + n.format(dauersec));
            System.out.println("s");
            System.out.print("Dauer: " + dauermsec);
            System.out.println("ms");
        } else {
            System.out.print("Dauer: " + dauermsec);
            System.out.println("ms");
        }
    }
}
