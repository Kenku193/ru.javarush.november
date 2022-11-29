package Module2.Lesson18.Example3Anno;


public class BankClient {
    @TudaSuda(clientType = 101)
    int id;

    private int deploy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
