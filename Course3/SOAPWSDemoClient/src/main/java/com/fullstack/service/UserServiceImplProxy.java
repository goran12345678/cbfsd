package com.fullstack.service;

public class UserServiceImplProxy implements com.fullstack.service.UserServiceImpl {
  private String _endpoint = null;
  private com.fullstack.service.UserServiceImpl userServiceImpl = null;
  
  public UserServiceImplProxy() {
    _initUserServiceImplProxy();
  }
  
  public UserServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceImplProxy();
  }
  
  private void _initUserServiceImplProxy() {
    try {
      userServiceImpl = (new com.fullstack.service.UserServiceImplServiceLocator()).getUserServiceImpl();
      if (userServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userServiceImpl != null)
      ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fullstack.service.UserServiceImpl getUserServiceImpl() {
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl;
  }
  
  public com.fullstack.model.User[] getUsers() throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.getUsers();
  }
  
  public com.fullstack.model.User getUser(long userId) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.getUser(userId);
  }
  
  public boolean registerUser(com.fullstack.model.User user) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.registerUser(user);
  }
  
  public boolean loginUser(com.fullstack.model.User user) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.loginUser(user);
  }
  
  public boolean deleteUser(long userId) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.deleteUser(userId);
  }
  
  public boolean updateUser(com.fullstack.model.User user) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.updateUser(user);
  }
  
  
}