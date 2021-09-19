package design_patterns_cod3r.Criacao.abstractfactory.app.service.factory;

import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.CarEJBService;
import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.CarService;
import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.UserEJBService;
import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



