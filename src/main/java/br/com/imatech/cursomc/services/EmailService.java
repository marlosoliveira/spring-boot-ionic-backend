package br.com.imatech.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.imatech.cursomc.domain.Pedido;

public interface EmailService {

	void SendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
