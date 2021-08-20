package com.cenfotec.condograph.graphql.mutation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.condograph.entities.Condominio;
import com.cenfotec.condograph.services.CondominioService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class CondominioMutation implements GraphQLMutationResolver {

	@Autowired
	private CondominioService condominioService;
	
	public Condominio createCondominio(String nombre, String direccion, 
			int cedulaJuridica, String representante, int unidades, int cuotaCondominal) {
		return this.condominioService
				.createCondominio(nombre, direccion, cedulaJuridica, representante, unidades, cuotaCondominal);
	}
	
	public Condominio updateCondominio(int id, String nombre, String direccion, 
			int cedulaJuridica, String representante, int unidades, int cuotaCondominal) {
		Optional<Condominio> condominio = this.condominioService.getCondominio(id);
		if(condominio.isPresent()) {
			Condominio condominioEntity = condominio.get();
			condominioEntity.setNombre(nombre);
			condominioEntity.setDireccion(direccion);
			condominioEntity.setCedulaJuridica(cedulaJuridica);
			condominioEntity.setRepresentante(representante);
			condominioEntity.setUnidades(unidades);
			condominioEntity.setCuotaCondominal(cuotaCondominal);
			
			condominioService.save(condominioEntity);
			return condominioEntity;
		}
		
		return null;
	}
}
