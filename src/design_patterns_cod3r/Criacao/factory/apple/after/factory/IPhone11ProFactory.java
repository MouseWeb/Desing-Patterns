package design_patterns_cod3r.Criacao.factory.apple.after.factory;

import design_patterns_cod3r.Criacao.factory.apple.after.model.IPhone;
import design_patterns_cod3r.Criacao.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
