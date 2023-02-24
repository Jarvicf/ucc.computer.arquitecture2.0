using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Converción_Decimal_a_Binario
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
			//Declaramos Variables
            //Declaramos el divisor 2
            int Divisor = 2;
			//Cociente
            int coc = 0;
			//Residuo
            int res = 0;
			//Resultados
            string Operar = "S";
            string Resultado = "";
            string ResultadoFinal = "";
            //Capturamos el número
            try
            {
                int Dividendo = Int32.Parse(txtDecimal.Text);

                //Si el decimal es 0 o 1
                if (Dividendo > 1)
                {
                    while (Operar == "S")
                    {
                        //Operamos y obtenemos el Cociente y el residuo
                        coc = Dividendo / Divisor;
                        res = Dividendo % Divisor;

                        //Verificamos si el Cociente en menor a Dos
                        if (coc >= 2)
                        {
                            Resultado = Resultado + res.ToString();
                            //txtResultado.Text = Resultado;
                            Dividendo = coc;
                        }
                        else
                        {
                            Resultado = Resultado + res.ToString();
                            //txtResultado.Text = Resultado;
                            Operar = "N";
                        }
                    }

                    Resultado = Resultado + coc.ToString();

                    // Invertimos el Dato
                    for (int i = Resultado.Length - 1; i > 0 - 1; i--)
                    {
                        string dato = Resultado.Substring(i, 1);
                        ResultadoFinal = ResultadoFinal + dato; ;
                    }
                    //Imprimimos el resultado Binario
                    txtResultado.Text = ResultadoFinal;
                }
                else
                {
                    //Si el dato ingresado esta entre 0 y 1
                    switch (Dividendo)
                    {
                        case 1:
                            txtResultado.Text = "1";
                            break;
                        case 0:
                            txtResultado.Text = "0";
                            break;
                    }
                }

            }
            catch (Exception ex)
            {
                lblEror.Text = ex.Message;
            }
            

            
            
        }
    }
}
