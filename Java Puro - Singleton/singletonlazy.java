packege *;

public class singletonlazy {

    private static singletonlazy instancia;

    private singletonlazys() {
        super();
    }
    public static singletonlazy getInstancia() {
        if(instancia == null){
          instacia = new singletonlazy();
        }
        return instancia;
    }
}
