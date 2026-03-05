class Departamento {
    Profesor profesor;

    public Departamento(Profesor profesor) {
        this.profesor = profesor;

    }

    public void mostrarprofesor() {
        System.out.Println("Profesor: " + profesor.nombre);
    }
}