package ResourceTest;

public class testConnection {
    public static void main(String[] args) throws Exception {

        try (Connection con = new Connection()) {
            con.readData();
        } catch (IllegalStateException e) {
            System.out.println("Receiving exception");
            e.printStackTrace();
        }
    }
}
