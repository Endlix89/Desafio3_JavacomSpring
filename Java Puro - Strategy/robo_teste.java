import *;

public class robo_teste {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }
    public void mover() {
        comportamento.mover();
    }
}
