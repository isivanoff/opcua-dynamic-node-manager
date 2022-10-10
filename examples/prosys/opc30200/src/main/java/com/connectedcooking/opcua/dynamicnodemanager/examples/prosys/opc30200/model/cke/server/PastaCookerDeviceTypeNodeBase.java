// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.EnergySourceEnumeration;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.PastaCookerDeviceType;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1021")
public abstract class PastaCookerDeviceTypeNodeBase extends CommercialKitchenDeviceTypeNode implements PastaCookerDeviceType {
  private static GeneratedNodeInitializer<PastaCookerDeviceTypeNode> f_pastaCookerDeviceTypeNodeInitializer;

  protected PastaCookerDeviceTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getPastaCookerNode());
    GeneratedNodeInitializer<PastaCookerDeviceTypeNode> impl = getPastaCookerDeviceTypeNodeInitializer();
    if(impl != null) {
      impl.init((PastaCookerDeviceTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<PastaCookerDeviceTypeNode> getPastaCookerDeviceTypeNodeInitializer() {
    return f_pastaCookerDeviceTypeNodeInitializer;
  }

  public static void setPastaCookerDeviceTypeNodeInitializer(GeneratedNodeInitializer<PastaCookerDeviceTypeNode> f_pastaCookerDeviceTypeNodeInitializerNewValue) {
    f_pastaCookerDeviceTypeNodeInitializer=f_pastaCookerDeviceTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getEnergySourceNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "EnergySource");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public EnergySourceEnumeration getEnergySource() {
    UaVariable node = getEnergySourceNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node EnergySource does not exist");
    }
    Variant value = node.getValue().getValue();
    return (EnergySourceEnumeration) value.asEnum(EnergySourceEnumeration.class);
  }

  @Mandatory
  @Override
  public void setEnergySource(EnergySourceEnumeration value) {
    UaVariable node = getEnergySourceNode();
    if (node == null) {
      throw new RuntimeException("Setting EnergySource failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting EnergySource failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public UaProperty getIsWithLiftNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "IsWithLift");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public Boolean isIsWithLift() {
    UaVariable node = getIsWithLiftNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node IsWithLift does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Boolean) value;
  }

  @Mandatory
  @Override
  public void setIsWithLift(Boolean value) {
    UaVariable node = getIsWithLiftNode();
    if (node == null) {
      throw new RuntimeException("Setting IsWithLift failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting IsWithLift failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public PastaCookerParameterTypeNode getPastaCookerNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "PastaCooker");
    return (PastaCookerParameterTypeNode) getComponent(browseName);
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
