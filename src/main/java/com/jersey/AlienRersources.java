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
    public List<Alien> createAlien(Alien a1){
        return data.createAlien(a1);
    }
    @DELETE
    @Path("delete/{id}")
    public Alien deleteAlien(@PathParam("id") int id){
       return data.deleteAlien(id);

    }

    @PUT
    @Path("update/{id}")
    public List<Alien> updateAlien(Alien a1,@PathParam("id") int id){
         for (Alien a : data.aliens) {
             if (a.getId() == id)
                 return data.updateAlien(a1,data.aliens.indexOf(a));
         }
         return data.createAlien(a1);
        }
    }


