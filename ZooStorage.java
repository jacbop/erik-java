import java.nio.file.*;
/**
 * Write a description of class ZooStorage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZooStorage
{
    /**
     * Constructor for objects of class ZooStorage
     */
    public ZooStorage()
    {

    }

    public String load()
    {
        try {
            Path path = Paths.get("./animals.bin");
            String read = Files.readAllLines(path).get(0);
            return read;
        } catch (Exception e) {
            throw new RuntimeException("problem reading", e);
        }
    }

    public void save(String data)
    {
        try {

            Path path = Paths.get("./animals.bin");
            byte[] strToBytes = data.getBytes();

            Files.write(path, strToBytes);
        } catch (Exception e) {
            throw new RuntimeException("problem reading", e);
        }

    }
}