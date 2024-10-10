import br.ers.menu.Menu;
import br.ers.modelo.*;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



import java.io.IOException;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu = new Menu();

        menu.iniciar();

    }
}