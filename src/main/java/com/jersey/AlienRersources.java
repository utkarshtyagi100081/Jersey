package com.jersey;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("aliens")
@Produces("Application/json")
public class AlienRersources {

    AlienDataStore data = new AlienDataStore();

    @GET
    @Produces("Application/json")
    public List<Alien> getAliens(){
        return data.getAliens();
    }
    @Path("/alien/{id}")
    @GET
    @Produces("Application/json")
    public Alien getAlien(@PathParam("id") String id){
        return data.getAlien((Integer.parseInt(id)));

    }
    @POST
    @Path("/addAlien")
    @Consumes("Application/json")
    public Alien createAlien(Alien a1){
        data.createAlien(a1);
        return a1;
    }
    @DELETE
    @Path("delete/{id}")
    public Alien updateAlien(@PathParam("id") int id){
       return data.deleteAlien(id);

    }

}
