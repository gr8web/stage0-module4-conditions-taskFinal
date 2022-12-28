package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean validFirst = thirdSide + secondSide > firstSide;
        boolean validSecond = firstSide + secondSide > thirdSide;
        boolean validThird = firstSide + thirdSide > secondSide;

        if (validFirst && validSecond && validThird) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
