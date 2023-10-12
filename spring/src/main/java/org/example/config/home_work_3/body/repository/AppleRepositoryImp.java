package org.example.config.home_work_3.body.repository;

import org.example.config.home_work_3.body.model.Apple;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppleRepositoryImp implements AppleRepository{

    @Qualifier("JdbcAppleConnector")// @Qualifier("jdbcAppleConnector")
    private final JdbcConnector<Apple> jdbcConnector;

    public AppleRepositoryImp(JdbcAppleConnector jdbcConnector){
        this.jdbcConnector = jdbcConnector;
    }

    @Override
    public List<Apple> getAll() {
        return jdbcConnector.getAll();
    }
}
