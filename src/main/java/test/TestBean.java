package test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TestBean {
	private String asd = "asd";

	public String getAsd() {
		return asd;
	}

	public void setAsd(String asd) {
		this.asd = asd;
	}
	
	
}
