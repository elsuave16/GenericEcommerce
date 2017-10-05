/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entities.Users;
import exception.ConnectionBdException;
import java.util.List;
import service.ConnectionBDD;
import mapper.IUsersMapper;

/**
 *
 * @author ROG-PC
 */
public class UsersManager {
    
     public static List<Users> getAll() throws ConnectionBdException, exception.ConnectionBdException {
        IUsersMapper ium = ConnectionBDD.getSession().getMapper(IUsersMapper.class);
        return ium.getAll();
    }
}
