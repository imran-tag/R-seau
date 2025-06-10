package fr.uha.hassenforder.flight.client.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import fr.uha.hassenforder.flight.client.model.Authenticator;
import fr.uha.hassenforder.flight.client.model.Connected;
import fr.uha.hassenforder.flight.client.model.Account;
import fr.uha.hassenforder.flight.client.model.PaymentResult;
import fr.uha.hassenforder.flight.client.model.PaymentState;
import fr.uha.hassenforder.flight.client.model.Seat;
import fr.uha.hassenforder.flight.client.model.SeatComfort;
import fr.uha.hassenforder.flight.client.model.SeatCount;
import fr.uha.hassenforder.flight.client.model.SeatState;
import fr.uha.hassenforder.flight.client.model.Ticket;
import fr.uha.hassenforder.flight.client.model.TicketState;
import fr.uha.hassenforder.flight.client.model.Travel;
import fr.uha.hassenforder.flight.client.model.User;
import fr.uha.hassenforder.flight.network.Protocol;
import fr.uha.hassenforder.network.BasicAbstractReader;

public class ClientTCPReader extends BasicAbstractReader {


    public ClientTCPReader(InputStream inputStream) {
        super(inputStream);
    }

    private void eraseFields() {
    }

    public void receive() {
        type = readInt();
        eraseFields();
        switch (type) {
        case Protocol.REPLY_NOWAY:			break;
        case Protocol.REPLY_KO:				break;
        case Protocol.REPLY_OK:				break;
        }
    }

}
