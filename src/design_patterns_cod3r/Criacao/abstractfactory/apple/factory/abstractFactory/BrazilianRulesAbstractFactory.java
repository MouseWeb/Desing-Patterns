package design_patterns_cod3r.Criacao.abstractfactory.apple.factory.abstractFactory;


import design_patterns_cod3r.Criacao.abstractfactory.apple.model.certificate.BrazilianCertificate;
import design_patterns_cod3r.Criacao.abstractfactory.apple.model.certificate.Certificate;
import design_patterns_cod3r.Criacao.abstractfactory.apple.model.packing.BrazilianPacking;
import design_patterns_cod3r.Criacao.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
