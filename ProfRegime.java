package Exercicio1;

public class ProfRegime extends Professor {
    private float salario;

    public ProfRegime(String nome, String matricula, int idade, float salario) {
        super(nome, matricula, idade);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float retornaSalario() {
        float salarioLiquido = (float) (salario - (salario * 0.12)); // desconto de 12%
        return salarioLiquido;
    }
}