package mundo;

public class Asignatura {
    //Atributos
    private String codigo;
    private double nota1, nota2, definitiva;

    public Asignatura(String codigo, double nota1, double nota2) {
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    //permite calcular o retornar la nota definitiva de la asignatura asociada a este objeto
    public double calcularDef(){
        definitiva = (nota1 + nota2)/2.0;
        return definitiva;

    }
}
