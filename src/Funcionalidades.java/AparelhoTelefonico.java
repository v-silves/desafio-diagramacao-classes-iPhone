package aparelho;

public class AparelhoTelefonico extends Funcionalidades {
  public static void main (String[] args) {
    boolean tocando=true;
    boolean atender=true;
  }
    public void aparelhoTocando() {
      tocando=true;
      System.out.printIn("Seu aparelho está tocando!");
    }
    public void atenderAparelho() {
      if (atender=true) {
        System.out.printIn("Você atendeu essa ligação... Aguente");
      } else {
        System.out.printIn("Eita, você rejeitou alguém");
        System.out.printIn("Essa ligação foi redirecionada para o correio de voz. De nada!");
      }
    }
}
