package com.oaec.console;

import com.oaec.entity.User;
import com.oaec.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

public class AppTest {
    public static void main(String[] args) throws IOException {
        //加载mybatis配置文件
        Reader reader = Resources.getResourceAsReader( "mybatis-config.xml" );
        //创建回话工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build( reader );
        //创建会话
        SqlSession session = sessionFactory.openSession();
       /* //创建语句
        String statememt = "com.oaec.mapper.UserMapper.getById";
        //
        User user  = session.selectOne( statememt,1 );*/
        User user = new User( "tom", 23 );
        int result = session.getMapper( UserMapper.class ).insert( user );
        System.out.println(result);
        session.commit();

    }


}

