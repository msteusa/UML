public class Estudiante {
    String nombre;
    Curso curso;

    public Estudiante(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public void mostrarCurso() {
        System.out.println(nombre + " está en el curso " + curso.nombre);
    }
}
