public class BmiService {

    public float calculate(int Mass, int Height) {
        int K = Height*Height;
        float M = Mass * 10000_00 / K;
        float  Bmi = M / 100;
        return Bmi;
    }

}
