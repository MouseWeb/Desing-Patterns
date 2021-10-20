package design_patterns_cod3r.Estrura.facade.callCenter.before;

import design_patterns_cod3r.Estrura.facade.callCenter.before.model.Card;
import design_patterns_cod3r.Estrura.facade.callCenter.before.model.Register;
import design_patterns_cod3r.Estrura.facade.callCenter.before.services.*;

import java.util.List;

/* simplificar o acesso a um sistema ou a um subsistema ao módulo da sua aplicação,
   ou seja dentro de um módulo dentro de um sistema existe toda uma complexidade que
   pode ser encapsulado a partir de uma fachada.
   Definir uma fachada que proporciona uma interface única para um conjunto de interfaces de um sistema.

   Oferecer uma interface única não necessariamente precisa ser uma única interface em que pode estar dividida
   em várias fachadas diferentes demais, uma interface única para cada serviço digamos assim não necessariamente
   é a interface, oferecer uma interface única para um conjunto de interfaces de um subsistema.
   A fachada define uma interface de nível mais elevado que torna o subsistema mais fácil de usar. - GOF

   Obs: é um princípio fundamental dos pilares da orientação objeto, possui um baixo acoplamento entre os olhos e você
        promove um alto encapsulamento e esconder a complexidade dentro das classes dentro dos pacotes e dentro dos
        módulos é algo fundamental.

   */

public class Client {

	public static void main(String[] args) {
		CardService cardService = new CardService();
		RegisterService registerService = new RegisterService();
		ReportService reportService = new ReportService(registerService);
		PaymentService paymentService = new PaymentService(registerService);
		SecurityService securityService = new SecurityService(cardService, registerService);
		
		Card card = cardService.getCardByUser(123456L);
		System.out.println(card);
		
		reportService.getSumary(card);
		
		paymentService.getPaymentInfoByCard(card);
		
		//Remove last register, block the card e order a new one
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
