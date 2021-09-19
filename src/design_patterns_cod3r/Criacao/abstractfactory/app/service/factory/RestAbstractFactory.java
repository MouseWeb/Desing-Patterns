package design_patterns_cod3r.Criacao.abstractfactory.app.service.factory;

import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.CarRestApiService;
import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.CarService;
import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.UserRestApiService;
import design_patterns_cod3r.Criacao.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
