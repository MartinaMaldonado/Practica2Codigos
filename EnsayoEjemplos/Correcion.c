#include <stdio.h>
enum semana_laboral {LUNES=1, MARTES=2, MIERCOLES=3, JUEVES=4, VIERNES=5};
int main() { //main para que corra el programa
    int dia = 1; //el punto y coma hacia falta
    printf("Ingrese un dia de la semana (1-5): "); //printf para que el usuario escriba
    scanf("%d", &dia); //las comillas no eran las adecuadas

    for (int i = LUNES; i <= VIERNES; i++) { // <= para incluir VIERNES
        printf("El dia de la semana es: %d\n", i);

        if ((i % 2) == 0) {//se requieren dias pares no impares (!=)
            printf("Hoy es un gran dia para Teoria de la Programacion\n"); //es inecesario el "dia" aqui
        }

        if (dia == i) {
            break;
        }
    }
    return 0;
}
