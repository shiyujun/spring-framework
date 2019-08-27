package cn.shiyujun.service;

/**
 * @author syj
 * CreateTime 2019/7/18
 * describe:
 */
public interface JDBCService {

    public void queryById(int id);
    public void updateNameById(int id,String name);
    public void testTransactional();
}
