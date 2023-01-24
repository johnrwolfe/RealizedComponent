package components;

import interfaces.IReportingFromProvider;
import interfaces.IReportingToProvider;
import org.xtuml.bp.core.ComponentInstance_c;

// This class represents a realized component, and it must implement 
// the Java interface representing the port sprouted by the 
// modeled component connected to the realized component.
public class Device implements IReportingFromProvider {
	
	// Handle for the xtUML (modeled) port connected to this realized port.
	// By convention, it is useful to make the name of this variable identical
	// to the name of the port sprouted by this (realized) component.
	public static IReportingToProvider Server;
	
	// Constructor for this class.  Invoked by Verifier when a session is initiated.
	public Device( IReportingToProvider server ) {
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