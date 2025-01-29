package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer,Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    /**
     * Ingresado el empleado donde la clave sea la id del
     * Empleado
     *@param  Empleado ingresado al mapa
     *@return False si no ingreso porque ya existe
     *        True si ingreso correctamente
     */
    public boolean addEmpleados(Empleado empleado){

        if(empleados.containsKey(empleado.getId())){
            return false;
        }

        empleados.put(empleado.getId(), empleado);
        return true;
    }

    /**
     * Busca un empleado segun su id
     *@param  int id del empleado a buscar
     *@return Empleado segun la id
     */
    public Empleado getEmpleadoById(int id){
        return empleados.get(id);
    }

    public void displayEmpleados(){
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry);
            //System.out.println(empleadoEntry.getKey() + "  -  " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombre(){
        for(Map.Entry<Integer, Empleado> empleaEntry : empleados.entrySet()){
            System.out.println(empleaEntry.getKey() + "  -  " + empleaEntry.getValue().getName());
        }
    }

    //Sin usar entrySet
    public void displayLLaves(){
        System.out.println("----- Imprime solo Llaves -----");
        for(Integer empleadokey : empleados.keySet()){
            System.out.println(empleadokey);
        }
    }
    public void displayEmpleadosValue(){
        System.out.println("----- Imprime solo los Empleados ----");
        for(Empleado valor : empleados.values()){
            System.out.println(valor);
        }
    }
}