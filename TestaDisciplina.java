
package Main;
import Classes.Disciplina;

public class TestaDisciplina {
    
    public static void main(String[] args) {
        
        Disciplina D1 = new Disciplina("Samuel", 1, "4º Periodo");
        
        System.out.println("Nome: " + D1.getNome());
        System.out.println("Código: " + D1.getCodigo());
        System.out.println("Período: " + D1.getPeriodo());
    }
    
}
