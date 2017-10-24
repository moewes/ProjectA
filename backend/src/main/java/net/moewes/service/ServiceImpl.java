package net.moewes.service;

import net.moewes.client.Service;
import net.moewes.client.ServiceData;

public class ServiceImpl implements Service {

  @Override
  public ServiceData getService() {

    ServiceData daten = new ServiceData();
    daten.setMessage("Hello from Backend");
    return daten;
  }
}
