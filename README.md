[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/F4zkDqTW)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=21098170&assignment_repo_type=AssignmentRepo)
# Práctica 1.11: Elementos de desarrollo

---
# Título de la Actividad

## Identificación de la Actividad
- **ID de la Actividad:** 1.11
- **Módulo:** EDES
- **Unidad de Trabajo:** 1- Elementos de Desarrollo
- **Fecha de Creación:** 16/10/2025
- **Fecha de Entrega:** 16/10/2025
- **Alumno:** 
  - **Nombre y Apellidos:** Fabio Mauricio Tello López
  - **Correo electrónico:** ftellop678@g.educaand.es
  - **Iniciales del Alumno/Grupo:** T.L.F

## Descripción de la Actividad
En esta práctica, el objetivo es entender cómo el software interactúa con el hardware, así como aprender a diferenciar entre distintos tipos de lenguajes de programación y sus formas de ejecución.
Para lograrlo, trabajaremos con tres lenguajes distintos:
Python, C y Java. 

Cada programa que desarrollaremos hará lo siguiente: pedirá al usuario su nombre y año de nacimiento, calculará su edad y mostrará un mensaje final indicando el nombre, la edad y el lenguaje usado.

## Instrucciones de Compilación y Ejecución
1.  **Requisitos Previos:**

-Python  
   
-C 
   
-Java 

2.  **Pasos para Compilar y ejecutar el Código:**
   
```
   python src/main.py
   gcc src/main.c
   javac src/main.java
```

3.  **Ejecución de Pruebas:**

 
   Como es una práctica básica, se realizaron pruebas manuales con nombre y año de nacimiento, comprobando que la salida fue correcta en todos los casos.
  

## Criterios de evaluación
### 1.a: Relación entre Software y Hardware
Durante la ejecución de los programas, los datos ingresados por el usuario se almacenan en memoria RAM y el procesador ejecuta las instrucciones correspondientes. En Python, el intérprete traduce y ejecuta el código línea por línea; en C, el ejecutable se ejecuta directamente como código máquina; y en Java, la JVM interpreta el bytecode y genera las instrucciones que el procesador ejecuta. La salida en todos los casos se muestra en la pantalla, interactuando con este periférico.
### 1.c: Diferenciación entre Código Fuente, Código Objeto y Ejecutable
El código fuente de C se transforma primero en un archivo objeto y luego en un ejecutable que el sistema operativo puede correr directamente. Python se ejecuta directamente desde el código fuente, sin generar ejecutables ni archivos objeto. Java se compila a bytecode, que no es ejecutable por el sistema operativo directamente, sino que se ejecuta a través de la máquina virtual.
### 1.d: Generación de Código Intermedio para Máquinas Virtuales
El código Java se transforma en bytecode mediante el compilador, que luego es interpretado por la JVM para generar instrucciones de máquina para el procesador. Esto permite portabilidad entre sistemas operativos y difiere de la ejecución directa de C o de la interpretación línea por línea de Python.
### 1.e: Clasificación de Lenguajes de Programación
Los tres lenguajes se clasifican de la siguiente manera:

   -Modo de ejecución: Python es interpretado, C es compilado, y Java se ejecuta en máquina virtual.

   -Nivel de abstracción: Python y Java son de alto nivel, C es de nivel medio.

   -Paradigma de programación: Python es multiparadigma, C es imperativo y Java es orientado a objetos.
   Estas características influyen en la elección del lenguaje según facilidad de desarrollo, rendimiento y portabilidad.
### 1.f: Evaluación de Herramientas Utilizadas en el Desarrollo
Durante el desarrollo se utilizó Windows 11 como sistema operativo y PyCharm como IDE para los tres lenguajes. Python se ejecutó con su intérprete, C se compiló con GCC, y Java se compiló con JDK y se ejecutó en la JVM. Se utilizó el depurador de PyCharm para encontrar errores, y Git para controlar versiones del código. Además, se empleó la terminal integrada de PyCharm para compilar, ejecutar y verificar los programas.
## Conclusiones
Al realizar esta práctica, pude ver cómo cada lenguaje funciona de manera distinta: Python es rápido de desarrollar, C es muy eficiente al ejecutar, y Java combina portabilidad y seguridad gracias a la máquina virtual. La experiencia me ayudó a comprender mejor la relación entre software y hardware, así como las diferencias entre interpretar, compilar y ejecutar en una JVM.