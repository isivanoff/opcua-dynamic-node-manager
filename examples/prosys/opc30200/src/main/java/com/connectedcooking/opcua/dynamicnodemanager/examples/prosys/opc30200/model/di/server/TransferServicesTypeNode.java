// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.TransferServicesType;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Structure;
import com.prosysopc.ua.stack.core.StatusCodes;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;

/**
 * Generated on 2022-10-10 10:21:30
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6526")
public class TransferServicesTypeNode extends TransferServicesTypeNodeBase {
  protected TransferServicesTypeNode(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    // Use this method to initialize the nodes, when they are all created.
    // Note that 'super.afterCreate()' performs default initializations, so consider
    // whether your own initializations should be done before or after it.
    super.afterCreate();
  }

  @Override
  protected TransferServicesType.TransferToDeviceMethodOutputs onTransferToDevice(ServiceContext serviceContext)
      throws StatusException {
    //Implement the generated method here (and remove the code below) OR set implementation via static method setTransferToDeviceMethodImplementation 
    throw new StatusException(StatusCodes.Bad_NotImplemented);
  }

  @Override
  protected TransferServicesType.TransferFromDeviceMethodOutputs onTransferFromDevice(ServiceContext serviceContext)
      throws StatusException {
    //Implement the generated method here (and remove the code below) OR set implementation via static method setTransferFromDeviceMethodImplementation 
    throw new StatusException(StatusCodes.Bad_NotImplemented);
  }

  @Override
  protected Structure onFetchTransferResultData(ServiceContext serviceContext, Integer f_transferID,
      Integer f_sequenceNumber, Integer f_maxParameterResultsToReturn, Boolean f_omitGoodResults)
      throws StatusException {
    //Implement the generated method here (and remove the code below) OR set implementation via static method setFetchTransferResultDataMethodImplementation 
    throw new StatusException(StatusCodes.Bad_NotImplemented);
  }
}
