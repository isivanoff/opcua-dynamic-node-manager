// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.AnalogItemType;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1029")
public interface CookingZoneParameterType extends KitchenDeviceParameterType {
  String ACTUAL_POWER = "ActualPower";

  String ACTUAL_PROCESS_TIME = "ActualProcessTime";

  String ACTUAL_TEMPERATURE = "ActualTemperature";

  String COOKING_ZONE_NAME = "CookingZoneName";

  String CURRENT_STATE = "CurrentState";

  String IS_PAN_DETECTED = "IsPanDetected";

  String NOMINAL_POWER = "NominalPower";

  String SET_POWER_VALUE = "SetPowerValue";

  String SET_TEMPERATURE = "SetTemperature";

  @Optional
  AnalogItemType getActualPowerNode();

  @Optional
  Float getActualPower();

  @Optional
  void setActualPower(Float value) throws StatusException;

  @Optional
  AnalogItemType getActualProcessTimeNode();

  @Optional
  Integer getActualProcessTime();

  @Optional
  void setActualProcessTime(Integer value) throws StatusException;

  @Optional
  AnalogItemType getActualTemperatureNode();

  @Optional
  Float getActualTemperature();

  @Optional
  void setActualTemperature(Float value) throws StatusException;

  @Optional
  BaseDataVariableType getCookingZoneNameNode();

  @Optional
  String getCookingZoneName();

  @Optional
  void setCookingZoneName(String value) throws StatusException;

  @Optional
  BaseDataVariableType getCurrentStateNode();

  @Optional
  CurrentStateEnumeration getCurrentState();

  @Optional
  void setCurrentState(CurrentStateEnumeration value) throws StatusException;

  @Optional
  BaseDataVariableType getIsPanDetectedNode();

  @Optional
  Boolean isIsPanDetected();

  @Optional
  void setIsPanDetected(Boolean value) throws StatusException;

  @Mandatory
  AnalogItemType getNominalPowerNode();

  @Mandatory
  Integer getNominalPower();

  @Mandatory
  void setNominalPower(Integer value) throws StatusException;

  @Optional
  AnalogItemType getSetPowerValueNode();

  @Optional
  Integer getSetPowerValue();

  @Optional
  void setSetPowerValue(Integer value) throws StatusException;

  @Optional
  AnalogItemType getSetTemperatureNode();

  @Optional
  Float getSetTemperature();

  @Optional
  void setSetTemperature(Float value) throws StatusException;
}
