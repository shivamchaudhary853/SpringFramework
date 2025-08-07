package org.Shivam.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifeCycle {
    String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    public void initMethod(){
        System.out.println("initialising the DB connection");
    }

    public void destroyMethod(){
        System.out.println("closing the DB operation");
    }
    public static void doDBoperation() {
        System.out.println("performing Db operation");
    }

}
