package navegador;

public class NavegadorInternet extends Funcionalidades {
  public static void main (String[] args){
    String exibir="Selecionado";
    String atualizar="Atualizar";
    String adicionar="Adicionar";
  }
  
    public class ExibirPagina {   
      public void exibir() {
        if(exibir="Selecionado") {
          System.out.printIn("Sua página está sendo exibida");
          break;
        } else {
          System.out.printIn("Selecione uma página!");
        }
      }
    }
    public class AtualizarAba {
      String atualizar="Atualizar" {
          System.out.printIn("Sua página foi atualizada! Deseja abrir nova aba?") {
            if(adicionar="Adicionar") {
              System.out.printIn("Nova aba foi aberta");
            } else {
              System.out.printIn("OK, permaneça onde está");
            }
          }        
        }
    }
}
