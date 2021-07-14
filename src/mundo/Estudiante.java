package mundo;

/* Aplicación para manejar la información de un estudiante. un estudiante tiene un codigo
un nombre, un sexo, dos asignaturas registradas(cada una de ellas con código y dos notas parciales)
Se debe permitir: Calcular la nota definitiva de cada asignatura si se hace a traves de un promedio ponderado.
Calcular la nota promedio del semestre, es decir la nota que surge al promediar la nota definitiva de la asignatura 1
con la asignatura 2*/

import javax.swing.*;

public class Estudiante {
    //Atributos
    private String codigo, nombre;
    private boolean sexo;

    //objetos tipo asignatura
    private Asignatura miAsignatura1, miAsignatura2;


    public Estudiante(String codigo, String nombre, boolean sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    //metodos:
    // se ingresar los objetos de Asignatura por que solo se debe tener dos Asignaturas

    public void ingresarAsignatura1(){
        //atributos de Asignatura

        String codigo;
        double nota1, nota2;
        codigo = JOptionPane.showInputDialog("Ingrese el codigo de la asignatura: ");
        //ingresar una nota es cadena pero se debe tratar como double
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota del primer parcial: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota del segundo parcial: "));

miAsignatura1 = new Asignatura(codigo, nota1, nota2);

    }

    public void ingresarAsignatura2(){
        //atributos de Asignatura
        String codigo;
        double nota1, nota2;
        codigo = JOptionPane.showInputDialog("Ingrese el código de la asignatura: ");
        //ingresar una nota es cadena pero se debe tratar como double
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota del primer parcial: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota del segundo parcial: "));

miAsignatura2 = new Asignatura(codigo, nota1, nota2);

    }
public void verNotas(){
        JOptionPane.showMessageDialog(null, "su nota de la asignatura 1 es: " + miAsignatura1.calcularDef());
        JOptionPane.showMessageDialog(null, "su nota de la asignatura 2 es: " + miAsignatura2.calcularDef());

    }
    // permite calcular not promedio
    public double calcularNotaPromedio(){
        return (miAsignatura1.getDefinitiva() + miAsignatura2.getDefinitiva())/2.0;
    }

    public static void main(String[] args) {
        Estudiante E1;
        String nombre, codigo, sex;
        boolean sexo;
        nombre = JOptionPane.showInputDialog("Nombre del estudiante: ");
        codigo = JOptionPane.showInputDialog("Codigo del estudiante: ");
        sex = JOptionPane.showInputDialog("Sexo: (F)eminino - (M)asculino:");

        if(sex.equalsIgnoreCase("F")==true){
            sexo =true;
        }
        else{
            sexo =false;
        }
        E1 = new Estudiante(codigo,nombre,sexo);
        E1.ingresarAsignatura1();
        E1.ingresarAsignatura2();
        E1.verNotas();
        JOptionPane.showMessageDialog(null,"Su promedio general es: "+ E1.calcularNotaPromedio());

    }
}

