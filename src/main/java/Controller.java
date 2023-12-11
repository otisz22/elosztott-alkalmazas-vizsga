import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Controller {
    private Model dataModel;

    public Controller() {
        this.dataModel = new Model("", "", "");
    }

    public void fetchData() {
        try {

            URL url = new URL("https://jsonplaceholder.typicode.com/users/1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            Gson gson = new Gson();
            dataModel = gson.fromJson(response.toString(), Model.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Model getDataModel() {
        return dataModel;
    }
}