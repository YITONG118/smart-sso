package com.smart.sso.server.common;

/**
 * 有效期限管理器
 * 
 * @author Joe
 */
public interface ExpirationPolicy {
	
    /**
     * 定时清理
     */
    void verifyExpired();
}
