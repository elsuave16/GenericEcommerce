/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import entities.Users;
import java.util.List;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author ROG-PC
 */
public interface IUsersMapper {
    
    
        @Select("SELECT * FROM pgta.user")
        List<Users> getAll();

}
