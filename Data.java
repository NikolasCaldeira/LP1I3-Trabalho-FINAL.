
    // Faz parte do Terceiro Construtor
public class Data 
{
    private int dia;
    private int mes;
    private int ano;

    public String getDatas() 
    {
        String dt = (dia + "/" + mes + "/" + ano);
        return dt;
    }

    public void setDatas(int a, int b, int c)
    {
        this.dia = a;
        this.mes = b;
        this.ano = c;
    }


}