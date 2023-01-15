package components;

import interfaces.IDeviceFromProvider;
import interfaces.IDeviceToProvider;
import org.xtuml.bp.core.ComponentInstance_c;

// This class represents the port sprouted by the xtUML (modeled) component
// that connects to this realized component.  Accordingly, the name of this
// class must be identical to the name of that port.
public class Device implements IDeviceFromProvider {
	
	// Handle for the xtUML (modeled) port connected to this realized port.
	// By convention, it is useful to make the name of this variable identical
	// to the name of the port sprouted by this (realized) component.
	public static IDeviceToProvider Server;
	
	// Constructor for this class.  Invoked by Verifier when a session is initiated.
	public Device( IDeviceToProvider server ) {
		Server = server;
	}
	
    // Method for handling the inbound (to this realized component) signal, Query
	@Override
	public void Query( ComponentInstance_c senderReceiver ) {
		// Send the outbound (from this realized component) signal, Report, to the 
		// port sprouted by the xtUML (modeled) component.
		Server.Report( senderReceiver, "Query response." );
	}
}