package fr.uha.hassenforder.flight.client.network;

import java.io.OutputStream;
import java.time.LocalDate;
import java.util.List;

import fr.uha.hassenforder.flight.client.model.Authenticator;
import fr.uha.hassenforder.flight.client.model.Account;
import fr.uha.hassenforder.flight.client.model.SeatCount;
import fr.uha.hassenforder.flight.network.Protocol;
import fr.uha.hassenforder.network.BasicAbstractWriter;
import fr.uha.hassenforder.network.DateUtils;

public class ClientTCPWriter extends BasicAbstractWriter {

    public ClientTCPWriter(OutputStream outputStream) {
        super(outputStream);
    }

}
