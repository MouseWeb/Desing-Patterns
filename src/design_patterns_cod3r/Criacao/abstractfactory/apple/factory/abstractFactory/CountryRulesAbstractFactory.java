package design_patterns_cod3r.Criacao.abstractfactory.apple.factory.abstractFactory;


import design_patterns_cod3r.Criacao.abstractfactory.apple.model.certificate.Certificate;
import design_patterns_cod3r.Criacao.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
