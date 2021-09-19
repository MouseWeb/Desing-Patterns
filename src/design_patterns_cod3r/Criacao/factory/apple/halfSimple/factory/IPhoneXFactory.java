package design_patterns_cod3r.Criacao.factory.apple.halfSimple.factory;

import design_patterns_cod3r.Criacao.factory.apple.halfSimple.model.IPhone;
import design_patterns_cod3r.Criacao.factory.apple.halfSimple.model.IPhoneX;
import design_patterns_cod3r.Criacao.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
