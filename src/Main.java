public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int Mass = 60; //Масса в килограммах
        int Height = 160; //Рост в см

        float Bmi = service.calculate(Mass, Height);

        System.out.println("Body Mass Index is " + Bmi);
    }
}
