public class BmiService {

    public float calculate(int mass, int height) {
        int k = height*height;
        float m = mass * 10000_00 / k;
        float  bmi = m / 100;
        return bmi;
    }

}

