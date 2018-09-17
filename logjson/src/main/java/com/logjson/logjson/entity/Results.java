package com.logjson.logjson.entity;

import java.util.List;

public class Results {

    private List<Log> results;
    private int count;

    public Results() {
    }

    public List<Log> getResults() {
        return results;
    }

    public void setResults(List<Log> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "{ results:[" +
                this.results + '\''+
                "], count:'" + this.results + '\''+
                '}';
    }
}
