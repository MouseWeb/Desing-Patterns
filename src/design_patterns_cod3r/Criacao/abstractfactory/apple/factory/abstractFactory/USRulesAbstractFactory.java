package design_patterns_cod3r.Criacao.abstractfactory.apple.factory.abstractFactory;

import design_patterns_cod3r.Criacao.abstractfactory.apple.model.certificate.Certificate;
import design_patterns_cod3r.Criacao.abstractfactory.apple.model.certificate.USCertificate;
import design_patterns_cod3r.Criacao.abstractfactory.apple.model.packing.Packing;
import design_patterns_cod3r.Criacao.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
