package shop.com.shaft;
/**
The class reads the JSON file
 */

//import statements
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FileReaderJson extends ArrayList < String >
{
    private JSONArray array;

    //The method is used to read the file by creating a JSON object
    public JSONArray readFile()
    {
        try
        {
            JSONParser parser = new JSONParser();
            //parsing file "Products.json"
            array = (JSONArray) parser.parse(new FileReader("Products.json"));
            //loops through the JSON file and displays the contents
            for (int i = 1; i <= array.size(); i++)
            {
                Object o = array.get(i - 1);
                JSONObject product = (JSONObject) o;

                Long id = (Long) product.get("uuid");

                String name = (String) product.get("name");

                String price = (String) product.get("price");

                System.out.println(i + "." + " " + name + " " + "$" + price);
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {

            e.printStackTrace();
        }
        return array;
    }

    public JSONArray getArray()
    {
        return array;
    }

}