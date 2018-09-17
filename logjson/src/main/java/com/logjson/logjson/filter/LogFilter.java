package com.logjson.logjson.filter;

import com.logjson.logjson.entity.Log;

import java.util.ArrayList;
import java.util.List;

public class LogFilter
{
    private List<Log> logList = new ArrayList<Log>();

    public LogFilter() {
    }

    public List<Log> getLogList() {
        return logList;
    }

    public void setLogList(List<Log> logList) {
        this.logList = logList;
    }

    public void add(int linenumber, String values, String filter)
    {
        if(values.indexOf(filter) != -1) {
            Log log = new Log();
            log.setLinenumber(linenumber);
            log.setValues(values);
            this.logList.add(log);
        }
    }
}
