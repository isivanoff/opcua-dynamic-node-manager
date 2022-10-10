// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.DishWashingMachineProgramParameterType;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.HygieneModeEnumeration;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.OperationModeEnumeration;
import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke.ProgramModeEnumeration;
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
import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.stack.builtintypes.UnsignedShort;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.opcua.AnalogItemType;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.List;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1025")
public abstract class DishWashingMachineProgramParameterTypeNodeBase extends KitchenDeviceParameterTypeNode implements DishWashingMachineProgramParameterType {
  private static GeneratedNodeInitializer<DishWashingMachineProgramParameterTypeNode> f_dishWashingMachineProgramParameterTypeNodeInitializer;

  protected DishWashingMachineProgramParameterTypeNodeBase(NodeManagerUaNode nodeManager,
      NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getActualFinalRinseTemperatureNoNode());
    callAfterCreateIfExists(getActualHygieneValueNode());
    callAfterCreateIfExists(getActualMainTankTemperatureNoNode());
    callAfterCreateIfExists(getActualPreTankTemperatureNoNode());
    callAfterCreateIfExists(getActualPumpedFinalRinseTemperatureNoNode());
    callAfterCreateIfExists(getFinalRinseTemperatureSetpointNoNode());
    callAfterCreateIfExists(getHygieneModeNode());
    callAfterCreateIfExists(getHygieneSetpointNode());
    callAfterCreateIfExists(getMainTankTemperatureSetpointNoNode());
    callAfterCreateIfExists(getOperationModeNode());
    callAfterCreateIfExists(getPreTankTemperatureSetpointNoNode());
    callAfterCreateIfExists(getProgramModeNode());
    callAfterCreateIfExists(getPumpedFinalRinseTemperatureSetpointNoNode());
    GeneratedNodeInitializer<DishWashingMachineProgramParameterTypeNode> impl = getDishWashingMachineProgramParameterTypeNodeInitializer();
    if(impl != null) {
      impl.init((DishWashingMachineProgramParameterTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<DishWashingMachineProgramParameterTypeNode> getDishWashingMachineProgramParameterTypeNodeInitializer() {
    return f_dishWashingMachineProgramParameterTypeNodeInitializer;
  }

  public static void setDishWashingMachineProgramParameterTypeNodeInitializer(GeneratedNodeInitializer<DishWashingMachineProgramParameterTypeNode> f_dishWashingMachineProgramParameterTypeNodeInitializerNewValue) {
    f_dishWashingMachineProgramParameterTypeNodeInitializer=f_dishWashingMachineProgramParameterTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public UaProperty getProductGroupNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ProductGroup");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getProductGroup() {
    UaVariable node = getProductGroupNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setProductGroup(String value) {
    UaVariable node = getProductGroupNode();
    if (node == null) {
      throw new RuntimeException("Setting ProductGroup failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ProductGroup failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public UaProperty getProductTypeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ProductType");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public UnsignedInteger getProductType() {
    UaVariable node = getProductTypeNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Optional
  @Override
  public void setProductType(UnsignedInteger value) {
    UaVariable node = getProductTypeNode();
    if (node == null) {
      throw new RuntimeException("Setting ProductType failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ProductType failed unexpectedly", e);
    }
  }

  public void setProductType(long value) {
    setProductType(UnsignedInteger.valueOf(value));
  }

  public List<? extends AnalogItemType> getActualFinalRinseTemperature__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6470");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getActualFinalRinseTemperatureNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ActualFinalRinseTemperatureNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getActualFinalRinseTemperatureNo() {
    UaVariable node = getActualFinalRinseTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ActualFinalRinseTemperatureNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setActualFinalRinseTemperatureNo(UnsignedShort value) {
    UaVariable node = getActualFinalRinseTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualFinalRinseTemperatureNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualFinalRinseTemperatureNo failed unexpectedly", e);
    }
  }

  public void setActualFinalRinseTemperatureNo(int value) {
    setActualFinalRinseTemperatureNo(UnsignedShort.valueOf(value));
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getActualHygieneValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ActualHygieneValue");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public UnsignedShort getActualHygieneValue() {
    UaVariable node = getActualHygieneValueNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Optional
  @Override
  public void setActualHygieneValue(UnsignedShort value) {
    UaVariable node = getActualHygieneValueNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualHygieneValue failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualHygieneValue failed unexpectedly", e);
    }
  }

  public void setActualHygieneValue(int value) {
    setActualHygieneValue(UnsignedShort.valueOf(value));
  }

  public List<? extends AnalogItemType> getActualMainTankTemperature__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6464");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getActualMainTankTemperatureNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ActualMainTankTemperatureNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getActualMainTankTemperatureNo() {
    UaVariable node = getActualMainTankTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ActualMainTankTemperatureNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setActualMainTankTemperatureNo(UnsignedShort value) {
    UaVariable node = getActualMainTankTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualMainTankTemperatureNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualMainTankTemperatureNo failed unexpectedly", e);
    }
  }

  public void setActualMainTankTemperatureNo(int value) {
    setActualMainTankTemperatureNo(UnsignedShort.valueOf(value));
  }

  public List<? extends AnalogItemType> getActualPreTankTemperature__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6461");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getActualPreTankTemperatureNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ActualPreTankTemperatureNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getActualPreTankTemperatureNo() {
    UaVariable node = getActualPreTankTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ActualPreTankTemperatureNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setActualPreTankTemperatureNo(UnsignedShort value) {
    UaVariable node = getActualPreTankTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualPreTankTemperatureNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualPreTankTemperatureNo failed unexpectedly", e);
    }
  }

  public void setActualPreTankTemperatureNo(int value) {
    setActualPreTankTemperatureNo(UnsignedShort.valueOf(value));
  }

  public List<? extends AnalogItemType> getActualPumpedFinalRinseTemperature__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6467");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getActualPumpedFinalRinseTemperatureNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ActualPumpedFinalRinseTemperatureNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getActualPumpedFinalRinseTemperatureNo() {
    UaVariable node = getActualPumpedFinalRinseTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ActualPumpedFinalRinseTemperatureNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setActualPumpedFinalRinseTemperatureNo(UnsignedShort value) {
    UaVariable node = getActualPumpedFinalRinseTemperatureNoNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualPumpedFinalRinseTemperatureNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualPumpedFinalRinseTemperatureNo failed unexpectedly", e);
    }
  }

  public void setActualPumpedFinalRinseTemperatureNo(int value) {
    setActualPumpedFinalRinseTemperatureNo(UnsignedShort.valueOf(value));
  }

  public List<? extends AnalogItemType> getFinalRinseTemperatureSetpoint__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6458");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getFinalRinseTemperatureSetpointNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "FinalRinseTemperatureSetpointNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getFinalRinseTemperatureSetpointNo() {
    UaVariable node = getFinalRinseTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node FinalRinseTemperatureSetpointNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setFinalRinseTemperatureSetpointNo(UnsignedShort value) {
    UaVariable node = getFinalRinseTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Setting FinalRinseTemperatureSetpointNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting FinalRinseTemperatureSetpointNo failed unexpectedly", e);
    }
  }

  public void setFinalRinseTemperatureSetpointNo(int value) {
    setFinalRinseTemperatureSetpointNo(UnsignedShort.valueOf(value));
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getHygieneModeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "HygieneMode");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public HygieneModeEnumeration getHygieneMode() {
    UaVariable node = getHygieneModeNode();
    if (node == null) {
      return null;
    }
    Variant value = node.getValue().getValue();
    return (HygieneModeEnumeration) value.asEnum(HygieneModeEnumeration.class);
  }

  @Optional
  @Override
  public void setHygieneMode(HygieneModeEnumeration value) {
    UaVariable node = getHygieneModeNode();
    if (node == null) {
      throw new RuntimeException("Setting HygieneMode failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting HygieneMode failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getHygieneSetpointNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "HygieneSetpoint");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public UnsignedShort getHygieneSetpoint() {
    UaVariable node = getHygieneSetpointNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Optional
  @Override
  public void setHygieneSetpoint(UnsignedShort value) {
    UaVariable node = getHygieneSetpointNode();
    if (node == null) {
      throw new RuntimeException("Setting HygieneSetpoint failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting HygieneSetpoint failed unexpectedly", e);
    }
  }

  public void setHygieneSetpoint(int value) {
    setHygieneSetpoint(UnsignedShort.valueOf(value));
  }

  public List<? extends AnalogItemType> getMainTankTemperatureSetpoint__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6452");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getMainTankTemperatureSetpointNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "MainTankTemperatureSetpointNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getMainTankTemperatureSetpointNo() {
    UaVariable node = getMainTankTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node MainTankTemperatureSetpointNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setMainTankTemperatureSetpointNo(UnsignedShort value) {
    UaVariable node = getMainTankTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Setting MainTankTemperatureSetpointNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting MainTankTemperatureSetpointNo failed unexpectedly", e);
    }
  }

  public void setMainTankTemperatureSetpointNo(int value) {
    setMainTankTemperatureSetpointNo(UnsignedShort.valueOf(value));
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getOperationModeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "OperationMode");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public OperationModeEnumeration getOperationMode() {
    UaVariable node = getOperationModeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node OperationMode does not exist");
    }
    Variant value = node.getValue().getValue();
    return (OperationModeEnumeration) value.asEnum(OperationModeEnumeration.class);
  }

  @Mandatory
  @Override
  public void setOperationMode(OperationModeEnumeration value) {
    UaVariable node = getOperationModeNode();
    if (node == null) {
      throw new RuntimeException("Setting OperationMode failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting OperationMode failed unexpectedly", e);
    }
  }

  public List<? extends AnalogItemType> getPreTankTemperatureSetpoint__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6449");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getPreTankTemperatureSetpointNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "PreTankTemperatureSetpointNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getPreTankTemperatureSetpointNo() {
    UaVariable node = getPreTankTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node PreTankTemperatureSetpointNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setPreTankTemperatureSetpointNo(UnsignedShort value) {
    UaVariable node = getPreTankTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Setting PreTankTemperatureSetpointNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting PreTankTemperatureSetpointNo failed unexpectedly", e);
    }
  }

  public void setPreTankTemperatureSetpointNo(int value) {
    setPreTankTemperatureSetpointNo(UnsignedShort.valueOf(value));
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getProgramModeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "ProgramMode");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public ProgramModeEnumeration getProgramMode() {
    UaVariable node = getProgramModeNode();
    if (node == null) {
      return null;
    }
    Variant value = node.getValue().getValue();
    return (ProgramModeEnumeration) value.asEnum(ProgramModeEnumeration.class);
  }

  @Optional
  @Override
  public void setProgramMode(ProgramModeEnumeration value) {
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

  public List<? extends AnalogItemType> getPumpedFinalRinseTemperatureSetpoint__No__Nodes() {
    ExpandedNodeId placheholderId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=6455");
    ExpandedNodeId referenceTypeId = ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/;i=47");
    return findPlaceholders(AnalogItemType.class, placheholderId, referenceTypeId);
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getPumpedFinalRinseTemperatureSetpointNoNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/CommercialKitchenEquipment/", "PumpedFinalRinseTemperatureSetpointNo");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedShort getPumpedFinalRinseTemperatureSetpointNo() {
    UaVariable node = getPumpedFinalRinseTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node PumpedFinalRinseTemperatureSetpointNo does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedShort) value;
  }

  @Mandatory
  @Override
  public void setPumpedFinalRinseTemperatureSetpointNo(UnsignedShort value) {
    UaVariable node = getPumpedFinalRinseTemperatureSetpointNoNode();
    if (node == null) {
      throw new RuntimeException("Setting PumpedFinalRinseTemperatureSetpointNo failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting PumpedFinalRinseTemperatureSetpointNo failed unexpectedly", e);
    }
  }

  public void setPumpedFinalRinseTemperatureSetpointNo(int value) {
    setPumpedFinalRinseTemperatureSetpointNo(UnsignedShort.valueOf(value));
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
