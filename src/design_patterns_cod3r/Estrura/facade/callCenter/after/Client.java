package design_patterns_cod3r.Estrura.facade.callCenter.after;

import design_patterns_cod3r.Estrura.facade.callCenter.after.facade.CallCenterFacade;
import design_patterns_cod3r.Estrura.facade.callCenter.after.model.Card;

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
		CallCenterFacade facade = new CallCenterFacade();
		
		Card card = facade.getCardByUser(123456L);
		System.out.println(card);
		
		facade.getSumary(card);
		
		facade.getPaymentInfoByCard(card);
		
		facade.cancelLastRegister(card);
		
		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
