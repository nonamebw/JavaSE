package cn.itcast.jdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils3 {
    private static DataSource dataSource = new ComboPooledDataSource();
    private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    //获取数据源
    public static DataSource getDataSource(){
        return dataSource;
    }
    //获取连接
    public static Connection getConnection() throws SQLException{
        Connection conn = tl.get();
        if(conn==null){
            return dataSource.getConnection();
        }
        return conn;
    }
    //开启事物
    public static void beginTransaction() throws SQLException{
        Connection conn = tl.get();
        if(conn!=null){
            throw new SQLException("您已经开启了事务，在没有结束当前事务时，不能再开启事务");
        }
        conn = dataSource.getConnection();
        conn.setAutoCommit(false);
        tl.set(conn);//把当前线程的连接保存起来！
    }
    //提交事务
    public static void commitTransaction() throws SQLException{
        Connection conn = tl.get();
        if(conn==null){
            throw new SQLException("当前没有事务，所以不能提交");
        }
        conn.commit();
        conn.close();
        tl.remove();
    }
    //回滚事务
    public static void rollbackTransaction() throws SQLException{
        Connection conn = tl.get();
        if(conn==null){
            throw new SQLException("当前没有事务，所以不能回滚");
        }
        conn.rollback();
        conn.close();
        tl.remove();
    }
    //释放连接
    public static void releaseConnection(Connection connection) throws SQLException {
        Connection con = tl.get();
        /*
         * 判断它是不是事务专用，如果是，就不关闭！
         * 如果不是事务专用，那么就要关闭！
         */
        // 如果con == null，说明现在没有事务，那么connection一定不是事务专用的！
        if(con == null) connection.close();
        // 如果con != null，说明有事务，那么需要判断参数连接是否与con相等，若不等，说明参数连接不是事务专用连接
        if(con != connection) connection.close();
    }
}