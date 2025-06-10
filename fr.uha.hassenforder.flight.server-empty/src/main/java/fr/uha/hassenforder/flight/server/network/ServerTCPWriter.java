package fr.uha.hassenforder.flight.server.network;

import java.io.OutputStream;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import fr.uha.hassenforder.flight.database.Seat;
import fr.uha.hassenforder.flight.database.SeatComfort;
import fr.uha.hassenforder.flight.database.SeatCount;
import fr.uha.hassenforder.flight.database.SeatState;
import fr.uha.hassenforder.flight.database.Ticket;
import fr.uha.hassenforder.flight.database.TicketState;
import fr.uha.hassenforder.flight.database.User;
import fr.uha.hassenforder.flight.network.Protocol;
import fr.uha.hassenforder.flight.server.network.dto.PaymentResult;
import fr.uha.hassenforder.flight.server.network.dto.PaymentState;
import fr.uha.hassenforder.flight.server.network.dto.TicketReply;
import fr.uha.hassenforder.flight.server.network.dto.TravelReply;
import fr.uha.hassenforder.network.BasicAbstractWriter;

public class ServerTCPWriter extends BasicAbstractWriter {

    public ServerTCPWriter(OutputStream outputStream) {
        super (outputStream);
    }

    public void createOK() {
        writeInt(Protocol.REPLY_OK);
    }

    public void createKO() {
        writeInt(Protocol.REPLY_KO);
    }

	public void createNOWAY() {
        writeInt(Protocol.REPLY_NOWAY);
	}


}
