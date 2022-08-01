packege *;

public class singlelazyholder {

    private static class InstaceHolder {
        private static singlelazyholder instancia = new singlelazyholder();
    }
    private singlelazyholder {
        super();
    }

    public static singlelazyholder getInstancia() {
        return singlelazyholder.instancia;
    }
}