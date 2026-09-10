class Alumno{
    private String codigo; 
    private String nombre;
    int ciclo_relativo; 
    int estado;
    double promedio; 
    int turno; 
    int cantCreditos; // Depende del promedio 
    
    public Alumno(String codigo, String nombre, int ciclo_relativo, int estado, double promedio, int turno, int cantCreditos){
        this.codigo = codigo; 
        this.nombre = nombre; 
        this.ciclo_relativo = ciclo_relativo;
        this.estado = estado; 
        this.promedio = promedio; 
        this.turno = turno; 
        this.cantCreditos = cantCreditos; 
    }

    
}

class Curso {
    private String codigo; 
    private String nombre; 
    private String nombreDocente; 
    public Curso(String codigo, String nombre, String nombreDocente){
        this.codigo = codigo; 
        this.nombre = nombre; 
        this.nombreDocente = nombreDocente; 
    }  
    int vacantes; 
    char preRequsitos; 

}

class Matricula {
    String codMatricula, codigo, nombre; // SW-505 <- String.
    Alumno alumno; 
    Curso cursos[]; 



    public static void main(String[] args) {
        
    }

}
