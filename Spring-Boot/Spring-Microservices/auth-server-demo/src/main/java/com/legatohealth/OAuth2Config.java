package com.legatohealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
public class OAuth2Config extends AuthorizationServerConfigurerAdapter{
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private TokenStore store;

	@Autowired
	private JwtAccessTokenConverter converter;
	
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("my-client").
		secret("{noop}secretpassword")
		.authorizedGrantTypes("password")
		.scopes("web","mobile");
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(store).
		accessTokenConverter(converter).
		authenticationManager(authManager).
		userDetailsService(userDetailsService);
	}

	
	
}
