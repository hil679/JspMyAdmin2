package com.jspmyadmin.app.table.data.beans;

import com.jspmyadmin.framework.constants.Constants;
import com.jspmyadmin.framework.web.utils.Bean;

import java.util.*;

public class QnaSearchTableBean extends TableBean {

    private String customer = "Show All";
    private String status = "Show All";

//    Map<String, String> searchColumns = new LinkedHashMap<>();
//    Map<String, String> selectedValues = new LinkedHashMap<>();

    private List<String> customer_list =  Collections.synchronizedList(new ArrayList<String>());
    List<String> status_list = new ArrayList<String>(Constants.Utils.STATUS_LIST);


    public QnaSearchTableBean() {
        searchColumns.put("Customer", "customer_name");
        searchColumns.put("Status", "status");
        selectedValues.put("customer", customer);
        selectedValues.put("status", status);
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer
     *            the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the customer_list
     */
    public List<String> getCustomer_list() {
        return customer_list;
    }

    /**
     * @param customer_list
     *            the customer_list to set
     */
    public void setCustomer_list(List<String> customer_list) {
        this.customer_list = customer_list;
    }

    /**
     * @return the customer
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     *            the customer to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the status_list
     */
    public List<String> getStatus_list() {
        return status_list;
    }

    /**
     * @param status_list
     *            the customer_list to set
     */
    public void setStatus_list(List<String> status_list) {
        this.status_list = status_list;
    }

    @Override
    public Map<String, String> getSelectedValues() {
        return selectedValues;
    }

    @Override
    public void setSelectedValues(Map<String, String> selectedValues) {
        this.selectedValues = selectedValues;
    }


    @Override
    public Map<String, String> getSearchColumns() {
        return searchColumns;
    }

    @Override
    public void setList(String column, ArrayList<String> colValues) {
        if (column.equals("customer_name")) {
            setCustomer_list(colValues);
        } else if (column.equals("status")) {

        }
    }

    @Override
    public List<String> getList(String column) {
        if (column.equals("customer_name")) {
            return customer_list;
        } else if (column.equals("status")) {
            return status_list;
        }
        return null;
    }



    @Override
    public ArrayList<String> getSelectColumn() {
        return new ArrayList<>(Arrays.asList("customer_name", "status"));
    }
}
