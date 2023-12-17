package com.sample;


import org.kie.api.KieServices;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javax.swing.JOptionPane;


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

//	public static class Question{
//		public String question;
//		public String answer;
//		public String[] choice;
//		
//		public Question(String q, String[] ch) {
//			this.question = q;
//			this.choice = ch;
//			this.answer = null;
//			
//		}
//		
//		public void showQuestion() {
//			int pom = JOptionPane.showOptionDialog(null, question, "Please pick your answer" ,  JOptionPane.DEFAULT_OPTION,
//	        	    JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
//			answer = choice[pom];
//		
//		}
//	
//	}
//	  public static class Option {
//	    	public String option;
//	    	
//	    	public Option(String o) {
//	    		this.option = o;
//	    		JOptionPane.showMessageDialog(null, o);
//	    	}
//	    }
	
	
		
}
