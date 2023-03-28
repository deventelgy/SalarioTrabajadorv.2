import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del empleado: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese horas trabajadas: ");
        int horas= scanner.nextInt();
        System.out.println("Ingresar valor de horas trabajadas: ");
        int valor = scanner.nextInt();
        System.out.println("Ingrese el % del descuento ley: ");
        double porcentaje = scanner.nextByte();

        double total1=horas*valor;
        System.out.println("Sr. "+name+" Su sueldo bruto sin descuento es: s/."+total1);
        double total2=total1*(porcentaje/100);
        System.out.println("La aplicación de descuento ley es : s/."+total2);
        System.out.println("Su salario mensual es: s/."+(total1-total2));

    }
}