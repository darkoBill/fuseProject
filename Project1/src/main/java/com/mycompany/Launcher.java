package com.mycompany;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;


public class Launcher {
    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
       
    	CamelRoute route = new CamelRoute();
    	CamelContext ctx = new DefaultCamelContext();
    	
    	
    	try {
    		ctx.addRoutes(route);
        	ctx.start();
        	Thread.sleep(5 * 30 * 100);
        	ctx.stop();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
}
