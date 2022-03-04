package mx.unam.diplomado.rest;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.Date;
import mx.unam.diplomado.pojo.BDUsuarioPojo;
import mx.unam.diplomado.pojo.UsuarioPojo;
import mx.unam.diplomado.xml.XMLCreatorData;

@Path("/usuario")
public class WSUsuarioEndPoint {

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service WSUsuarioEndPoint online").build();
    }

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public String xml() {;
        UsuarioPojo usuarioPojo = new UsuarioPojo(1, "mike", "correo@dgp.unam.mx", null, "Miguel", "Martinez", "Rivera", 28, new Date(), "5534385266", null, new Date(), null, 10);
        return XMLCreatorData.createBasicXML(usuarioPojo);
    }

    @GET
    @Path("/xmlobject")
    @Produces(MediaType.APPLICATION_XML)
    public UsuarioPojo xml2() {
        return new UsuarioPojo(1, "mike", "correo@dgp.unam.mx", null, "Miguel", "Martinez", "Rivera", 28, new Date(), "5534385266", null, new Date(), null, 10);
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification(@PathParam("id") int id) {
        BDUsuarioPojo bdup = new BDUsuarioPojo();
        UsuarioPojo up_aux = null;
        for (UsuarioPojo usuarioPojo : bdup.getUsuarioPojos()) {
            if (usuarioPojo.getIdusuario() == id) {
                up_aux = usuarioPojo;
            }
        }
        return Response.ok().entity(up_aux).build();
    }
    
    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuarios() {
        BDUsuarioPojo bdup = new BDUsuarioPojo();
        return Response.ok().entity(bdup.getUsuarioPojos()).build();
    }

    @POST
    @Path("/post/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(UsuarioPojo notification) {
        
        return Response.status(201).entity(notification).build();
    }
}
