#include <stdio.h>  // Necesario para printf y scanf

int main() {
    char nombre[50];
    int ano_nacimiento, edad;

    printf("Ingresa tu nombre: ");
    scanf("%s", nombre);

    printf("Ingresa tu año de nacimiento: ");
    scanf("%d", &ano_nacimiento);

    edad = 2025 - ano_nacimiento;
    printf("Hola %s, tienes %d años. Este programa está hecho en C.\n", nombre, edad);

    return 0;
}