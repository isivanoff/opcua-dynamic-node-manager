// Generated by Prosys OPC UA Java SDK Codegen
//
package com.connectedcooking.opcua.dynamicnodemanager.examples.prosys.opc30200.model.cke;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.stack.builtintypes.UnsignedLong;
import com.prosysopc.ua.types.opcua.AnalogItemType;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import java.lang.Float;
import java.lang.String;
import java.util.List;

/**
 * Generated on 2022-10-10 10:21:34
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/CommercialKitchenEquipment/;i=1022")
public interface CoffeeMachineParameterType extends KitchenDeviceParameterType {
  String BOILER_PRESSURE_STEAM = "BoilerPressureSteam";

  String BOILER_PRESSURE_WATER = "BoilerPressureWater";

  String BOILER_TEMP_STEAM = "BoilerTempSteam";

  String BOILER_TEMP_WATER = "BoilerTempWater";

  String CURRENT_STATE = "CurrentState";

  String GRINDER_RUNTIME___NO__ = "GrinderRuntime_<No.>";

  String SYSTEM_CLEAN = "SystemClean";

  String TOTAL_BREW___NO__ = "TotalBrew_<No.>";

  String TOTAL_MIX = "TotalMix";

  @Mandatory
  AnalogItemType getBoilerPressureSteamNode();

  @Mandatory
  Float getBoilerPressureSteam();

  @Mandatory
  void setBoilerPressureSteam(Float value) throws StatusException;

  @Mandatory
  AnalogItemType getBoilerPressureWaterNode();

  @Mandatory
  Float getBoilerPressureWater();

  @Mandatory
  void setBoilerPressureWater(Float value) throws StatusException;

  @Optional
  AnalogItemType getBoilerTempSteamNode();

  @Optional
  Float getBoilerTempSteam();

  @Optional
  void setBoilerTempSteam(Float value) throws StatusException;

  @Mandatory
  AnalogItemType getBoilerTempWaterNode();

  @Mandatory
  Float getBoilerTempWater();

  @Mandatory
  void setBoilerTempWater(Float value) throws StatusException;

  @Mandatory
  BaseDataVariableType getCurrentStateNode();

  @Mandatory
  CoffeeMachineModeEnumeration getCurrentState();

  @Mandatory
  void setCurrentState(CoffeeMachineModeEnumeration value) throws StatusException;

  List<? extends AnalogItemType> getGrinderRuntime__No__Nodes();

  @Mandatory
  BaseDataVariableType getSystemCleanNode();

  @Mandatory
  DateTime getSystemClean();

  @Mandatory
  void setSystemClean(DateTime value) throws StatusException;

  List<? extends BaseDataVariableType> getTotalBrew__No__Nodes();

  @Mandatory
  BaseDataVariableType getTotalMixNode();

  @Mandatory
  UnsignedLong getTotalMix();

  @Mandatory
  void setTotalMix(UnsignedLong value) throws StatusException;
}
