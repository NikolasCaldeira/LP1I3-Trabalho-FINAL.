import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class ConsultaAgendada {
    Scanner ler = new Scanner(System.in);
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    public static int quantidade = 0;
    private int dia;
    private int mes;
    private int ano;
    private int hor;
    private int min;
    private int seg;

    //--------------------------------------------------------//
    //------------------- 1° CONSTRUTOR ----------------------//
    public ConsultaAgendada() {
        setData();
        setHora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    //------------------- 2° CONSTRUTOR ----------------------//
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String md) {
        this.hor = h;
        this.min = mi;
        this.seg = s;
        this.dia = d;
        this.mes = m;
        this.ano = a;
        this.nomePaciente = p;
        this.nomeMedico = md;
        quantidade++;
    }

    //------------------- 3° CONSTRUTOR ----------------------//
    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    //--------------------------------------------------------//
    //------------------- SET DATA ----------------------//
    public void setData(int a, int b, int c) {
        this.dia = a;
        this.mes = b;
        this.ano = c;
    }

    public void setData() {
        do {
            System.out.print("Digite o dia: ");
            dia = ler.nextInt();
        }
        while (dia > 31 || dia <= 0);
        do {
            System.out.print("Digite o mês: ");
            mes = ler.nextInt();
        }
        while (mes > 12 || mes <= 0);
        do {
            System.out.print("Digite o ano: ");
            ano = ler.nextInt();
        }
        while (ano < 0);

        if (ano % 4 != 0 && mes == 2 && dia >= 29) {
            dia = 1;
            mes = 3;
        }
    }

    //------------------- SET HORA ----------------------//
    public void setHora(int a, int b, int c) {
        this.hor = a;
        this.min = b;
        this.seg = c;
    }

    public void setHora() {
        do {
            System.out.print("Digite a(s) hora(s): ");
            hor = ler.nextInt();
        }
        while (hor >= 24 || hor < 0);

        do {
            System.out.print("Digite o(s) minuto(s): ");
            min = ler.nextInt();
        }
        while (min >= 60 || min < 0);

        do {
            System.out.print("Digite o(s) segundo(s): ");
            seg = ler.nextInt();

        }
        while (seg >= 60 || seg < 0);
    }

    //------------------- SET PACIENTE ------------------//
    public void setNomePaciente(String pa) {
        this.nomePaciente = pa;
    }

    public void setNomePaciente() {
        System.out.print("Digite o nome do(a) paciente: ");
        nomePaciente = ler.next();
    }

    //------------------- SET MEDICO --------------------//
    public void setNomeMedico(String med) {
        this.nomeMedico = med;
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do(a) médico(a): ");
        nomeMedico = ler.next();
    }

    //--------------------------------------------------------//
    //*----------GET CONTADOR --------*//
    public int getAmostra() {
        int qtd = this.quantidade;
        return qtd;
    }

    //*---------- GET DATA ------------*//
    public String getData() {
        return (dia + "/" + mes + "/" + ano);
    }

    //*---------- GET HORA ------------*//
    public String getHora() {
        return (this.hor + ":" + this.min + ":" + this.seg);
    }

    //*---------- GET PACIENTE --------*//
    public String getNomePaciente() {
        return ("Nome do Paciente: " + nomePaciente);
    }

    //*---------- GET MEDICO ----------*//
    public String getNomeMedico() {
        return ("Nome do Médico: " + nomeMedico);
    }

    //--------------------------------------------------------//

    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(15, 45, 20, 23, 07, 2022, "Marcos", "Felipe");
        System.out.println("------------------- P1 -----------------------");
        System.out.println(p1.getData() + "\n" + p1.getHora() + "\n" + p1.getNomePaciente() + "\n" + p1.getNomeMedico());
        System.out.println("----------------------------------------------");

        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("------------------- P2 -----------------------");
        System.out.println(p2.getData() + "\n" + p2.getHora() + "\n" + p2.getNomePaciente() + "\n" + p2.getNomeMedico());
        System.out.println("----------------------------------------------");

        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();
        System.out.println("------------------- P1 -----------------------");
        System.out.println(p1.getData() + "\n" + p1.getHora() + "\n" + p1.getNomePaciente() + "\n" + p1.getNomeMedico());
        System.out.println("----------------------------------------------");
        System.out.println("Quantidade de consultas de construtores.: " + p1.getAmostra());
        System.out.println("----------------------------------------------");
    }
}
