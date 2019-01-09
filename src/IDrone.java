import java.util.HashMap;

//Interface with methods
public interface IDrone {
    HashMap<Position, Short> scan(WheatField w);

}
