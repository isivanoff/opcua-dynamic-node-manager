// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.MicrowaveCombiOvenParameterType;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.OperatingModeEnumeration;
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
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1033")
public abstract class MicrowaveCombiOvenParameterTypeNodeBase extends KitchenDeviceParameterTypeNode implements MicrowaveCombiOvenParameterType {
  private static GeneratedNodeInitializer<MicrowaveCombiOvenParameterTypeNode> f_microwaveCombiOvenParameterTypeNodeInitializer;

  protected MicrowaveCombiOvenParameterTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getActualTemperatureChamberNode());
    callAfterCreateIfExists(getCookingStepNode());
    callAfterCreateIfExists(getFanSpeedNode());
    callAfterCreateIfExists(getIsDoorOpenNode());
    callAfterCreateIfExists(getMicrowaveEnergyNode());
    callAfterCreateIfExists(getOperatingModeNode());
    callAfterCreateIfExists(getRemainingProcessTimeNode());
    callAfterCreateIfExists(getRemainingProcessTimeStepNode());
    callAfterCreateIfExists(getSetProcessTimeNode());
    callAfterCreateIfExists(getSetTemperatureNode());
    GeneratedNodeInitializer<MicrowaveCombiOvenParameterTypeNode> impl = getMicrowaveCombiOvenParameterTypeNodeInitializer();
    if(impl != null) {
      impl.init((MicrowaveCombiOvenParameterTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<MicrowaveCombiOvenParameterTypeNode> getMicrowaveCombiOvenParameterTypeNodeInitializer() {
    return f_microwaveCombiOvenParameterTypeNodeInitializer;
  }

  public static void setMicrowaveCombiOvenParameterTypeNodeInitializer(GeneratedNodeInitializer<MicrowaveCombiOvenParameterTypeNode> f_microwaveCombiOvenParameterTypeNodeInitializerNewValue) {
    f_microwaveCombiOvenParameterTypeNodeInitializer=f_microwaveCombiOvenParameterTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public AnalogItemTypeNode getActualTemperatureChamberNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ActualTemperatureChamber");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Float getActualTemperatureChamber() {
    UaVariable node = getActualTemperatureChamberNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ActualTemperatureChamber does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setActualTemperatureChamber(Float value) {
    UaVariable node = getActualTemperatureChamberNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualTemperatureChamber failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualTemperatureChamber failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getCookingStepNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "CookingStep");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public Integer getCookingStep() {
    UaVariable node = getCookingStepNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Optional
  @Override
  public void setCookingStep(Integer value) {
    UaVariable node = getCookingStepNode();
    if (node == null) {
      throw new RuntimeException("Setting CookingStep failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting CookingStep failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public AnalogItemTypeNode getFanSpeedNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "FanSpeed");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public Integer getFanSpeed() {
    UaVariable node = getFanSpeedNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Optional
  @Override
  public void setFanSpeed(Integer value) {
    UaVariable node = getFanSpeedNode();
    if (node == null) {
      throw new RuntimeException("Setting FanSpeed failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting FanSpeed failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getIsDoorOpenNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "IsDoorOpen");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Boolean isIsDoorOpen() {
    UaVariable node = getIsDoorOpenNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node IsDoorOpen does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Boolean) value;
  }

  @Mandatory
  @Override
  public void setIsDoorOpen(Boolean value) {
    UaVariable node = getIsDoorOpenNode();
    if (node == null) {
      throw new RuntimeException("Setting IsDoorOpen failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting IsDoorOpen failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public AnalogItemTypeNode getMicrowaveEnergyNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "MicrowaveEnergy");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public Integer getMicrowaveEnergy() {
    UaVariable node = getMicrowaveEnergyNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Optional
  @Override
  public void setMicrowaveEnergy(Integer value) {
    UaVariable node = getMicrowaveEnergyNode();
    if (node == null) {
      throw new RuntimeException("Setting MicrowaveEnergy failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting MicrowaveEnergy failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getOperatingModeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "OperatingMode");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public OperatingModeEnumeration getOperatingMode() {
    UaVariable node = getOperatingModeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node OperatingMode does not exist");
    }
    Variant value = node.getValue().getValue();
    return (OperatingModeEnumeration) value.asEnum(OperatingModeEnumeration.class);
  }

  @Mandatory
  @Override
  public void setOperatingMode(OperatingModeEnumeration value) {
    UaVariable node = getOperatingModeNode();
    if (node == null) {
      throw new RuntimeException("Setting OperatingMode failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting OperatingMode failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public AnalogItemTypeNode getRemainingProcessTimeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "RemainingProcessTime");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Integer getRemainingProcessTime() {
    UaVariable node = getRemainingProcessTimeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node RemainingProcessTime does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Mandatory
  @Override
  public void setRemainingProcessTime(Integer value) {
    UaVariable node = getRemainingProcessTimeNode();
    if (node == null) {
      throw new RuntimeException("Setting RemainingProcessTime failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting RemainingProcessTime failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public AnalogItemTypeNode getRemainingProcessTimeStepNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "RemainingProcessTimeStep");
    return (AnalogItemTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public Integer getRemainingProcessTimeStep() {
    UaVariable node = getRemainingProcessTimeStepNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Optional
  @Override
  public void setRemainingProcessTimeStep(Integer value) {
    UaVariable node = getRemainingProcessTimeStepNode();
    if (node == null) {
      throw new RuntimeException("Setting RemainingProcessTimeStep failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting RemainingProcessTimeStep failed unexpectedly", e);
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

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
