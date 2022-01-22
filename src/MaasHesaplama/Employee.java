package MaasHesaplama;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raise;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax() {
        if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }
    }

    public void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
    }

    public void raiseSalary() {
        if (this.hireYear < 10) {
            this.raise = this.salary * 0.05;
        } else if (this.hireYear > 9 && this.hireYear < 20) {
            this.raise = this.salary * 0.10;
        } else if (this.hireYear > 19) {
            this.raise = this.salary * 0.15;
        }
    }

    public void printEmployee() {
        System.out.println("Adı : " + this.name);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam Maaş : " + (this.salary + raise));
    }
}
