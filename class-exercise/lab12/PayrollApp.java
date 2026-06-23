package lab12;

interface Payable {
    double calculatePayment();
}

class Employee implements Payable {
    String name;
    double hourlyRate;
    int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s %d hrs @ $%.1f -> $%.2f",
                name, hoursWorked, hourlyRate, calculatePayment());
    }
}

class Invoice implements Payable {
    String item;
    double unitPrice;
    int quantity;

    public Invoice(String item, double unitPrice, int quantity) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double calculatePayment() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return String.format("Invoice: %d %s @ $%.1f -> $%.2f",
                quantity, item, unitPrice, calculatePayment());
    }
}

// PayrollApp类修正
public class PayrollApp {
    public static void main(String[] args) {
        Payable[] payroll = new Payable[2]; // 保留原数组定义
        payroll[0] = new Employee("Alice", 25.6, 40);
        payroll[1] = new Invoice("Laptop", 800.0, 3);

        // 循环变量名改为payroll（和数组名一致）
        for (Payable p : payroll) {
            System.out.println(p);
        }
    }
}