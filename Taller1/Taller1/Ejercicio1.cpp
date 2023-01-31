#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {

	cout << "Taller No.1" << endl;
	cout << " Andres David Hernandez Munoz" << endl;
	cout << " Ingenieria de Software 12B" << endl << endl;

	//Ejercicio 1
	printf(" Ejercicio 1 \n \n");
	printf("   Crear un array de 10 posiciones, con valores puestos por defecto e imprimir el array. Solucion = \n \n");
	int a[] = { 10,4,8,2,5,3,7,6,1,9 };
	float lenght = sizeof a / sizeof a[0];
	cout << "    Los datos dentro del arreglo son: " << endl << endl;
	for (int i = 0; i < lenght; i++) {
		cout << "     ";
		cout << a[i] << endl;
	}
	cout << "" << endl;

	//Ejercicio 5 sin sort
	printf(" Ejercicio 5 (antes del sort)\n \n");
	printf("   Dado un array de numeros, mostrar el mayor y el menor. Solucion = \n \n");
	int menor = a[0];
	int mayor = a[0];
	for (int i = 0; i < lenght; i++) {
		if (a[i] < menor) {
			menor = a[i];
		}
		if (a[i] > mayor) {
			mayor = a[i];
		}
	}
	cout << "    Mayor: ";
	cout << mayor << endl << endl;
	cout << "    Menor: ";
	cout << menor << endl << endl;

	//Ejercicio 2
	printf(" Ejercicio 2 \n \n");
	printf("   Sumar los valores de un array y mostrar el resultado. Solucion = \n \n");
	int sum = 0;
	for (int i = 0; i < lenght; i++) {
		sum += a[i];
	}
	cout << "    El resultado de la suma de los valores dentro del arreglo es: ";
	cout << sum << endl << endl;

	//Ejercicio 3
	printf(" Ejercicio 3 \n \n");
	printf("   Hacer la media de los valores de un array y mostrar el resultado. Solucion = \n \n");
	float media = sum / lenght;
	cout << "    La media de los valores dentro del arreglo es: ";
	cout << media << endl << endl;

	//Ejercicio 4
	printf(" Ejercicio 4 \n \n");
	printf("   Dado un array de numeros con el metodo Sort, ordenarlos y mostrar su contenido. Solucion = \n \n");
	int lenghtInteger = sizeof a / sizeof a[0];
	sort(a, a + lenghtInteger);
	cout << "    Asi queda despues de ejecutar el sort: " << endl << endl;
	for (int i = 0; i < lenght; i++) {
		cout << "     ";
		cout << a[i] << endl;
	}
	cout << "" << endl;

	//Ejercicio 5
	printf(" Ejercicio 5 (despues del sort) \n \n");
	printf("   Dado un array de numeros, mostrar el mayor y el menor. Solucion = \n \n");
	//Despues de ejecutar el sort hallar el valor del dígito menor y mayor del arreglo es sencillo
	cout << "    Menor: ";
	cout << a[0] << endl << endl;
	cout << "    Mayor: ";
	cout << a[9] << endl << endl;
	//Sin embargo si se quiere ver el mismo procedimiento sin el sort debe dirigirse después del ejercicio 1

	//Ejercicio 6
	printf(" Ejercicio 6 \n \n");
	printf("   Crear un arreglo multidimensional de 3x3. Solucion = \n \n");

	int multi[3][3] = { { 1,0,0 }, { 0,1,0 } , { 0,0,1 } };
	for (int f = 0; f < 3; f++) {
		cout << "    ";
		for (int c = 0; c < 3; c++) {
			cout << multi[f][c]<<" ";
		}
		cout << endl;
	}

}	