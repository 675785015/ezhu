package com.igogo.bo.conf;


/**
 * Created by Lee on 2017/8/10.
 */
public enum DataSourceType {
    master("master","主库"),
    slaver("slaver","从库");
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    DataSourceType(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
