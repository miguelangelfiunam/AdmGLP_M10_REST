/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.diplomado.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author unam
 */
public class BDUsuarioPojo {

    private List<UsuarioPojo> usuarioPojos;

    public BDUsuarioPojo() {
        usuarioPojos = new ArrayList<>();
        usuarioPojos.add(new UsuarioPojo(1, "mike", "correo@dgp.unam.mx", null, "Miguel", "Martinez", "Rivera", 28, new Date(), "5534385266", null, new Date(), null, 10));
        usuarioPojos.add(new UsuarioPojo(2, "pascual", "pascual@dgp.unam.mx", null, "Pascual", "Martinez", "Resendiz", 60, new Date(), "5512345678", null, new Date(), null, 10));
        usuarioPojos.add(new UsuarioPojo(3, "ingrid", "ingrid@dgp.unam.mx", null, "Ingrid", "Garrido", "Gonzalez", 28, new Date(), "5587654321", null, new Date(), null, 10));
    }

    public List<UsuarioPojo> getUsuarioPojos() {
        return usuarioPojos;
    }

    public void setUsuarioPojos(List<UsuarioPojo> usuarioPojos) {
        this.usuarioPojos = usuarioPojos;
    }

}
