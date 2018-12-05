/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//import Business.Airline.AirlineDirectory;
//import Business.Airline.Airline;

import Business.Supplier.Product;
import Business.Airline.Flight;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author raoyuhuizi
 */

public class EnterpriseDataStore {
    private List<String> countryList;
    private List<Product> proList;
    private List<Flight> fliList;
//    private ArrayList<Airline> airList;
//    private ArrayList<Supplier> supList;
    
    public EnterpriseDataStore(){
        countryList = new ArrayList<>();
        proList = new ArrayList<>();
        fliList=new ArrayList<>();
//        airList=new ArrayList<>();
//        supList= new ArrayList<>();
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }
    public List<Product> getProList() {
        return proList;
    }

    public void setProList(List<Product> proList) {
        this.proList = proList;
    }
    
    

//    public ArrayList<Airline> getAirList() {
//        return airList;
//    }
//
//    public void setAirList(ArrayList<Airline> airList) {
//        this.airList = airList;
//    }

//    public ArrayList<Supplier> getSupList() {
//        return supList;
//    }
//
//    public void setSupList(ArrayList<Supplier> supList) {
//        this.supList = supList;
//    }

    public List<Flight> getFliList() {
        return fliList;
    }

    public void setFliList(List<Flight> fliList) {
        this.fliList = fliList;
    }
    
    
    
}