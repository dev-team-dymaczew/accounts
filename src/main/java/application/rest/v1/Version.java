package application.rest.v1;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;


@Path("v1/version")
public class Version {



    private static final String VERSION = "Version: 1.0.1";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response version() {
        List<String> list = new ArrayList<>();
        // return a simple list of strings
        list.add(VERSION);
        return Response.ok(list.toString()).build();
    }


}
