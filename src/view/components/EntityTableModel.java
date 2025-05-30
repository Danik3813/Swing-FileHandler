package view.components;

import javax.swing.table.DefaultTableModel;

public class EntityTableModel extends DefaultTableModel {
    public EntityTableModel(String[] TABLE_HEADER) {
        super(TABLE_HEADER, 0);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }
}
