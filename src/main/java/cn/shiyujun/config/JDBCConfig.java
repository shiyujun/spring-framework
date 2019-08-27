package cn.shiyujun.config;


import cn.shiyujun.service.JDBCService;
import cn.shiyujun.service.impl.JDBCServiceImpl;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class JDBCConfig {
    @Bean
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://172.16.40.159:3306/cfkk?characterEncoding=utf-8&useSSL=false");
        return druidDataSource;
    }

    @Bean
    public JDBCService jdbcService(DruidDataSource druidDataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(druidDataSource);
        JDBCService jdbcService = new JDBCServiceImpl(jdbcTemplate);
        return jdbcService;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DruidDataSource druidDataSource) {
        return new DataSourceTransactionManager(druidDataSource);
    }
}
