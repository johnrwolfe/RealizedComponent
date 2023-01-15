package interfaces;

import org.xtuml.bp.core.ComponentInstance_c;

// Java interface representing messages flowing from the realized component to
// the xtUML (modeled) component
public interface IDeviceToProvider {
  public void Report( ComponentInstance_c senderReceiver, String message );
}