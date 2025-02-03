import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtrl = new EmpleadoContoller();

        boolean result = empCtrl.addEmpleados(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso: "+result);

        result = empCtrl.addEmpleados(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso: "+result);

        empCtrl.addEmpleados(new Empleado(1, "Pablo", "Senior"));
        empCtrl.addEmpleados(new Empleado(2, "Juan", "Senior"));
        empCtrl.addEmpleados(new Empleado(3, "Andres", "Senior"));

        empCtrl.displayEmpleados();
        System.out.println("Solo imprime la clave y los nombres");
        empCtrl.displayEmpleadosSoloNombre();
        empCtrl.displayLLaves();
        empCtrl.displayEmpleadosValue();
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        Ejercicios ejer = new Ejercicios();

        System.out.println("----- Sumatoria de Dos -----");
        int[] resultado1 = ejer.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        System.out.println(resultado1 != null ? "[" + resultado1[0] + ", " + resultado1[1] + "]" : "null");

        int[] resultado2 = ejer.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        System.out.println(resultado2 != null ? "[" + resultado2[0] + ", " + resultado2[1] + "]" : "null");
        
        System.out.println("----- Anagramas -----");
        System.out.println(Ejercicios.areAnagrams("listen", "silent"));
        System.out.println(Ejercicios.areAnagrams("hello", "bello"));
        System.out.println(Ejercicios.areAnagrams("triangle", "integral"));
    }
}
