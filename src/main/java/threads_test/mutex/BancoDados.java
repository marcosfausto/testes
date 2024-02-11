package threads_test.mutex;

import java.util.concurrent.Semaphore;

// Classe que representa o banco de dados
public class BancoDados {

    private Semaphore semaforo = new Semaphore(10); // Permite no máximo 10 threads acessando ao mesmo tempo

    public void acessar() throws InterruptedException {
        // Tenta adquirir o semáforo
        semaforo.acquire();

        try {

        } finally {
            // Libera o semáforo
            semaforo.release();
        }
    }
}

// Classe que usa o banco de dados
class ClasseExemplo {

    public static void main(String[] args) {
        BancoDados bancoDados = new BancoDados();

        // Cria várias threads que acessam o banco de dados
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    bancoDados.acessar();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
