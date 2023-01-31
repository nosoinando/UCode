using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;
using Calcules;

namespace Calculadora
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public void operation()
        {
            double numero1 = Convert.ToDouble(textBox1.Text);
            double numero2 = Convert.ToDouble(textBox2.Text);

            var obj = new Calcule(numero1,numero2);
            obj.setNum(numero1,numero2);

            if(selectOp.Text == "Suma")
            {
                double suma = obj.getSumar();
                printResult(suma);
            }
            else if (selectOp.Text == "Resta")
            {
                double resta = obj.getResta();
                printResult(resta);
            }
            else if(selectOp.Text == "Multiplicación")
            {
                double multi = obj.getMulti();
                printResult(multi);
            }
            else if (selectOp.Text == "División")
            {
                double divi = obj.getDivi();
                printResult(divi);
            }
            else if (selectOp.Text == "Potencia")
            {
                double pot = obj.getPoten();
                printResult(pot);
            }
            else if (selectOp.Text == "Raíz")
            {
                double sqr = obj.getSqr();
                printResult(sqr);
            }
            
        }
        public void printResult(double result)
        {
            textBox3.Text = result.ToString();
        }

        public void resetForm()
        {
            selectOp.ResetText();
            textBox1.Text = " ";
            textBox2.Text = " ";
            textBox3.Text = " ";
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            operation();
        }

        private void textBox1_TextChanged(object sender, EventArgs e){}

        public void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            Console.Write(selectOp.SelectedValue);
            valor = selectOp.Text;
            Console.WriteLine(valor);
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            resetForm();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
