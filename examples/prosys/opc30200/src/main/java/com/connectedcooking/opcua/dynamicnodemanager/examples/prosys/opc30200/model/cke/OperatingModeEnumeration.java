// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.UaNodeId;
import com.prosysopc.ua.stack.builtintypes.Enumeration;
import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.typedictionary.EnumerationSpecification;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Override;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=3023")
public enum OperatingModeEnumeration implements Enumeration {
  Preheat(0),

  CoolDown(1),

  Process(2),

  PowerSaving(3),

  Standby(4),

  Service(5),

  Cleaning(6),

  Off(7),

  Error(8);

  public static final EnumerationSpecification SPECIFICATION;

  public static final EnumSet<OperatingModeEnumeration> NONE = EnumSet.noneOf(OperatingModeEnumeration.class);

  public static final EnumSet<OperatingModeEnumeration> ALL = EnumSet.allOf(OperatingModeEnumeration.class);

  private static final Map<Integer, OperatingModeEnumeration> map;

  static {
    map = new HashMap<Integer,OperatingModeEnumeration>();
    for (OperatingModeEnumeration i : OperatingModeEnumeration.values()) {
      map.put(i.value, i);
    }
    EnumerationSpecification.Builder b = EnumerationSpecification.builder();
    b.setName("OperatingModeEnumeration");
    b.setJavaClass(OperatingModeEnumeration.class);
    b.setTypeId(UaNodeId.fromLocal(ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=3023")));
    b.addMapping(0, "Preheat");
    b.addMapping(1, "CoolDown");
    b.addMapping(2, "Process");
    b.addMapping(3, "PowerSaving");
    b.addMapping(4, "Standby");
    b.addMapping(5, "Service");
    b.addMapping(6, "Cleaning");
    b.addMapping(7, "Off");
    b.addMapping(8, "Error");
    b.setBuilderSupplier(new EnumerationSpecification.EnumerationBuilderSupplier() {
      @Override
      public Enumeration.Builder get() {
        return OperatingModeEnumeration.builder();
      }
    });
    SPECIFICATION = b.build();
  }

  private final int value;

  OperatingModeEnumeration(int value) {
    this.value = value;
  }

  @Override
  public EnumerationSpecification specification() {
    return SPECIFICATION;
  }

  public static OperatingModeEnumeration valueOf(int value) {
    return map.get(value);
  }

  public static OperatingModeEnumeration valueOf(Integer value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static OperatingModeEnumeration valueOf(UnsignedInteger value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static OperatingModeEnumeration[] valueOf(int[] value) {
    OperatingModeEnumeration[] result = new OperatingModeEnumeration[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static OperatingModeEnumeration[] valueOf(Integer[] value) {
    OperatingModeEnumeration[] result = new OperatingModeEnumeration[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static OperatingModeEnumeration[] valueOf(UnsignedInteger[] value) {
    OperatingModeEnumeration[] result = new OperatingModeEnumeration[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static UnsignedInteger getMask(OperatingModeEnumeration... list) {
    int result = 0;
    for (OperatingModeEnumeration c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static UnsignedInteger getMask(Collection<OperatingModeEnumeration> list) {
    int result = 0;
    for (OperatingModeEnumeration c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static EnumSet<OperatingModeEnumeration> getSet(UnsignedInteger mask) {
    return getSet(mask.intValue());
  }

  public static EnumSet<OperatingModeEnumeration> getSet(int mask) {
    List<OperatingModeEnumeration> res = new ArrayList<OperatingModeEnumeration>();
    for (OperatingModeEnumeration l : OperatingModeEnumeration.values()) {
      if ((mask & l.value) == l.value) {
        res.add(l);
      }
    }
    return EnumSet.copyOf(res);
  }

  @Override
  public int getValue() {
    return value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public Builder toBuilder() {
    Builder b = builder();
    b.setValue(this.getValue());
    return b;
  }

  public static class Builder implements Enumeration.Builder {
    private OperatingModeEnumeration value;

    private Builder() {
    }

    @Override
    public OperatingModeEnumeration build() {
      return value;
    }

    @Override
    public Builder setValue(int value) {
      this.value=OperatingModeEnumeration.valueOf(value);
      if (this.value == null) {
        throw new IllegalArgumentException("Unknown enum OperatingModeEnumeration int value: " + value);
      }
      return this;
    }
  }
}
