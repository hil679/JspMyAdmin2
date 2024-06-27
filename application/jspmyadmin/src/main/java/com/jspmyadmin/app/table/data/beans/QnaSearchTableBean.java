package com.jspmyadmin.app.table.data.beans;

import com.jspmyadmin.framework.constants.Constants;
import com.jspmyadmin.framework.web.utils.Bean;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

public class QnaSearchTableBean extends TableBean {

    private String customer_name = "Show All";
    private String status = "Show All";

//    Map<String, String> searchColumns = new LinkedHashMap<>();
//    Map<String, String> selectedValues = new LinkedHashMap<>();

    private List<String> customer_list =  Collections.synchronizedList(new ArrayList<String>());
    List<String> status_list = new ArrayList<String>(Constants.Utils.STATUS_LIST);


    public QnaSearchTableBean() {
        searchColumns.put("Customer", "customer_name");
        searchColumns.put("Status", "status");
        selectedValues.put("customer_name", customer_name);
        selectedValues.put("status", status);
        valueLists.put("customer_name", customer_list);
        valueLists.put("status", status_list);
    }

    /**
     * @return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name
     *            the customer to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
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
    public void setTableBeanField(JSONObject selectedTableBeanJson) throws JSONException {
        customer_name = selectedTableBeanJson.getString("customer_name");
        status = selectedTableBeanJson.getString("status");
    }


    @Override
    public Map<String, String> getSearchColumns() {
        return searchColumns;
    }

    @Override
    public void setList(String column, ArrayList<String> colValues) {
        if (column.equals("customer_name")) {
            setCustomer_list(colValues);
            valueLists.put("customer_name", colValues);
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

    @Override
    public Map<String, List<String>> getValueLists() {
        return valueLists;
    }
}
