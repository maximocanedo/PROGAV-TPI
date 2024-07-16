package frgp.utn.edu.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import frgp.utn.edu.ar.entidad.Usuario;
import frgp.utn.edu.ar.negocio.InegUsuario;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private InegUsuario usuarioService;

    @PostMapping("/registrar")
    public ModelAndView registrarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.agregarUsuario(usuario);
        return new ModelAndView("redirect:/usuarios");
    }

    @GetMapping("/{id}")
    public ModelAndView obtenerUsuario(@PathVariable int id) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(id);
        ModelAndView mav = new ModelAndView("detalleUsuario");
        mav.addObject("usuario", usuario);
        return mav;
    }

    @GetMapping("/buscar")
    public ModelAndView buscarUsuarios(@RequestParam String nombre, @RequestParam String apellido) {
        List<Usuario> usuarios = usuarioService.buscarUsuarios(nombre, apellido);
        ModelAndView mav = new ModelAndView("listaUsuarios");
        mav.addObject("usuarios", usuarios);
        return mav;
    }

    @GetMapping("/eliminar/{id}")
    public ModelAndView eliminarUsuario(@PathVariable int id) {
        usuarioService.eliminarUsuario(id);
        return new ModelAndView("redirect:/usuarios");
    }
}
