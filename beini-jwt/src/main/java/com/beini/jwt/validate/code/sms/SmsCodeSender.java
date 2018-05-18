/**
 * 
 */
package com.beini.jwt.validate.code.sms;

/**
 * @author lb_chen
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
