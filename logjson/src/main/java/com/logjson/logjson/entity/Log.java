package com.logjson.logjson.entity;

public class Log {
    private int linenumber;
    private String values;

    public Log() {
    }

    public int getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(int linenumber) {
        this.linenumber = linenumber;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "log {" +
                "linenumber:'" + this.linenumber + '\''+
                ", value:'" + this.values + '\''+
                '}';
    }
}
