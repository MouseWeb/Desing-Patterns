package design_patterns_cod3r.Criacao.factory.apple.after.factory;

import design_patterns_cod3r.Criacao.factory.apple.after.model.IPhone;
import design_patterns_cod3r.Criacao.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
