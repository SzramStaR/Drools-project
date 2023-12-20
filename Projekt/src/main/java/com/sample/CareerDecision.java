package com.sample;


import org.kie.api.KieServices;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public class CareerDecision {

	
	public static final void main(String[] args) {
		try {
			// load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	// go !
            kSession.fireAllRules();
		} catch(Throwable t) {
			t.printStackTrace();
		}
		
	}

	
		
}

