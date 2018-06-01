package pointofsale;

/**
 *
 * @author PMazur
 */
public interface OutputDevice {
    public void print(Product product);
    public void print(Receipt receipt);
    public void print(String text);
}
