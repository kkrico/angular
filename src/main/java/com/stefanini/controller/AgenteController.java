package com.stefanini.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.model.Agente;
import com.stefanini.model.Denuncia;
import com.stefanini.model.Tipo;
import com.stefanini.service.DenunciaService;
import com.stefanini.service.TipoService;

@Path("/agente")
@RequestScoped
public class AgenteController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Agente> get() {
		List<Agente> r = new ArrayList<Agente>();
		Agente a = new Agente();
		Agente a1 = new Agente();

		a.setNome("Daniel Ramos");
		a1.setNome("Cleber");

		a.setId(1);
		a1.setId(2);

		r.add(a);
		r.add(a1);
		return r;
	}
}
