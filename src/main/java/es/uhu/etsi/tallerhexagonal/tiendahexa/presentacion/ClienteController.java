package es.uhu.etsi.tallerhexagonal.tiendahexa.presentacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.Cliente;
import es.uhu.etsi.tallerhexagonal.tiendahexa.negocio.ClienteService;


@Controller
public class ClienteController {
	
    private final ClienteService clienteService;

    @Autowired
    public ClienteController ( ClienteService clienteService ) {
        this.clienteService = clienteService;
    }

    @GetMapping( {"/","/index"} )
    public String mostrarClintes ( Model model ) {
    	List<Cliente> clientes = this.clienteService.obtenerTodosClientes();
    	model.addAttribute("clientes",clientes);
        return "index";
    }

    @GetMapping("/daraltacliente")
    public String mostrarFormAlta ( Model model ) {
        model.addAttribute("request", new DarAltaClienteRequest());
        return "darAltaClienteIn";
    }

    @PostMapping("/daraltacliente")
    public String enviarFormAlta ( Model model, @ModelAttribute("request") DarAltaClienteRequest request ) {
       	this.clienteService.darAltaCliente(request.getEmail(),request.getNombre());
        return "darAltaClienteOut";    		
    }
    
}
