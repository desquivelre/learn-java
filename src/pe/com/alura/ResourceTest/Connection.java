package pe.com.alura.ResourceTest;

public class Connection implements AutoCloseable {
    public Connection() {
        System.out.println("Open Connection");
    }

    public void readData() {
        System.out.println("Reading data");
        throw new IllegalStateException();
    }

    public void closeConnection() {
        System.out.println("Close Connection");
    }

    @Override
    public void close() throws Exception {
        closeConnection();
    }
}
