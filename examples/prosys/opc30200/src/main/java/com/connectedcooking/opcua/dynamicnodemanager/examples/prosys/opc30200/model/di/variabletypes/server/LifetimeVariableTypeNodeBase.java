// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.variabletypes.server;

import com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.di.variabletypes.LifetimeVariableType;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaNode;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.server.AnalogUnitTypeNode;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Remaining lifetime
 * <p>
 * Generated on 2023-09-26 10:56:50
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=468")
public abstract class LifetimeVariableTypeNodeBase extends AnalogUnitTypeNode implements LifetimeVariableType {
  private static GeneratedNodeInitializer<LifetimeVariableTypeNode> f_lifetimeVariableTypeNodeInitializer;

  protected LifetimeVariableTypeNodeBase(UaNode.Parameters parameters) {
    super(parameters);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<LifetimeVariableTypeNode> impl = getLifetimeVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((LifetimeVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<LifetimeVariableTypeNode> getLifetimeVariableTypeNodeInitializer() {
    return f_lifetimeVariableTypeNodeInitializer;
  }

  public static void setLifetimeVariableTypeNodeInitializer(GeneratedNodeInitializer<LifetimeVariableTypeNode> f_lifetimeVariableTypeNodeInitializerNewValue) {
    f_lifetimeVariableTypeNodeInitializer=f_lifetimeVariableTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getStartValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "StartValue");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public Number getStartValue() {
    UaVariable node = getStartValueNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node StartValue does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Number) value;
  }

  @Mandatory
  @Override
  public void setStartValue(Number value) {
    UaVariable node = getStartValueNode();
    if (node == null) {
      throw new RuntimeException("Setting StartValue failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting StartValue failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public UaProperty getLimitValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "LimitValue");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public Number getLimitValue() {
    UaVariable node = getLimitValueNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node LimitValue does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Number) value;
  }

  @Mandatory
  @Override
  public void setLimitValue(Number value) {
    UaVariable node = getLimitValueNode();
    if (node == null) {
      throw new RuntimeException("Setting LimitValue failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting LimitValue failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public UaProperty getIndicationNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Indication");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public NodeId getIndication() {
    UaVariable node = getIndicationNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (NodeId) value;
  }

  @Optional
  @Override
  public void setIndication(NodeId value) {
    UaVariable node = getIndicationNode();
    if (node == null) {
      throw new RuntimeException("Setting Indication failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting Indication failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public UaProperty getWarningValuesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "WarningValues");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public Object getWarningValues() {
    UaVariable node = getWarningValuesNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Optional
  @Override
  public void setWarningValues(Object value) {
    UaVariable node = getWarningValuesNode();
    if (node == null) {
      throw new RuntimeException("Setting WarningValues failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting WarningValues failed unexpectedly", e);
    }
  }
}
