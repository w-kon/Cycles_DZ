import ru.netology.services.SalaryCalculation;

public class Main {

    public static void main(String[] args) {
        SalaryCalculation service = new SalaryCalculation();

        int months = service.calculate(100_000, 60_000, 150_000);
        System.out.print(months);

    }
}