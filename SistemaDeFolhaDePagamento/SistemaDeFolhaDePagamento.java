import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {

    protected String nome;
    protected int matricula;
    protected double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {

        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {

        return salarioBase;
    }

    public void exibirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Final: " + calcularSalario());
    }
}

class FuncionarioPadrao extends Funcionario {

    public FuncionarioPadrao(String nome,
                             int matricula,
                             double salarioBase) {

        super(nome, matricula, salarioBase);
    }
}

class FuncionarioComissionado extends Funcionario {

    private double vendas;
    private double percentual;

    public FuncionarioComissionado(String nome,
                                   int matricula,
                                   double salarioBase,
                                   double vendas,
                                   double percentual) {

        super(nome, matricula, salarioBase);

        this.vendas = vendas;
        this.percentual = percentual;
    }

    @Override
    public double calcularSalario() {

        double comissao = vendas * (percentual / 100);

        return salarioBase + comissao;
    }

    @Override
    public void exibirDados() {

        double comissao = vendas * (percentual / 100);

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário Final: " + calcularSalario());
    }
}

class FuncionarioProducao extends Funcionario {

    private int qtdPecas;
    private double valorPeca;

    public FuncionarioProducao(String nome,
                               int matricula,
                               double salarioBase,
                               int qtdPecas,
                               double valorPeca) {

        super(nome, matricula, salarioBase);

        this.qtdPecas = qtdPecas;
        this.valorPeca = valorPeca;
    }

    @Override
    public double calcularSalario() {

        double bonus = qtdPecas * valorPeca;

        return salarioBase + bonus;
    }

    @Override
    public void exibirDados() {

        double bonus = qtdPecas * valorPeca;

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Produtividade: " + bonus);
        System.out.println("Salário Final: " + calcularSalario());
    }
}

public class SistemaDeFolhaDePagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        final double SALARIO_BASE = 2000.0;

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();

                    FuncionarioPadrao fp =
                            new FuncionarioPadrao(
                                    nome,
                                    matricula,
                                    SALARIO_BASE
                            );

                    funcionarios.add(fp);

                    System.out.println("Funcionário padrão cadastrado!");
                    break;

                case 2:

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    matricula = sc.nextInt();

                    System.out.print("Valor das vendas: ");
                    double vendas = sc.nextDouble();

                    System.out.print("Percentual da comissão: ");
                    double percentual = sc.nextDouble();

                    FuncionarioComissionado fc =
                            new FuncionarioComissionado(
                                    nome,
                                    matricula,
                                    SALARIO_BASE,
                                    vendas,
                                    percentual
                            );

                    funcionarios.add(fc);

                    System.out.println("Funcionário comissionado cadastrado!");
                    break;

                case 3:

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    matricula = sc.nextInt();

                    System.out.print("Quantidade de peças: ");
                    int qtdPecas = sc.nextInt();

                    System.out.print("Valor por peça: ");
                    double valorPeca = sc.nextDouble();

                    FuncionarioProducao fprod =
                            new FuncionarioProducao(
                                    nome,
                                    matricula,
                                    SALARIO_BASE,
                                    qtdPecas,
                                    valorPeca
                            );

                    funcionarios.add(fprod);

                    System.out.println("Funcionário de produção cadastrado!");
                    break;

                case 4:

                    System.out.println("\n===== FOLHA DE PAGAMENTO =====");

                    System.out.println("Total de pessoas cadastradas: "
                            + funcionarios.size());

                    for (Funcionario f : funcionarios) {

                        System.out.println("\n-------------------");
                        f.exibirDados();
                    }

                    break;

                case 0:

                    System.out.println("Programa encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}