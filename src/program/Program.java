package program;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.WorkerLevel;
import entitites.Department;
import entitites.HourContract;
import entitites.Worker;
import java.util.Date;


public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do departamento: ");
        String departmentName = sc.nextLine();
        System.out.println("Digite os dados: ");
        System.out.println("Nome: ");
        String workerName = sc.nextLine();
        System.out.println("Level (JUNIOR/MID_LEVEL/SENIOR):");
        String workerLevel = sc.nextLine();
        System.out.println("Salário base: (EX: 1800.00)");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("Quantos contratos você desejar adicionar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o contrato #" + (i + 1));
            System.out.print("Data do contrato (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: (EX: 50.00) ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração do contrato em horas: (EX: 10) ");
            int horas = sc.nextInt();
            HourContract contrato = new HourContract(dataContrato, valorPorHora, horas);
            worker.addContract(contrato);
        }

        System.out.print("Digite o mes e ano para calcular o salário (MM/YYYY): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Salário em " + mesAno + ": " + String.format("%.2f", worker.income(ano, mes)));


        sc.close();
    }
}
