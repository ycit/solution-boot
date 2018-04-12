package com.ycit.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 开发环境
 *
 * @author xlch
 * @Date 2018-01-03 9:49
 */
@Component
@Profile(value = "dev")
public class DevConfig {

    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/xlch?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setFilters("wall,stat");
        dataSource.setMaxActive(50);
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeout(1800);
        dataSource.setLogAbandoned(true);
        return dataSource;
    }

}
