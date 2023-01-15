package interfaces;

import org.xtuml.bp.core.ComponentInstance_c;

// Java interface representing messages flowing from the xtUML (modeled) component
// to the realized component.
public interface IDeviceFromProvider {
  public void Query( ComponentInstance_c senderReceiver );
}