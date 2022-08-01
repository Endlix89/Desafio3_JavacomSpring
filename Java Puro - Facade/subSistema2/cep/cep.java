package subSistema2.cep;

public class cep {

    private static cep instancia = new cep();
    private cep() {
        super();
    }

    public static cep getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep) {
        return "Santos";
    }
    public String recuperarEstado(String cep) {
        return "São Paulo";
    }
}
