package Ejercicios;

public class Fibonacci {
        public int n1 = 0;
        public int n2 = 1;
        public int auxi = 10;
        public int respuesta;

    public Fibonacci(int num1, int num2){
        this.n1 = n1;
        this.n2 = n2;

        System.out.print("Primero " + auxi + "Terminar: ");

        for (int i = 1; i<= auxi; ++i) {
            System.out.print(n1 + "+");
            int suma = n1 + n2;
            n1 = n2;
            n2 = suma;
            respuesta = suma;
        }
    }
    public void setRespuesta(int respuesta){this.respuesta = respuesta;}

    public int getRespuesta(){return this.respuesta;}
}


