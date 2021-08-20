package com.cenfotec.condograph.graphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cenfotec.condograph.entities.Condominio;
import com.cenfotec.condograph.services.CondominioService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class CondominioQuery implements GraphQLQueryResolver {
	
	@Autowired
	private CondominioService condominioService;
	
	public List<Condominio> getCondominios() {
		return this.condominioService.getAllCondominios();
	}
}
