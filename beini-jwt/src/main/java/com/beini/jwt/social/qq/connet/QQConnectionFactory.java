/**
 * 
 */
package com.beini.jwt.social.qq.connet;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;

import com.beini.jwt.social.qq.api.QQ;


/**
 * @author lb_chen
 *
 */
public class QQConnectionFactory extends OAuth2ConnectionFactory<QQ> {

	public QQConnectionFactory(String providerId, String appId, String appSecret) {
		super(providerId, new QQServiceProvider(appId, appSecret), new QQAdapter());
	}

}
