package model;

public class Empleado {
        private static final int SALARIO_MINIMO = 8332;
        private static final int AUXILIO_TRANSPORTE = 117172;
        private static final int ANO_ACTUAL = 2022;
        private String nombreEmpleado;
        private int numeroHoras;
        private int valoracionHora;
        private int fechaNacimiento;
        private int fechaIngreso;
        private int salarioEmpleado;

        public Empleado() {
                this.nombreEmpleado = "";
                this.numeroHoras = 0;
                this.valoracionHora = 0;
                this.fechaNacimiento = 0;
                this.fechaIngreso = 0;
        }

        public Empleado(String nombreEmpleado, int numeroHoras, int valoracionHora, int fechaNacimiento,
                        int fechaIngreso) {
                this.nombreEmpleado = nombreEmpleado;
                this.numeroHoras = numeroHoras;
                this.valoracionHora = valoracionHora;
                this.fechaNacimiento = fechaNacimiento;
                this.fechaIngreso = fechaIngreso;
        }

        public String getNombreEmpleado() {
                return nombreEmpleado;
        }

        public int getNumeroHorasMensuales() {
                return numeroHoras;
        }

        public int getValoracionHora() {
                return valoracionHora;
        }

        public int getFechaNacimiento() {
                return fechaNacimiento;
        }

        public int getFechaIngreso() {
                return fechaIngreso;
        }

        public void setNombreEmpleado(String nombreEmpleado) {
                this.nombreEmpleado = nombreEmpleado;
        }

        public void setNumeroHorasMensuales(int numeroHoras) {
                this.numeroHoras = numeroHoras;
        }

        public void setValoracionHora(int valoracionHora) {
                this.valoracionHora = valoracionHora;
        }

        public void setFechaNacimiento(int fechaNacimiento) {
                this.fechaNacimiento = fechaNacimiento;
        }

        public void setFechaIngreso(int fechaIngreso) {
                this.fechaIngreso = fechaIngreso;
        }

        public static Empleado[] crearListaEmpleados(int numeroEmpleados) {
                return new Empleado[numeroEmpleados];
        }

        public int calcularSalarioEmpleado(int numeroHoras, int valoracionHora) {
                if (valoracionHora < SALARIO_MINIMO) {
                        salarioEmpleado = (numeroHoras * valoracionHora) + AUXILIO_TRANSPORTE;
                } else {
                        salarioEmpleado = (numeroHoras * valoracionHora);
                }
                return salarioEmpleado;
        }

        public static int calcularEdadEmpleado(int fechaNacimiento) {
                return (ANO_ACTUAL - fechaNacimiento);
        }

        public static int calcularAntiguedadEmpleado(int fechaIngreso) {
                return (ANO_ACTUAL - fechaIngreso);
        }

        public String toString() {
                return "\nDATOS DEL EMPLEADO: \nNombre: " + nombreEmpleado + "\nHoras: " + numeroHoras
                                + "\nValoración: " + valoracionHora;
        }
}
