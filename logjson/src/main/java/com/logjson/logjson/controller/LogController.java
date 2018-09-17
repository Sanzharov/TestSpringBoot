package com.logjson.logjson.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.logjson.logjson.entity.Results;
import com.logjson.logjson.filter.LogFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

@Controller
public class LogController {
    @GetMapping
    public String main(@RequestParam(name = "main",required = false,defaultValue = "Guys")String main,
                       Model model){
        model.addAttribute("main",main);
        return "main";
    }
    @GetMapping("/api/search")
    public String logSearch(@RequestParam String q, Map<String, Object> model) throws IOException{

        List<String> listLine = Files.readAllLines
                (Paths.get("..\\TestSpringBoot\\logjson\\src\\main\\resources\\logs\\log.txt"));
        LogFilter logFilter = new LogFilter();

        String filte = q;

        for(int i = 0; i < listLine.size(); i++) { logFilter.add(i + 1, listLine.get(i), filte); }

        Results results = new Results();
        results.setCount(logFilter.getLogList().size());
        results.setResults(logFilter.getLogList());

        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        String json = GSON.toJson(results);
        model.put("results", json);

        return "logs";
    }
}