package view;

import javax.swing.table.DefaultTableModel;

public class CSVTableModel extends DefaultTableModel {
    public CSVTableModel(String[] columns) {
        for (String column : columns) {
            this.addColumn(column);
        }
    }
}
