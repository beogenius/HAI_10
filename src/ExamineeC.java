public class ExamineeC extends Examinee {
    public ExamineeC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public static final String Literary = "Literary";
    public static final String History = "History";
    public static final String Geology = "Geology";

    @Override
    public String toString() {
        return "ExamineeC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + Literary + " - " + History + " - " + Geology +
                '}';
    }
}
