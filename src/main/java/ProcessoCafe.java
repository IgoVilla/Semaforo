public class ProcessoCafe extends Thread{


    FilaCafe fila;

    public ProcessoCafe(FilaCafe f){

        fila = f;
    }

    public void run(){

        System.out.println("A " + Thread.currentThread().getName() +
                " está pronta para preparar um café de seu gosto!");
        System.out.println(" ");

       fila.cafeSemSemaforo();
        //fila.cafeComSemaforo();


    }



}
