package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "Helloo " + new Date();
    }

}
