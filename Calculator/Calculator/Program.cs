using Calculator;

public class Program
{
    public static void Main(string[] args)
    {
        while (true)
        {
            Console.WriteLine("Escriba de que manera quiere operar estos valores, escoja 1 para suma, 2 para multiplicación, 3 para división, 4 para resta, 5 para potencia, 6 para sacar la raíz cuadrada del primer número y 7 para salir.");
            var opc = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine(" ");

            if (opc == 1)
            {
                Console.Write("Ingrese el número 1: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");
                Console.Write("Ingrese el numero 2: ");
                double num2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");

                var obj = new Calculadora(num1, num2);

                obj.setNum(num1, num2);

                double suma = obj.getSumar();

                Console.WriteLine($"El resultado de la suma {num1} + {num2} es: {suma}");
                Console.WriteLine(" ");
            }
            else if (opc == 2)
            {
                Console.Write("Ingrese el número 1: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");
                Console.Write("Ingrese el numero 2: ");
                double num2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");

                var obj = new Calculadora(num1, num2);

                obj.setNum(num1, num2);

                double multiplicacion = obj.getMulti();

                Console.WriteLine($"El resultado de la multiplicación {num1} x {num2} es: {multiplicacion}");
                Console.WriteLine(" ");
            }
            else if (opc == 3)
            {
                Console.Write("Ingrese el número 1: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");
                Console.Write("Ingrese el numero 2: ");
                double num2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");

                var obj = new Calculadora(num1, num2);

                obj.setNum(num1, num2);

                double division = obj.getDivi();

                Console.WriteLine($"El resultado de la división {num1} / {num2} es: {division}");
                Console.WriteLine(" ");
            }
            else if (opc == 4)
            {
                Console.Write("Ingrese el número 1: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");
                Console.Write("Ingrese el numero 2: ");
                double num2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");

                var obj = new Calculadora(num1, num2);

                obj.setNum(num1, num2);

                double resta = obj.getResta();

                Console.WriteLine($"El resultado de la resta {num1} - {num2} es: {resta}");
                Console.WriteLine(" ");
            }
            else if (opc == 5)
            {
                Console.Write("Ingrese el número 1: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");
                Console.Write("Ingrese el numero 2: ");
                double num2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");

                var obj = new Calculadora(num1, num2);

                obj.setNum(num1, num2);

                double potencia = obj.getPoten();

                Console.WriteLine($"El resultado de la potencia {num1} ^ {num2} es: {potencia}");
                Console.WriteLine(" ");
            }
            else if (opc == 6)
            {
                Console.Write("Ingrese el número 1: ");
                double num1 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");
                Console.Write("Ingrese el numero 2: ");
                double num2 = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine(" ");

                var obj = new Calculadora(num1, num2);

                obj.setNum(num1, num2);

                double raiz = obj.getSqr();

                Console.WriteLine($"La raíz cuadrada de {num1} es: {raiz}");
                Console.WriteLine(" ");
            }
            else if (opc == 7)
            {
                Console.WriteLine("¡Hasta luego!");
                Console.WriteLine(" ");
                break;
            }
            else
            {
                Console.WriteLine("Porfavor digite un número válido.");
                Console.WriteLine(" ");
            }
        }  
    }
}