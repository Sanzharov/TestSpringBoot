package com.logjson.logjson.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.logjson.logjson.entity.Log;

import java.util.List;

public class LogReader
{
    public List<Log> getPerson(String json) {
        Gson gson = new Gson();

        return gson.fromJson(json, new TypeToken<List<Log>>(){}.getType());
    }

}

