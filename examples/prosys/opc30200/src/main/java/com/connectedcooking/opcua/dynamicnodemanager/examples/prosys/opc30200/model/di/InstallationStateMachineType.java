// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di;

import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.stack.builtintypes.ByteString;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedByte;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.FiniteStateMachineType;
import java.lang.Double;
import java.lang.String;

/**
 * Generated on 2022-10-10 10:21:30
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=249")
public interface InstallationStateMachineType extends FiniteStateMachineType {
  String PERCENT_COMPLETE = "PercentComplete";

  String INSTALLATION_DELAY = "InstallationDelay";

  String INSTALL_SOFTWARE_PACKAGE = "InstallSoftwarePackage";

  String INSTALL_FILES = "InstallFiles";

  String RESUME = "Resume";

  @Optional
  BaseDataVariableType getPercentCompleteNode();

  @Optional
  UnsignedByte getPercentComplete();

  @Optional
  void setPercentComplete(UnsignedByte value) throws StatusException;

  @Optional
  BaseDataVariableType getInstallationDelayNode();

  @Optional
  Double getInstallationDelay();

  @Optional
  void setInstallationDelay(Double value) throws StatusException;

  @Optional
  UaMethod getInstallSoftwarePackageNode();

  void installSoftwarePackage(String f_manufacturerUri, String f_softwareRevision,
      String[] f_patchIdentifiers, ByteString f_hash) throws StatusException, ServiceException;

  @Optional
  UaMethod getInstallFilesNode();

  void installFiles(NodeId[] f_nodeIds) throws StatusException, ServiceException;

  @Mandatory
  UaMethod getResumeNode();

  void resume() throws StatusException, ServiceException;
}
