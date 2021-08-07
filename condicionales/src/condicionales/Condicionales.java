package condicionales;

import java.util.Scanner;

/**
 *
 * @author William Mendoza
 */
public class Condicionales {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // int salario = 987654;
        int salario = input.nextInt();
        double saludEmpleado = salario *0.04;
        double saludEmpresa = salario*0.085;
        double saludTotal = saludEmpleado + saludEmpresa;
        double pensionEmpleado = salario *0.04;
        double pensionEmpresa = salario * 0.12;
        double pensionTotal = pensionEmpleado + pensionEmpresa;
        double SalarioTotalEmpleado = salario - (saludEmpleado + pensionEmpleado);
        double SalarioTotalEmpresa = salario + (saludEmpresa+ pensionEmpresa);
        System.out.println("Total salario a Recibir empleado: "+ SalarioTotalEmpleado);
        System.out.println("Total salario a pagar empresa: "+ SalarioTotalEmpresa);       
    }    
}
