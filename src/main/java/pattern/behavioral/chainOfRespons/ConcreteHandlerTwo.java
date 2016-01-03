package pattern.behavioral.chainOfRespons;

public class ConcreteHandlerTwo extends Handler{

	@Override
	public void handleRequest(Request request) {
		if (request.getId() == 2){
			System.out.println("Handled by concretehandler2");
		} else {
			if (nextHandler != null){
				nextHandler.handleRequest(request);
			}
		}
		
	}

}
