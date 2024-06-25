package com.jspmyadmin.app.table.data.util;

import com.jspmyadmin.app.table.data.beans.QnaSearchTableBean;
import com.jspmyadmin.app.table.data.beans.TableBean;
import com.jspmyadmin.framework.web.utils.Bean;

public class TableSearchBeanSelect {
    private String _table;

    public TableSearchBeanSelect(String table) {
        this._table = table;
    }
    public TableBean selectTableBean() {
        if (_table.toLowerCase().equals("qna_table")) {
            return new QnaSearchTableBean();
        }
        return null;
    }
}
