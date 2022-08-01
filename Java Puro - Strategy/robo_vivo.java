
public class robo_vivo {

    public static void main (String[] args) {

        Comportamento comportamento_normal = new comportamento_normal();
        Comportamneto comprotamento_rapido = new comportamento_rapido();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        Robo robo = new Robo();
        robo.setComportamento(rapido);
        robo.mover();
    }
}