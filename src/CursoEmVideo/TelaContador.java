package CursoEmVideo;

public class TelaContador {
    public static void main(String[] args) {
        int cc = 1;
        StringBuilder contagem = new StringBuilder();
        while (cc <= 10) {
            contagem.append(cc).append(" ");
            cc++;
        }
        System.out.println(contagem);
    }
}
