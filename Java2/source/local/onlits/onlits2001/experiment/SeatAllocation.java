package local.onlits.onlits2001.experiment;

import java.util.Random;

public class SeatAllocation {
    void allocateSeat(int no_students, int no_seats) {
        Random random = new Random();
        for(int i=1; i<=no_students; i++) {
            System.out.printf("%3d%10d\n", i, random.nextInt(no_seats));
        }
    }

    public static void main(String[] args) {
        new SeatAllocation().allocateSeat(60, 60);
    }
}