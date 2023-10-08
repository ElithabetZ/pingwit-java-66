package org.example.config.home_work_2.ApplicationBody.JDBCConnector;

public class EmployeeQueryManager {

    private static final String QUERYGETALLEMPLOYESS = "select all * from employees";
    private static final String QUERYGETALLEMPLOYESSBYNAME = "select all * from employees where name ='%1$s'";
    private static final String QUERYGETALLEMPLOYESSBYNAMEANDRATE = "select all * from employees where name ='%1$s' and rateperhour = %2$s";

    public String getQUERYGETALLEMPLOYESS() {
        return QUERYGETALLEMPLOYESS;
    }
    public String getQUERYGETALLEMPLOYESSBYNAME(){return QUERYGETALLEMPLOYESSBYNAME;}
    public String getQUERYGETALLEMPLOYESSBYNAMEANDRATE(){return QUERYGETALLEMPLOYESSBYNAMEANDRATE;}
}
