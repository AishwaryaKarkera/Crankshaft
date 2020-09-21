package shop.com.shaft;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FileReaderJson extends ArrayList<String> {

    private JSONArray array;

    public JSONArray readFile() {

        try {
            JSONParser parser = new JSONParser();
            //parsing file "Products.json"
           array = (JSONArray) parser.parse(new FileReader("Products.json"));
//int [] num ={1,2,3,4};

for(int i = 1; i<= array.size(); i++){
   Object o = array.get(i-1);
    JSONObject product = (JSONObject) o;

                    Long id = (Long) product.get("uuid");


                    String name = (String) product.get("name");

                    String price = (String) product.get("price");

                    System.out.println(i + "." + " "+ name + " " + "$" + price);
                }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (
                IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (
                ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return array;
    }

    public JSONArray getArray() {
        return array;
    }



}
