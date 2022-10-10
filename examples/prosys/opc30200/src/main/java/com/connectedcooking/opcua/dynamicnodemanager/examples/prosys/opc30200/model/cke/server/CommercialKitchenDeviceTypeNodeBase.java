// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.CommercialKitchenDeviceType;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.server.DeviceTypeNode;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.server.FunctionalGroupTypeNode;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
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
import com.prosysopc.ua.types.opcua.server.BaseObjectTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1005")
public abstract class CommercialKitchenDeviceTypeNodeBase extends DeviceTypeNode implements CommercialKitchenDeviceType {
  private static GeneratedNodeInitializer<CommercialKitchenDeviceTypeNode> f_commercialKitchenDeviceTypeNodeInitializer;

  protected CommercialKitchenDeviceTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getBatchInformationNode());
    callAfterCreateIfExists(getErrorConditionsNode());
    callAfterCreateIfExists(getHACCPValuesNode());
    callAfterCreateIfExists(getInformationConditionsNode());
    GeneratedNodeInitializer<CommercialKitchenDeviceTypeNode> impl = getCommercialKitchenDeviceTypeNodeInitializer();
    if(impl != null) {
      impl.init((CommercialKitchenDeviceTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<CommercialKitchenDeviceTypeNode> getCommercialKitchenDeviceTypeNodeInitializer() {
    return f_commercialKitchenDeviceTypeNodeInitializer;
  }

  public static void setCommercialKitchenDeviceTypeNodeInitializer(GeneratedNodeInitializer<CommercialKitchenDeviceTypeNode> f_commercialKitchenDeviceTypeNodeInitializerNewValue) {
    f_commercialKitchenDeviceTypeNodeInitializer=f_commercialKitchenDeviceTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getDeviceClassNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceClass");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getDeviceClass() {
    UaVariable node = getDeviceClassNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node DeviceClass does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setDeviceClass(String value) {
    UaVariable node = getDeviceClassNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceClass failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DeviceClass failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public UaProperty getDeviceLocationNameNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "DeviceLocationName");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getDeviceLocationName() {
    UaVariable node = getDeviceLocationNameNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setDeviceLocationName(String value) {
    UaVariable node = getDeviceLocationNameNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceLocationName failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DeviceLocationName failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BatchInformationTypeNode getBatchInformationNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "BatchInformation");
    return (BatchInformationTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public BaseObjectTypeNode getErrorConditionsNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ErrorConditions");
    return (BaseObjectTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public FunctionalGroupTypeNode getHACCPValuesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "HACCPValues");
    return (FunctionalGroupTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public BaseObjectTypeNode getInformationConditionsNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "InformationConditions");
    return (BaseObjectTypeNode) getComponent(browseName);
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
