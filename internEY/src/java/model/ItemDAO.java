/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Nagarajan
 */
public interface ItemDAO {
    
    public ArrayList<ItemDTO> getByCatagory(String catagory, Properties prop);
    public ItemDTO getByName(String name, Properties prop);
    public void insertItem(ItemDTO id);
    public void deleteItem(String name);
    public void updateItem(String name);
    
}
