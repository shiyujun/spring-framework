package cn.shiyujun.service.impl;

import cn.shiyujun.entity.User;
import cn.shiyujun.entity.UserRowMapper;
import cn.shiyujun.service.JDBCService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author syj
 * CreateTime 2019/7/18
 * describe:
 */
@Transactional
public class JDBCServiceImpl implements JDBCService {
    private JdbcTemplate jdbcTemplate;

    public JDBCServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void queryById(int id) {
        List<User> list = jdbcTemplate.query("select id,name,age from user where id=?", new Object[]{id}, new UserRowMapper());
        if (list.size() > 0) {
            System.out.println("id 为" + id + "的用户名为：" + list.get(0).getName());
        }
    }

    public void updateNameById(int id, String name) {
        jdbcTemplate.update("update user set name=? where id=?", new Object[]{name, id});
    }

    @Override
    public void testTransactional() {
        jdbcTemplate.update("update user set name='王五' where id=1", new Object[]{});
        throw new RuntimeException("异常");
    }
}
