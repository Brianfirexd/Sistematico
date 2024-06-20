public class Trabajador {

    private int IDtrabajador;
    private String nombre;
    private String Cargo;
    private Double Salario;
    public int CodTra;


    // CONSTRUCTOR // SE USA THIS DESPUES DEL CONSTRUCTOR //
    public Trabajador(int IDtrabajador, String nombre, String Cargo, Double salario) {
        this.IDtrabajador = IDtrabajador;
        this.nombre = nombre;
        this.Cargo = Cargo;
        this.Salario = salario;
    }

    public int getIDtrabajador(){
        return IDtrabajador;
    }
    public void setIDtrabajador(){
        this.IDtrabajador = IDtrabajador;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getCargo(){
        return Cargo;
    }
    public void setCargo(){
        this.Cargo = Cargo;
    }
    public Double getSalario(){
        return Salario;
    }
    public void setSalario(){
        this.Salario = Salario;
    }

}
