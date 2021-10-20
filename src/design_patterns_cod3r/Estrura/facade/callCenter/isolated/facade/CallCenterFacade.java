package design_patterns_cod3r.Estrura.facade.callCenter.isolated.facade;

import design_patterns_cod3r.Estrura.facade.callCenter.isolated.model.Card;
import design_patterns_cod3r.Estrura.facade.callCenter.isolated.services.CardService;
import design_patterns_cod3r.Estrura.facade.callCenter.isolated.services.PaymentService;
import design_patterns_cod3r.Estrura.facade.callCenter.isolated.services.RegisterService;
import design_patterns_cod3r.Estrura.facade.callCenter.isolated.services.ReportService;

public class CallCenterFacade {
	CardService cardService;
	RegisterService registerService;
	ReportService reportService;
	PaymentService paymentService;
	
	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
	}
	
	public Long getCardByUser(Long l) {
		Card card = cardService.getCardByUser(l);
		return card.getCardNumber();
	}
	
	public void getSumary(Long cardNumber) {
		reportService.getSumary(new Card(null, cardNumber));
	}
	
	public void getPaymentInfoByCard(Long cardNumber) {
		paymentService.getPaymentInfoByCard(new Card(null, cardNumber));
	}

}
