package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Wrong month number");
            return;
        }

        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
            case 12:
                System.out.println("Winter");
                break;
        }

    }
}
