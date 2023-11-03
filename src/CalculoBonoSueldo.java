import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CalculoBonoSueldo {
    private String [][] haberes = {
            {"100", "Presentismo", "9"},
            {"101", "Titulo Profesional", "9"},
            {"102", "Horas Extraordinarias", "M"},
            {"103", "Horas Nocturnas", "M"},
            {"104", "Otros Haberes", "M"},
    };

    private String [][] deducciones = {
            {"200", "Obra Social", "3"},
            {"201", "Jubilacion", "11"},
            {"202", "Sindicato", "2"},
            {"203", "Seguro", "1.5"},
            {"204", "Otros", "M"},
    };

    private List<Integer> codigosIngresados;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();

        System.out.println("Ingrese el nombre completo del empleado: ");
        String nombreEmpleado = sc.next();
        empleado.setNombreEmpleado(nombreEmpleado);

        System.out.println("Ingrese el cuil del empleado: ");
        long cuilEmpleado = sc.nextLong();
        empleado.setCuil(cuilEmpleado);

        System.out.println("Ingrese el año de ingreso del empleado: ");
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int anioIngresoEmpleado;
        do {
            System.out.println("Año de ingreso (no debe superar el año actual - "+ anioActual +"): ");
            anioIngresoEmpleado = Integer.parseInt(sc.next());
        } while (anioIngresoEmpleado > anioActual);


        System.out.println("Ingrese el mes de liquidacion: ");
        int mesLiquidacion = sc.nextInt();


        int anioLiquidacion;
        do {
            System.out.println("Año de liquidacion (no debe superar el año actual - "+ anioActual +"): ");
            anioLiquidacion = sc.nextInt();
        }while (anioLiquidacion > anioActual);

        System.out.println("Ingrese el sueldo básico: ");
        double sueldoBasico = sc.nextDouble();
        empleado.setSueldoBasico(sueldoBasico);

        int aniguedad = anioActual - anioIngresoEmpleado;
        double montoAntiguedad = 0.2 * aniguedad * anioIngresoEmpleado;
        empleado.setMontoAntiguedad(montoAntiguedad);

        BonoSueldo bonoSueldo = new BonoSueldo();
        String [][] bonoCalculado = new String [10][4];
    }
}
