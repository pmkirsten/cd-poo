package com.campusdual.exercisespoo.writejson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONClass {

    public void writeJSON(){
        JSONObject gpu = new JSONObject();
        gpu.put("quantity", 1);
        gpu.put("text", "Tarjeta gráfica");
//        System.out.println(gpu.toJSONString());

        JSONObject cpu = new JSONObject();
        cpu.put("quantity", 1);
        cpu.put("text", "CPU");
//        System.out.println(cpu.toJSONString());

        JSONObject fan = new JSONObject();
        fan.put("quantity", 3);
        fan.put("text", "Ventiladores");
//        System.out.println(fan.toJSONString());

        JSONArray componentList= new JSONArray();
        componentList.add(cpu);
        componentList.add(gpu);
        componentList.add(fan);
//        System.out.println(componentList.toJSONString());

        JSONObject objComponent = new JSONObject();
        objComponent.put("components", componentList);
//        System.out.println(objComponent.toJSONString());

        try (FileWriter fw = new FileWriter("src/main/resources/componentList.json")){
            fw.write(objComponent.toJSONString());
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void readJSON(){

        JSONParser parser = new JSONParser();

        try (FileReader fw = new FileReader("src/main/resources/componentList.json")){
            JSONObject parse  = (JSONObject) parser.parse(fw);
            JSONArray components = (JSONArray) parse.get("components");
            for (int i = 0; i < components.size(); i++) {
                System.out.println(((JSONObject)components.get(i)).toJSONString());
            }

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JSONClass json = new JSONClass();
        json.writeJSON();
        json.readJSON();
    }

}
