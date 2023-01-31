using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcules
{
    public class Calcule
    {
        public double num1;
        public double num2;
        public double resultado;

        public Calcule(double nu1, double nu2)
        {
            num1 = nu1;
            num2 = nu2;
        }

        public void setNum(double numero1, double numero2)
        {
            numero1 = num1;
            numero2 = num2;
        }
        public double getSumar()
        {
            resultado = num1 + num2;
            return resultado;
        }

        public double getResta()
        {
            resultado = num1 - num2;
            return resultado;
        }

        public double getMulti()
        {
            resultado = num1 * num2;
            return resultado;
        }

        public double getDivi()
        {
            resultado = num1 / num2;
            return resultado;
        }

        public double getPoten()
        {
            resultado = Math.Pow(num1, num2);
            return resultado;
        }

        public double getSqr()
        {
            resultado = Math.Sqrt(num1);
            return resultado;
        }
    }
}