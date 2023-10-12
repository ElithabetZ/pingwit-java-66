package org.example.config.home_work_3.body.repository;

import java.util.List;
//класс!
public interface JdbcConnector<T> {

    List<T> getAll();
}
