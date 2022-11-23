public class Main {


    public static void main(String[] args) {
        


        FilaCafe fila = new FilaCafe();

        Thread[] thread = new Thread[3];


        for(int i = 0; i < 3; i++)
        {
            thread[i] = new Thread(

                    new ProcessoCafe(fila)
            );
        }

        for(int i = 0; i < 3; i++)
        {
            thread[i].start();

        }
    }
}

