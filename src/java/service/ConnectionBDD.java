/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exception.ConnectionBdException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author apaisibl
 */
public class ConnectionBDD {

    private static String urlFichierXml = "service/my-batisConfig.xml";

    public static SqlSession getSession() throws ConnectionBdException {
        InputStream inFichier;
        SqlSession session = null;
        try {
            inFichier = Resources.getResourceAsStream(urlFichierXml);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inFichier);
            sessionFactory.getConfiguration().addMappers("mapper");
            session = sessionFactory.openSession();
        } catch (IOException ex) {
            throw new ConnectionBdException();
        }

        return session;
    }

}
