package pattern.behavioral.chainOfRespons;

public class ConcreteHandlerOne extends Handler{
	
	@Override
	public void handleRequest(Request request) {
		if (request.getId() == 1){
			System.out.println("Handled by concretehandler one");
		} else {
			if (nextHandler != null){
				nextHandler.handleRequest(request);
			}
		}
	}

}
