// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import java.lang.Boolean;
import java.lang.String;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1017")
public interface CookingKettleDeviceType extends CommercialKitchenDeviceType {
  String ENERGY_SOURCE = "EnergySource";

  String IS_WITH_AGITATOR = "IsWithAgitator";

  String IS_WITH_COOLING = "IsWithCooling";

  String COOKING_KETTLE = "CookingKettle";

  @Mandatory
  UaProperty getEnergySourceNode();

  @Mandatory
  EnergySourceEnumeration getEnergySource();

  @Mandatory
  void setEnergySource(EnergySourceEnumeration value) throws StatusException;

  @Mandatory
  UaProperty getIsWithAgitatorNode();

  @Mandatory
  Boolean isIsWithAgitator();

  @Mandatory
  void setIsWithAgitator(Boolean value) throws StatusException;

  @Mandatory
  UaProperty getIsWithCoolingNode();

  @Mandatory
  Boolean isIsWithCooling();

  @Mandatory
  void setIsWithCooling(Boolean value) throws StatusException;

  @Mandatory
  CookingKettleParameterType getCookingKettleNode();
}
