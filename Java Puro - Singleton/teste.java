package *;

public class teste {

    public static void main(String[] args){


        singletonlazy lazy = new singletonlazy.getInstancia();
        System.out.println(lazy);
        lazy = singletonLazy.getInstancia();
        System.out.println(lazy);

        singletoneager eager = new singletoneager.getInstancia();
        System.out.println(eager);
        eager = singletoneager.getInstancia();
        System.out.println(eager);

        singlelazyholder holder = new singlelazyholder.getInstancia();
        System.out.println(holder);
        holder = singlelazyholder.getInstancia();
        System.out.println(holder);

    }
}
