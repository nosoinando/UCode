import java.util.Scanner;

public class PersonaEjecutable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String name = sc.next();

        System.out.println("Introduzca su edad: ");
        int age = sc.nextInt();

        System.out.println("Introduzca su sexo ('H' si es hombre, 'M' si es mujer): ");
        char genr = sc.next().charAt(0);

        System.out.println("Introduzca su peso en kilogramos (con comas): ");
        double weight = sc.nextDouble();

        System.out.println("Introduzca su altura en metros (con comas):");
        double height = sc.nextDouble();

        System.out.println(
            "Nuevo Usuario: {Nombre: " + name + ", Edad: " + age + ", Sexo: " + genr + ", Peso: " + weight + ", Altura: " + height + "}"
        );

        Persona persona1 = new Persona(name, age, 0, genr, weight, height);

        Persona persona2 = new Persona(name, age, 0, genr, 0.0, 0.0);

        Persona persona3 = new Persona();
        persona3.setNombre(name);
        persona3.setEdad(age);
        persona3.setSexo(genr);
        persona3.setPeso(weight);
        persona3.setAltura(height);
        String imc = " "; 
        
        if(
            persona1.calcularIMC() == -1 ||
            persona2.calcularIMC() == -1 ||
            persona3.calcularIMC() == -1
            )
        {
            imc = "Debajo de su peso ideal";
        }
        else if(
            persona1.calcularIMC() == 0 ||
            persona2.calcularIMC() == 0 ||
            persona3.calcularIMC() == 0
        ){
            imc = "Peso ideal";
        }
        else{
            imc = "Sobrepeso";
        }

        System.out.println("De acuerdo a su indice de masa corporal usted se encuentra en: " + imc);
        
        if(
            persona1.esMayorDeEdad() ||
            persona2.esMayorDeEdad() ||
            persona3.esMayorDeEdad()
            )
        {
            System.out.println("El usuario es mayor de edad");
        }
        else{
            System.out.println("El usuario no es mayor de edad");
        }
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
