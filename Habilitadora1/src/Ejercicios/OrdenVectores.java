package Ejercicios;

public class OrdenVectores{
    int vector[];
    for (int i=1; i < vector.length; i++) {
        int aux = vector[i];
        int j;
        for (j=i-1; j > =0 && vector[j] > aux; j--){
            vector[j+1] = vector[j];
        }
        vector[j+1] = aux;
    }
}
/*
