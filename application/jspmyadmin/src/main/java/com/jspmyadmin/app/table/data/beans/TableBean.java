package com.jspmyadmin.app.table.data.beans;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class  TableBean {
    Map<String, String> searchColumns = new LinkedHashMap<>();
    Map<String, String> selectedValues = new LinkedHashMap<>();

    public abstract void setList(String column, ArrayList<String> colValues);
    public abstract List<String> getList(String column);

    public abstract Map<String, String> getSearchColumns();
    public abstract Map<String, String> getSelectedValues();
    public abstract ArrayList<String> getSelectColumn();
    public abstract void setSelectedValues(Map<String, String> selectedValues);
}
