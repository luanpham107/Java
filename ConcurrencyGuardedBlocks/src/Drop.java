
public class Drop {

	// Message sent from producer to consumer
	private String message;
	//

	private boolean empty = true;

	public synchronized String take() {
		// Wait until message is avaiable
		while (empty) {
			try {
				wait();
			} catch (InterruptedException ex) {
			}
		}
		// Toggle status
		empty = true;
		// Notify producer that status has changed
		notifyAll();
		return message;
	}

	public synchronized void put(String message) {

		// Waint until message has been retieved
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException ex) {

			}

		}
		empty = false;
		this.message = message;
		notifyAll();
	}
}
