package MaasHesaplama;

public class Main {
    public static void main(String[] args) {

        Employee worker = new Employee("Kemal", 2000, 45, 1985);
        worker.tax();
        worker.bonus();
        worker.raiseSalary();
        worker.printEmployee();


    }
}
