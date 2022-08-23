package strategy.exemploFuncionario;

import strategy.exemploFuncionario.entidade.*;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Estagiario();
        funcionario1.calcularSalario();
        funcionario1.calcularFerias();

        Funcionario funcionario2 = new Contratado();
        funcionario2.calcularSalario();
        funcionario2.calcularFerias();

        Funcionario funcionario3 = new Freelancer();
        funcionario3.calcularSalario();
        funcionario3.calcularFerias();

        Funcionario funcionario4 = new Voluntario();
        funcionario4.calcularSalario();
        funcionario4.calcularFerias();

        Funcionario funcionario5 = new ContratadoHomeOffice();
        funcionario5.calcularSalario();
        funcionario5.calcularFerias();
    }
}
