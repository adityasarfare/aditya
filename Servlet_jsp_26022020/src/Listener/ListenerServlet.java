package Listener;

import javax.servlet.http.HttpSessionEvent;

import javax.servlet.http.HttpSessionListener;

public class ListenerServlet implements HttpSessionListener {
	private int sessioncount = 0;
	
@Override
public void sessionCreated(HttpSessionEvent se) {
	synchronized (this) {
		sessioncount ++;
	}
 
 System.out.println("Session Created : " + sessioncount);
 System.out.println("Session id : " + se.getSession().getId());

}

@Override
	public void sessionDestroyed(HttpSessionEvent se) {
      synchronized (this) {
		sessioncount --;
	}
      
      System.out.println("Session Destroyed : " + sessioncount);
      System.out.println("session id : " + se.getSession().getId());
	}
	
}
