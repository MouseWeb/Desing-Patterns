package design_patterns_cod3r.Criacao.abstractfactory.app.service.factory;

import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.CarService;
import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
