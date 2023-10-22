package reprodutor;

public class ReprodutorMusical extends Funcionalidades{
  public class SelecionandoMusica {
    public static void main (String[] args) {
      System.out.printIn("Selecione a música desejada")
    }
  }
  public class ReprodutorMusical {
  boolean tocando=true;
  String musica="1";

    public void tocar(){
      tocando=true;
      System.out.printIn("Sua música está tocando")
    }
    public void pausar(){
      tocando=false;
      System.out.printIn("Sua música está pausada.");
    }
  }
}
