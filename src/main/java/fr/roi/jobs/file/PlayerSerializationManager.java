package fr.roi.jobs.file;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PlayerSerializationManager {

    private Gson gson;

    public PlayerSerializationManager(){
        this.gson = createGsonInstance();
    }

    private Gson createGsonInstance(){
        return new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .disableHtmlEscaping()
                .create();
    }

    public String serialize(PlayerProfile profile){

        return this.gson.toJson(profile);
    }
    public PlayerProfile deserialize(String json){
        return this.gson.fromJson(json, PlayerProfile.class);
    }
}





