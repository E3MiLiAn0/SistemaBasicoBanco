package dao;

import modelo.Cliente;

public interface IPersonaDao  <T>{
    public void insertObject(T obj);
    public void update(T obj);
    public boolean delete(int dni);


}