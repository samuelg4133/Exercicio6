

package Main;
import Classes.Pessoa;

public class TestaPessoa {
    
    public static void main(String[] args) {
        
        Pessoa P1 = new Pessoa("Samuel", "Rua A, 94, Belo Horizonte - Buritizeiro-MG", "(38) 99243-3719");
        
        System.out.println("Nome: " + P1.getNome());
        System.out.println("Endereço: " + P1.getEndereco());
        System.out.println("Telefone: " + P1.getTelefone());
    }
    
}
