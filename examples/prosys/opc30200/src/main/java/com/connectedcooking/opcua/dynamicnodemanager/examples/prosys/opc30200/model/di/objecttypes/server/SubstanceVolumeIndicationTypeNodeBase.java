// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.objecttypes.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.objecttypes.SubstanceVolumeIndicationType;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import java.lang.Override;

/**
 * Indicates the volume of a substance, for example of a liquid.
 * <p>
 * Generated on 2023-09-26 10:56:50
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=479")
public abstract class SubstanceVolumeIndicationTypeNodeBase extends BaseLifetimeIndicationTypeNode implements SubstanceVolumeIndicationType {
  private static GeneratedNodeInitializer<SubstanceVolumeIndicationTypeNode> f_substanceVolumeIndicationTypeNodeInitializer;

  protected SubstanceVolumeIndicationTypeNodeBase(UaNode.Parameters parameters) {
    super(parameters);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<SubstanceVolumeIndicationTypeNode> impl = getSubstanceVolumeIndicationTypeNodeInitializer();
    if(impl != null) {
      impl.init((SubstanceVolumeIndicationTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<SubstanceVolumeIndicationTypeNode> getSubstanceVolumeIndicationTypeNodeInitializer() {
    return f_substanceVolumeIndicationTypeNodeInitializer;
  }

  public static void setSubstanceVolumeIndicationTypeNodeInitializer(GeneratedNodeInitializer<SubstanceVolumeIndicationTypeNode> f_substanceVolumeIndicationTypeNodeInitializerNewValue) {
    f_substanceVolumeIndicationTypeNodeInitializer=f_substanceVolumeIndicationTypeNodeInitializerNewValue;
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
