import java.util.Scanner;

public class Imc {
    static String nomeDoPaciente;
    static double pesoDoPaciente;
    static double alturaDoPaciente;
    static double valorDoimc;

    public void ReceberDadosDoPaciente(){
        Scanner leitor= new Scanner(System.in);
        System.out.println("Obtendo Dados Do Paciente");
        System.out.println("-------------------------");
        System.out.print("Qual é o nome do(a) paciente? ");
        nomeDoPaciente= leitor.nextLine();

        System.out.print("Agora digite qual é a altura do(a) " +nomeDoPaciente+ ": ");
        alturaDoPaciente = leitor.nextDouble();

        System.out.print("Informe agora o peso do(a) " +nomeDoPaciente+ ": ");
        pesoDoPaciente= leitor.nextInt();
        System.out.println();


        CalcularImcDoPaciente();
    }

    public void CalcularImcDoPaciente(){
        valorDoimc= pesoDoPaciente/ (alturaDoPaciente*alturaDoPaciente);

        ExibirResultadoDoImcDoPaciente();
    }

    public void ExibirResultadoDoImcDoPaciente(){
        String valorDoImcComUmDecimal= String.format("%.1f", valorDoimc);

        System.out.println("Exibindo dados");
        System.out.println("--------------");
        System.out.println("Nome do Paciente: " +nomeDoPaciente);
        System.out.println("Peso do Paciente: " +pesoDoPaciente + " Kg");
        System.out.println("Altura do Paciente: " +alturaDoPaciente + " M");
        System.out.println();
        System.out.println("Resultado do Imc");
        System.out.println("----------------");
        System.out.println("O Imc do(a) " +nomeDoPaciente+ " é de: " +valorDoimc);
        System.out.println("O valor arredondado do Imc é de: " +valorDoImcComUmDecimal);
        System.out.println();
    }

}


