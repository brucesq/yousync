/**
 * 
 */
package com.hunthawk.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;


/**
 * 
 * @author sunquanzhi
 * 
 */
public abstract class AbstractLifecycleBean implements ApplicationListener,
		ApplicationContextAware {
	private static final Logger log = LoggerFactory.getLogger(AbstractLifecycleBean.class);
	private ApplicationContext applicationContext = null;

	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ContextRefreshedEvent) {
			ContextRefreshedEvent refreshEvent = (ContextRefreshedEvent) event;
			ApplicationContext refreshContext = refreshEvent
					.getApplicationContext();
			if (refreshContext != null
					&& refreshContext.equals(applicationContext)) {
				if (log.isDebugEnabled())
					log.debug("Bootstrapping component "
							+ this.getClass().getName());
				onBootstrap(refreshEvent);
			}
		} else if (event instanceof ContextClosedEvent) {
			ContextClosedEvent closedEvent = (ContextClosedEvent) event;
			ApplicationContext closedContext = closedEvent
					.getApplicationContext();
			if (closedContext != null
					&& closedContext.equals(applicationContext)) {
				if (log.isDebugEnabled())
					log.debug("Shutting down component "
							+ this.getClass().getName());
				onShutdown(closedEvent);
			}
		}
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	protected ApplicationContext getApplicationContext() {
		return this.applicationContext;
	}

	/**
	 * <p>
	 * ϵͳ��ʼ��ʱ�ṩ����Ļص��ص�
	 * </p>
	 * 
	 * @param event
	 */
	protected abstract void onBootstrap(ApplicationEvent event);

	/**
	 * <p>
	 * ϵͳ�ر�ʱ�ṩ����Ļص�����
	 * </p>
	 * 
	 * @param event
	 */
	protected abstract void onShutdown(ApplicationEvent event);

}
