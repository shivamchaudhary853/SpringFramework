package org.Shivam.lifecycle;

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
