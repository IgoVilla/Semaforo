import java.util.concurrent.Semaphore;

public class FilaCafe {

    public void cafeSemSemaforo(){

        System.out.println("Café selecionado, a " + Thread.currentThread().getName() +
                " está preparando seu café!");
        System.out.println("O café da " + Thread.currentThread().getName() +
                " ficou pronto, cuidado com a temperatura!");
        System.out.println(" ");

    }

    Semaphore semaforo = new Semaphore(1);

    public void cafeComSemaforo(){
        try{
            semaforo.acquire();
            System.out.println("Café selecionado, a " + Thread.currentThread().getName() +
                    " está preparando seu café!");

        } catch (InterruptedException exception) {}
        finally {
            System.out.println("O café da " + Thread.currentThread().getName() +
                    " ficou pronto, cuidado com a temperatura!");
            System.out.println(" ");
            semaforo.release();

        }
    }
}
