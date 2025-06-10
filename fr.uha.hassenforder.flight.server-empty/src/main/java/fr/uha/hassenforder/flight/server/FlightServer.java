package fr.uha.hassenforder.flight.server;

import fr.uha.hassenforder.flight.database.Model;
import fr.uha.hassenforder.flight.server.images.ImagesCache;

public class FlightServer {

	private Model model = null;
	private ImagesCache cache = null;
	private TCPServer tcp = null;

	public void start () {
		model = new Model();
		model.initialize();
		cache = new ImagesCache();
		tcp = new TCPServer(new Business(model, cache));
		tcp.start();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FlightServer m = new FlightServer ();
		m.start();
	}

}
