import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {
    private int id;
    private String name;
    private LocalDateTime dataFN;
    private String address;

    public Client(int id, String name, LocalDateTime dataFN) {
        this.id = id;
        this.name = name;
        this.dataFN = dataFN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDataFN() {
        return dataFN;
    }

    public void setDataFN(LocalDateTime dataFN) {
        this.dataFN = dataFN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", dataFN=" + dataFN +
                ", address='" + address + '\'' +
                '}';
    }
}
