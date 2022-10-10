// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import java.lang.String;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1032")
public interface FryingAndGrillingDeviceType extends CommercialKitchenDeviceType {
  String ENERGY_SOURCE = "EnergySource";

  String GRILLING_ZONE___NO__ = "GrillingZone_<No.>";

  @Mandatory
  UaProperty getEnergySourceNode();

  @Mandatory
  EnergySourceEnumeration getEnergySource();

  @Mandatory
  void setEnergySource(EnergySourceEnumeration value) throws StatusException;
}
