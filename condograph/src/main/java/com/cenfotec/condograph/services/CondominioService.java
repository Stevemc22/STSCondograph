package com.cenfotec.condograph.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.condograph.entities.Condominio;
import com.cenfotec.condograph.repository.CondominioRepository;

@Service
public class CondominioService {

	@Autowired 
	CondominioRepository repo;
	
	public List<Condominio> getAllCondominios(){
		return this.repo.findAll();
	}
	
	public Optional<Condominio> getCondominio(int id) {
		return this.repo.findById(id);
	}
	
	public Condominio createCondominio(String nombre, String direccion, 
			int cedulaJuridica, String representante, int unidades, int cuotaCondominal) {
		Condominio condominio = new Condominio();
		condominio.setNombre(nombre);
		condominio.setDireccion(direccion);
		condominio.setCedulaJuridica(cedulaJuridica);
		condominio.setRepresentante(representante);
		condominio.setUnidades(unidades);
		condominio.setCuotaCondominal(cuotaCondominal);
		return this.repo.save(condominio);
	}
	
	public void save(Condominio condominio) {
		// TODO Auto-generated method stub
		this.repo.save(condominio);
	}
}
