package view;

import javax.swing.table.DefaultTableModel;

public class EntityTableModel extends DefaultTableModel {
    public EntityTableModel(String[] TABLE_HEADER) {
        super(TABLE_HEADER, 0);
    }
}
