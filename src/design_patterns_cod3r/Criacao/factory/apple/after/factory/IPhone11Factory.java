package design_patterns_cod3r.Criacao.factory.apple.after.factory;

import design_patterns_cod3r.Criacao.factory.apple.after.model.IPhone;
import design_patterns_cod3r.Criacao.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
