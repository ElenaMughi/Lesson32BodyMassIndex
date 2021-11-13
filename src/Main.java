public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int mass = 60; //Масса в килограммах
        int height = 160; //Рост в см

        float bmi = service.calculate(mass, height);

        System.out.println("Body Mass Index is " + bmi);
    }
}
