package Exercicio1;

public class Main {
    public static void main(String[] args) {
        ProfHorista profHorista = new ProfHorista("João", "1234", 30, 50.0f, 80);
        System.out.println("Nome: " + profHorista.getNome());
        System.out.println("Matrícula: " + profHorista.getMatricula());
        System.out.println("Idade: " + profHorista.getIdade());
        System.out.println("Salário: " + profHorista.retornaSalario());

        ProfRegime profRegime = new ProfRegime("Maria", "5678", 40, 5000.0f);
        System.out.println("Nome: " + profRegime.getNome());
        System.out.println("Matrícula: " + profRegime.getMatricula());
        System.out.println("Idade: " + profRegime.getIdade());
        System.out.println("Salário: " + profRegime.retornaSalario());
        
        
    }
}