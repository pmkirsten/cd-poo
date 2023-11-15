package com.campusdual.exercisespoo.writejson;

import com.campusdual.exercisespoo.Perro;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PerroJSONClass {

    public void writeJSON() {
        Perro balto = new Perro(90, true, "Husky", "Balto", "Gris");
        Perro roco = new Perro(80, false, "Labrador", "Roco", "Negro");
        Perro rex = new Perro(85, true, "Pastor Alemán", "Rex", "Bicolor");

        JSONArray perretes = new JSONArray();
        perretes.add(balto.toJson());
        perretes.add(roco.toJson());
        perretes.add(rex.toJson());

        JSONObject objComponent = new JSONObject();
        objComponent.put("perros", perretes);

        try (FileWriter fw = new FileWriter("src/main/resources/perros.json")){
            fw.write(objComponent.toJSONString());
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public void readJSON(){

        JSONParser parser = new JSONParser();

        try (FileReader fw = new FileReader("src/main/resources/perros.json")){
            JSONObject parse  = (JSONObject) parser.parse(fw);
            JSONArray perrosArray = (JSONArray) parse.get("perros");
            for (int i = 0; i < perrosArray.size(); i++) {
                JSONObject perroEnJSON = (JSONObject) perrosArray.get(i);
                Perro perro = new Perro(perroEnJSON);
                perro.presentarse();
            }

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        PerroJSONClass perroJSONClass = new PerroJSONClass();
        perroJSONClass.writeJSON();
        perroJSONClass.readJSON();

    }

}
