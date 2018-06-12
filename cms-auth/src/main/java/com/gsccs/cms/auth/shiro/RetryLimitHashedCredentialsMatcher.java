package com.gsccs.cms.auth.shiro;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import com.gsccs.cms.bass.utils.MD5;


public class RetryLimitHashedCredentialsMatcher extends
		HashedCredentialsMatcher {

	private Cache<String, AtomicInteger> passwordRetryCache;

	public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}

	@Override
	public boolean doCredentialsMatch(AuthenticationToken authcToken,
			AuthenticationInfo info) {
		String username = (String) authcToken.getPrincipal();
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;

		// retry count + 1
		AtomicInteger retryCount = passwordRetryCache.get(username);
		
		if (retryCount == null) {
			retryCount = new AtomicInteger(0);
			passwordRetryCache.put(username, retryCount);
		}
		//System.out.println(username+"_passwordRetryCache:"+retryCount);
		if (retryCount.incrementAndGet() > 5) {
			// if retry count > 5 throw
			//throw new ExcessiveAttemptsException();
		}

		Object tokenCredentials = encrypt(String.valueOf(token.getPassword()));
		Object accountCredentials = getCredentials(info);
		
		/*if (null==tokenCredentials){
			passwordRetryCache.remove(username);
			return false;
		}
		if (null==accountCredentials){
			passwordRetryCache.remove(username);
			return false;
		}*/
		//System.out.println("password:"+String.valueOf(token.getPassword()));
		//System.out.println("tokenCredentials:"+tokenCredentials);
		//System.out.println("accountCredentials:"+accountCredentials);
		boolean matches = equals(tokenCredentials.toString(), accountCredentials.toString());
				//super.doCredentialsMatch(token, info);
		
		/*System.out.println(username+"_matches:"+matches);
		if (matches) {
			// clear retry count
			passwordRetryCache.remove(username);
			System.out.println(username+"_remove:"+retryCount);
		}*/
		return matches;
	}

	// 将Token密码加密方法
	private String encrypt(String pwd) {
		return MD5.MD5(pwd);
	}
}
