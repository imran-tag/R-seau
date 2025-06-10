package fr.uha.hassenforder.flight.server.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.uha.hassenforder.flight.database.SeatComfort;
import fr.uha.hassenforder.flight.database.SeatCount;
import fr.uha.hassenforder.flight.database.User;
import fr.uha.hassenforder.flight.network.Protocol;
import fr.uha.hassenforder.flight.server.network.dto.Authenticator;
import fr.uha.hassenforder.flight.server.network.dto.TravelBooking;
import fr.uha.hassenforder.flight.server.network.dto.TravelFilter;
import fr.uha.hassenforder.network.BasicAbstractReader;

public class ServerTCPReader extends BasicAbstractReader {

	
	public ServerTCPReader(InputStream inputStream) {
		super (inputStream);
	}

	private void eraseFields() {
	}


	public void receive() {
		type = readInt ();
		eraseFields ();
		switch (type) {
		case 0 : break;
        }
    }

}
