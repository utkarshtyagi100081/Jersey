package com.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@Path("aliens")
public class AlienRersources {
    @GET
    @Produces({"Application/xml"})
    public Alien getAliens(){
        Alien a1= new Alien();
        a1.setName("utkarsh");
        a1.setId(101);
        return a1;
    }
}
