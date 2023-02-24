using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Conversor_Binario_a_Decimal
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Declaramos la Variable
            string NumBinario = txtNumero.Text;
            int Escala = 0;
            double EscDato = 0;
            double Resultado = 0;
            lblError.Text = "";
            //Recorremos el Número
            for (int i = NumBinario.Length -1 ;  i > -1; i--)
            {

                string dato = NumBinario.Substring(i, 1);
                //Escala
                EscDato = Math.Pow(2, Escala);

                if (dato == "1")
                {
                    Resultado = Resultado + EscDato;
                    Escala++;
                }
                else if(dato == "0")
                {
                    Escala++;
                }else
                {
                  lblError.Text = "El número ingresado no es Binario";
                  break;
                }
            }            
            txtResultado.Text = Resultado.ToString();
        }

        
    }
}
