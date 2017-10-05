/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import exception.ConnectionBdException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ROG-PC
 */
@Path("users")
public class Users {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of User
     */
    public Users() {
    }

    /**
     * Retrieves representation of an instance of resource.User
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("getAll")
    public String getAllUser() throws ConnectionBdException {
        List<entities.Users> myUsers = manager.UsersManager.getAll();

        ObjectMapper mapper = new ObjectMapper();

        //TEST
        String myUsersJson = null;
        try {
            myUsersJson = mapper.writeValueAsString(myUsers);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myUsersJson;
    }

    /**
     * PUT method for updating or creating an instance of User
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
