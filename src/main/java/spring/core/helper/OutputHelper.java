package spring.core.helper;

public class OutputHelper {
	
	OutputService outputService;
	
	public void setOutputService(OutputService outputService){
		this.outputService = outputService;
	}
	
	public void output(){
		System.out.println(outputService.output());
	}

}
