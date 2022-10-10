// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.FryerModeEnumeration;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.FryerParameterType;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.SignalModeEnumeration;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
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
import com.prosysopc.ua.types.opcua.server.AnalogItemTypeNode;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1006")
public abstract class FryerParameterTypeNodeBase extends KitchenDeviceParameterTypeNode implements FryerParameterType {
  private static GeneratedNodeInitializer<FryerParameterTypeNode> f_fryerParameterTypeNodeInitializer;

  protected FryerParameterTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getActualTemperatureNode());
    callAfterCreateIfExists(getIsLiftUpNode());
    callAfterCreateIfExists(getProgramModeNode());
    callAfterCreateIfExists(getSetProcessTimeNode());
    callAfterCreateIfExists(getSetTemperatureNode());
    callAfterCreateIfExists(getSignalModeNode());
    callAfterCreateIfExists(getTimeRemainingNode());
    GeneratedNodeInitializer<FryerParameterTypeNode> impl = getFryerParameterTypeNodeInitializer();
    if(impl != null) {
      impl.init((FryerParameterTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<FryerParameterTypeNode> getFryerParameterTypeNodeInitializer() {
    return f_fryerParameterTypeNodeInitializer;
  }

  public static void setFryerParameterTypeNodeInitializer(GeneratedNodeInitializer<FryerParameterTypeNode> f_fryerParameterTypeNodeInitializerNewValue) {
    f_fryerParameterTypeNodeInitializer=f_fryerParameterTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public AnalogItemTypeNode getActualTemperatureNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ActualTemperature");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Float getActualTemperature() {
    UaVariable node = getActualTemperatureNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ActualTemperature does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setActualTemperature(Float value) {
    UaVariable node = getActualTemperatureNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualTemperature failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualTemperature failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getIsLiftUpNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "IsLiftUp");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public Boolean isIsLiftUp() {
    UaVariable node = getIsLiftUpNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Boolean) value;
  }

  @Optional
  @Override
  public void setIsLiftUp(Boolean value) {
    UaVariable node = getIsLiftUpNode();
    if (node == null) {
      throw new RuntimeException("Setting IsLiftUp failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting IsLiftUp failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getProgramModeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ProgramMode");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public FryerModeEnumeration getProgramMode() {
    UaVariable node = getProgramModeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ProgramMode does not exist");
    }
    Variant value = node.getValue().getValue();
    return (FryerModeEnumeration) value.asEnum(FryerModeEnumeration.class);
  }

  @Mandatory
  @Override
  public void setProgramMode(FryerModeEnumeration value) {
    UaVariable node = getProgramModeNode();
    if (node == null) {
      throw new RuntimeException("Setting ProgramMode failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ProgramMode failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public AnalogItemTypeNode getSetProcessTimeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "SetProcessTime");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Integer getSetProcessTime() {
    UaVariable node = getSetProcessTimeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node SetProcessTime does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Mandatory
  @Override
  public void setSetProcessTime(Integer value) {
    UaVariable node = getSetProcessTimeNode();
    if (node == null) {
      throw new RuntimeException("Setting SetProcessTime failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SetProcessTime failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public AnalogItemTypeNode getSetTemperatureNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "SetTemperature");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Float getSetTemperature() {
    UaVariable node = getSetTemperatureNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node SetTemperature does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setSetTemperature(Float value) {
    UaVariable node = getSetTemperatureNode();
    if (node == null) {
      throw new RuntimeException("Setting SetTemperature failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SetTemperature failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getSignalModeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "SignalMode");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public SignalModeEnumeration getSignalMode() {
    UaVariable node = getSignalModeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node SignalMode does not exist");
    }
    Variant value = node.getValue().getValue();
    return (SignalModeEnumeration) value.asEnum(SignalModeEnumeration.class);
  }

  @Mandatory
  @Override
  public void setSignalMode(SignalModeEnumeration value) {
    UaVariable node = getSignalModeNode();
    if (node == null) {
      throw new RuntimeException("Setting SignalMode failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SignalMode failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public AnalogItemTypeNode getTimeRemainingNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "TimeRemaining");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Integer getTimeRemaining() {
    UaVariable node = getTimeRemainingNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node TimeRemaining does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Mandatory
  @Override
  public void setTimeRemaining(Integer value) {
    UaVariable node = getTimeRemainingNode();
    if (node == null) {
      throw new RuntimeException("Setting TimeRemaining failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting TimeRemaining failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
