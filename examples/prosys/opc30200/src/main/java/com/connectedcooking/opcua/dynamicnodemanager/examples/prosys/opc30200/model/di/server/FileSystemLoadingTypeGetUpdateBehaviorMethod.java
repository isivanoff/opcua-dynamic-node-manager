// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.UpdateBehavior;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.NodeId;

public abstract interface FileSystemLoadingTypeGetUpdateBehaviorMethod {
  UpdateBehavior getUpdateBehavior(ServiceContext serviceContext, FileSystemLoadingTypeNode node,
      NodeId[] f_nodeIds) throws StatusException;
}
