package design_patterns_cod3r.Criacao.factory.apple.after;

import design_patterns_cod3r.Criacao.factory.apple.after.factory.IPhone11ProFactory;
import design_patterns_cod3r.Criacao.factory.apple.after.factory.IPhoneFactory;
import design_patterns_cod3r.Criacao.factory.apple.after.factory.IPhoneXFactory;
import design_patterns_cod3r.Criacao.factory.apple.after.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
