package Exercicio02;

public class Main {
    public static void main(String[] args) {

        SenhaAtendimento s1 = new SenhaAtendimento("Faustão");
        SenhaAtendimento s2 = new SenhaAtendimento("Giovanni");
        SenhaAtendimento s3 = new SenhaAtendimento("Lucão");


        System.out.println(s1.getPaciente());
        System.out.println(s2.getPaciente());
        System.out.println(s3.getPaciente());

        System.out.println("Proxima senha -------> " + SenhaAtendimento.controle);

    }
}
