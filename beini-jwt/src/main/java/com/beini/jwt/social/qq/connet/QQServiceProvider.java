/**
 * 
 */
package com.beini.jwt.social.qq.connet;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

import com.beini.jwt.social.qq.api.QQ;
import com.beini.jwt.social.qq.api.QQImpl;


/**
 * @author lb_chen
 *
 */
public class QQServiceProvider extends AbstractOAuth2ServiceProvider<QQ> {

	private String appId;
	
	private static final String URL_AUTHORIZE = "https://graph.qq.com/oauth2.0/authorize";
	
	private static final String URL_ACCESS_TOKEN = "https://graph.qq.com/oauth2.0/token";
	
	public QQServiceProvider(String appId, String appSecret) {
		super(new QQOAuth2Template(appId, appSecret, URL_AUTHORIZE, URL_ACCESS_TOKEN));
		this.appId = appId;
	}
	
	@Override
	public QQ getApi(String accessToken) {
		return new QQImpl(accessToken, appId);
	}

}
