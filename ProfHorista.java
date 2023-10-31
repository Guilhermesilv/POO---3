package Exercicio1;
public class ProfHorista extends Professor {
    private float salHora;
    private int totalHoras;

    public ProfHorista(String nome, String matricula, int idade, float salHora, int totalHoras) {
        super(nome, matricula, idade);
        this.salHora = salHora;
        this.totalHoras = totalHoras;
    }

    public float getSalHora() {
        return salHora;
    }

    public void setSalHora(float salHora) {
        this.salHora = salHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public float retornaSalario() {
        float salario = salHora * totalHoras;
        salario -= salario * 0.05; // desconto de 5%
        return salario;
    }
}
