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
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=3019")
public enum TrayModeEnumeration implements Enumeration {
  Off(0),

  PreHeat(1),

  PreCool(2),

  HoldWarm(3),

  HoldCool(4),

  Regenerating(5);

  public static final EnumerationSpecification SPECIFICATION;

  public static final EnumSet<TrayModeEnumeration> NONE = EnumSet.noneOf(TrayModeEnumeration.class);

  public static final EnumSet<TrayModeEnumeration> ALL = EnumSet.allOf(TrayModeEnumeration.class);

  private static final Map<Integer, TrayModeEnumeration> map;

  static {
    map = new HashMap<Integer,TrayModeEnumeration>();
    for (TrayModeEnumeration i : TrayModeEnumeration.values()) {
      map.put(i.value, i);
    }
    EnumerationSpecification.Builder b = EnumerationSpecification.builder();
    b.setName("TrayModeEnumeration");
    b.setJavaClass(TrayModeEnumeration.class);
    b.setTypeId(UaNodeId.fromLocal(ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=3019")));
    b.addMapping(0, "Off");
    b.addMapping(1, "PreHeat");
    b.addMapping(2, "PreCool");
    b.addMapping(3, "HoldWarm");
    b.addMapping(4, "HoldCool");
    b.addMapping(5, "Regenerating");
    b.setBuilderSupplier(new EnumerationSpecification.EnumerationBuilderSupplier() {
      @Override
      public Enumeration.Builder get() {
        return TrayModeEnumeration.builder();
      }
    });
    SPECIFICATION = b.build();
  }

  private final int value;

  TrayModeEnumeration(int value) {
    this.value = value;
  }

  @Override
  public EnumerationSpecification specification() {
    return SPECIFICATION;
  }

  public static TrayModeEnumeration valueOf(int value) {
    return map.get(value);
  }

  public static TrayModeEnumeration valueOf(Integer value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static TrayModeEnumeration valueOf(UnsignedInteger value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static TrayModeEnumeration[] valueOf(int[] value) {
    TrayModeEnumeration[] result = new TrayModeEnumeration[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static TrayModeEnumeration[] valueOf(Integer[] value) {
    TrayModeEnumeration[] result = new TrayModeEnumeration[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static TrayModeEnumeration[] valueOf(UnsignedInteger[] value) {
    TrayModeEnumeration[] result = new TrayModeEnumeration[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static UnsignedInteger getMask(TrayModeEnumeration... list) {
    int result = 0;
    for (TrayModeEnumeration c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static UnsignedInteger getMask(Collection<TrayModeEnumeration> list) {
    int result = 0;
    for (TrayModeEnumeration c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static EnumSet<TrayModeEnumeration> getSet(UnsignedInteger mask) {
    return getSet(mask.intValue());
  }

  public static EnumSet<TrayModeEnumeration> getSet(int mask) {
    List<TrayModeEnumeration> res = new ArrayList<TrayModeEnumeration>();
    for (TrayModeEnumeration l : TrayModeEnumeration.values()) {
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
    private TrayModeEnumeration value;

    private Builder() {
    }

    @Override
    public TrayModeEnumeration build() {
      return value;
    }

    @Override
    public Builder setValue(int value) {
      this.value=TrayModeEnumeration.valueOf(value);
      if (this.value == null) {
        throw new IllegalArgumentException("Unknown enum TrayModeEnumeration int value: " + value);
      }
      return this;
    }
  }
}
